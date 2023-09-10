package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] date) {
        boolean result = true;
        for (boolean element : date) {
            boolean ref = date[0];
            if (ref != element) {
                result = false;
                break;
            }
        }
        return result;
    }
}
