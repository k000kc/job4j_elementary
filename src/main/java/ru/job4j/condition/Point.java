package ru.job4j.condition;

public class Point {

    public static double distsnce(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distsnce(2, 2, 10, 12);
        System.out.println("result (2, 2) to (10, 12) " + result);
    }
}
