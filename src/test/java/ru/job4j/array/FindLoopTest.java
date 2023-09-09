package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] date = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(date, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas10ThenMinus1() {
        int[] date = new int[] {5, 8, 4};
        int el = 10;
        int result = FindLoop.indexOf(date, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}