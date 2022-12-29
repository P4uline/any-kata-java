package fr.coderetreat.anykata.anykata.find_duplicates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindDuplicatesTest {

    @Test
    public void should_find_1_from_array_1_4_3_5_6_1_2() {
        FindDuplicates findDuplicates = new FindDuplicates();
        Integer[] array = {1, 4, 3, 5, 6, 1, 2};
        assertThat(findDuplicates.tortoiseAndHareAlgo(array))
                .isEqualTo(1);
    }

    @Test
    public void should_find_4_from_array_4_4_3_5_6_1_2() {
        FindDuplicates findDuplicates = new FindDuplicates();
        Integer[] array = {4, 4, 3, 5, 6, 1, 2};
        assertThat(findDuplicates.tortoiseAndHareAlgo(array))
                .isEqualTo(4);
    }

    @Test
    public void should_find_3_from_array_4_1_3_2_3() {
        FindDuplicates findDuplicates = new FindDuplicates();
        Integer[] array = {4, 1, 3, 2, 3};
        assertThat(findDuplicates.tortoiseAndHareAlgo(array))
                .isEqualTo(3);
    }

    @Test
    public void should_find_1_from_linkedlist_1_4_3_5_6_1_2() {
        // TODO findDuplicates.tortoiseAndHareAlgoWithLinkedList(linkedList)
    }
}
