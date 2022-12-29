package fr.coderetreat.anykata.anykata.quick_sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSorterTest {

    private QuickSorter quickSorter = new QuickSorter();

    @Test
    public void should_sort_quickly_empty_array() {
        int[] tab = {};
        quickSorter.sort(0, tab.length - 1, tab);
        Assertions.assertThat(tab).isSorted();
    }

    @Test
    public void should_sort_quickly_array_of_size_1() {
        int[] tab = { 12 };
        quickSorter.sort(0, tab.length - 1, tab);
        Assertions.assertThat(tab).isSorted();
    }

    @Test
    public void should_sort_quickly_tab3() {
        int[][] tab = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};

        for (int i = 0; i < tab.length; i ++) {
            System.out.println("*************");
            quickSorter.printTab(tab[i]);
            quickSorter.sort(0, tab[i].length - 1, tab[i]);
            Assertions.assertThat(tab[i]).isSorted();
        }
    }

    @Test
    public void should_sort_quickly_1() {
        int[] tab = {10, 80, 30, 90, 40, 50, 70};
        quickSorter.sort(0, tab.length - 1, tab);
        Assertions.assertThat(tab).isSorted();
    }

    @Test
    public void should_sort_quickly_2() {
        int[] tab = {2, 4};
        quickSorter.sort(0, tab.length - 1, tab);
        Assertions.assertThat(tab).isSorted();
    }

    @Test
    public void should_sort_quickly_3() {
        int[] tab = {5, 4, 3, 2, 1};
        quickSorter.sort(0, tab.length - 1, tab);
        Assertions.assertThat(tab).isSorted();
    }

    @Test
    public void should_sort_quickly() {
        int[] tab = {4, 2, 6, 3, 9};
        quickSorter.sort(0, tab.length - 1, tab);
        Assertions.assertThat(tab).isSorted();
    }
}
