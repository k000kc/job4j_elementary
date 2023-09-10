package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] date, int el) {
        int rsl = -1;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static int indexInRange(int[] date, int el, int start, int finish) {
        int rsl = -1;
        for (int i = start; i <= finish; i++) {
            if (date[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
