package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPositionTest {

    @Test
    void searchInsert1() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    }

    @Test
    void searchInsert2() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    }

    @Test
    void searchInsert3() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }

    @Test
    void searchInsert4() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1}, 1)).isEqualTo(0);
    }
}