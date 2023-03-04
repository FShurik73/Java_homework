package Homework5;

import java.util.LinkedList;
import java.util.Queue;

public class Task5 {
    public static void main(String[] args) {
        var mg = new MapGenerator();
        System.out.println(
            new MapPrinter().mapColor(mg.getMap())
        );

        var lee = new WaveAlgoritm(mg.getMap());
        lee.Colorize(new Point2D(3, 3));
        System.out.println(
            new MapPrinter().rawData(mg.getMap())
        );

        var exi = new WaveAlgoritm(mg.getMap());
        exi.getRoad(new Point2D(15, 21));
        System.out.println(
            new MapPrinter().mapColor(mg.getMap())
        );
        System.out.println(
            new MapPrinter().rawData(mg.getMap())
        );
    }
}

class Point2D {
    int x, y;
 
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %d  y: %d", x, y);
    }
}

class MapGenerator {
    int[][] map;

    public MapGenerator() {
        int[][] map = {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, -1, -1, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };

        this.map = map;
    }

    public int[][] getMap() {
        return map;
    }
}

class MapPrinter {
    public MapPrinter() {
    }

    public String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%5d", map[row][col]));
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }

    public String mapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
           for (int col = 0; col < map[row].length; col++) {
            switch (map[row][col]) {
                case 0:
                    sb.append("--");
                    break;
                case -1:
                    sb.append("▓▓");
                    break;
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33:
                    sb.append("--");
                    break;
                case -3:
                    sb.append("<>");
                    break;    
                default:
                    break;
            }
           }
           sb.append("\n");  
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");   
        }
        return sb.toString();
    }
}

class WaveAlgoritm {
    int[][] map;

    public WaveAlgoritm(int[][] map) {
        this.map = map;
    }

    public void Colorize(Point2D startPoint) {
        Queue<Point2D> queue = new LinkedList<Point2D>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (queue.size() != 0) {
            Point2D p = queue.remove();

            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
    }

    public void getRoad(Point2D exitPoint) {
        
        Queue<Point2D> road = new LinkedList<>();
        road.add(exitPoint);
        map[exitPoint.x][exitPoint.y] = 31;

        while (road.size() != 0) {
            Point2D p1 = road.remove();

            if (map[p1.x - 1][p1.y] == map[p1.x][p1.y] - 1) {
                road.add(new Point2D(p1.x - 1, p1.y));
                map[p1.x][p1.y] = -3;
            }
            if (map[p1.x][p1.y - 1] == map[p1.x][p1.y] - 1) {
                road.add(new Point2D(p1.x, p1.y - 1));
                map[p1.x][p1.y] = -3;
            }
            if (map[p1.x + 1][p1.y] == map[p1.x][p1.y] - 1) {
                road.add(new Point2D(p1.x + 1, p1.y));
                map[p1.x][p1.y] = -3;
            }
            if (map[p1.x][p1.y + 1] == map[p1.x][p1.y] - 1) {
                road.add(new Point2D(p1.x, p1.y + 1));
                map[p1.x][p1.y] = -3;
            }
        }
    }
}