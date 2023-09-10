package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when3ElementsThenSort() {
        int[] data = new int[] {4, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when6ElementsThenSort() {
        int[] data = new int[] {1, 4, 3, 6, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 1, 3, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }
}