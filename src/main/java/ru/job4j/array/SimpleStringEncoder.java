package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                result += symbol;
                if (counter > 1) {
                    result += counter;
                }
                counter = 0;
            }
            symbol = input.charAt(i);
            counter++;
        }
        result += symbol;
        if (counter > 1) {
            result += counter;
        }
        return result;
    }
}
