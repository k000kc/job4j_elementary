package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] date) {
        for (int i = 0; i < date.length; i++) {
            int min = MinDiapason.findMin(date, i, date.length - 1);
            int index = FindLoop.indexInRange(date, min, i, date.length - 1);
            date = SwitchArray.swap(date, i, index);
        }
        return date;
    }
}
