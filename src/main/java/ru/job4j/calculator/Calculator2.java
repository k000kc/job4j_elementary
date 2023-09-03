package ru.job4j.calculator;

public class Calculator2 {

    public static void plus(int first, int second) {
        System.out.println(first + second);
    }

    public static void minus(int first, int second) {
        System.out.println(first - second);
    }

    public static void main(String[] args) {
        plus(5, 6);
        minus(7, 2);
    }
}
