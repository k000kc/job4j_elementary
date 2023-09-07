package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {

    @Test
    void whenEvenThenTrue() {
        int in = 2;
        boolean result = LogicNot.isEven(in);
        assertThat(result).isTrue();
    }

    @Test
    void whenPositiveThentrue() {
        int in = 1;
        boolean result = LogicNot.isPositive(in);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenThenTrue() {
        int in = 3;
        boolean result = LogicNot.notEven(in);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPositiveThenTrue() {
        int in = -2;
        boolean result = LogicNot.notPositive(in);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenAndPositiveThenTrue() {
        int in = 5;
        boolean result = LogicNot.notEvenAndPositive(in);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenOrNotPositiveThenTrue() {
        int in = -4;
        boolean result = LogicNot.evenOrNotPositive(in);
        assertThat(result).isTrue();
    }
}