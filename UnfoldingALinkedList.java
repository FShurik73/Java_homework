import java.util.Iterator;;

public class UnfoldingALinkedList {
    public static void main(String[] args) {
        SingleLinkList<Contact> contactList = new SingleLinkList<>();

        contactList.addToEnd(new Contact(234, "Иванов Иван Иваныч", "+79682355814"));
        contactList.addToEnd(new Contact(543, "Горбачев Михаил Сергеевич", "+79854146458"));
        contactList.addToEnd(new Contact(465, "Ельцин Борис Николаевич", "+79765946824"));
        contactList.addToEnd(new Contact(876, "Хрущев Никита Сергеевич", "+79152976852"));
        contactList.addToEnd(new Contact(978, "Ленин Владимир Ильич", "+79109586437"));
        
        for (Object contact : contactList) {
            System.out.println(contact);
        }
        contactList.reverse();

        System.out.println("------------------------------------------------------------");

        for(Object contact : contactList) {
            System.out.println(contact);
        }
    }

    static class Contact {
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact {" +
            " id = " + id +
            ", name = '" + name + '\'' +
            ", phone = '" +  phone + '\'' +
            '}';
        }
    }
    /**
     * Класс списка
     * 
     * @param <T>
     */
    public static class SingleLinkList<T> implements Iterable {
        ListItem<T> head;
        ListItem<T> tail;

        @Override
        public Iterator iterator() {
            return new Iterator<T>() {
                ListItem<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.next; 
                    return data;
                }
            };
        }
    
        /**
         * Класс отдельного элемента
         * 
         * @param <T>
         */
        private static class ListItem<T> {
            T data;
            ListItem<T> next;
        }

        // Проверка на то, пустая ли голова
        public boolean isEmpty() {
            return head == null;
        }

        // Заполнение списка
        public void addToEnd(T item) {

            // Выделение  памяти для списка
            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;

            // Если голова и хвост пустая, то присваиваем newItem
            if (isEmpty()) {
                head = newItem;
                tail = newItem;

            // Если не пустая, то передаем элементу адрес и ставим его в хвост
            } else {
                tail.next = newItem;
                tail = newItem;
            }
        }

        // Метод разворота списка
        public void reverse() {
            if (!isEmpty() && head.next != null) { // Если не пксто и голова не равна нулю
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;
                while (current != null) {
                    ListItem<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                } 
            }
        }
    }
}

