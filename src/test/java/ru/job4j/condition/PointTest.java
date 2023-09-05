package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distsnce(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13To43Then3() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 4;
        int y2 = 3;
        double expected = 3;
        double out = Point.distsnce(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01To26Then5dot38() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 6;
        double expected = 5.38;
        double out = Point.distsnce(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}