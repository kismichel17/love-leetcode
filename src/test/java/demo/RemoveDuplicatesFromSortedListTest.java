package demo;

import org.junit.jupiter.api.Test;
import util.ListNode;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedListTest {

    @Test
    void deleteDuplicates1() {
        assertThat(ListNode.getValues(RemoveDuplicatesFromSortedList.deleteDuplicates(ListNode.of(new ArrayList<>(List.of(1, 1, 2))))))
                .isEqualTo(List.of(1, 2));
    }

    @Test
    void deleteDuplicates2() {
        assertThat(ListNode.getValues(RemoveDuplicatesFromSortedList.deleteDuplicates(ListNode.of(new ArrayList<>(List.of(1, 1, 2, 3, 3))))))
                .isEqualTo(List.of(1, 2, 3));
    }
}