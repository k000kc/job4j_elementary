package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] date) {
        int[] result = new int[date.length];
        for (int i = 0; i < date.length; i++) {
            int min = MinDiapason.findMin(date, i, date.length - 1);
            int index = FindLoop.indexInRange(date, min, i, date.length - 1);
            result = SwitchArray.swap(date, i, index);
        }
        return result;
    }
}
