import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortAlgorithmsTest {

    @Test
    public void testInsertionSort() {
        Integer[] array = {5, 2, 9, 1, 5, 6};
        Integer[] expected = {1, 2, 5, 5, 6, 9};

        SortAlgorithms.insertionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSort() {
        Integer[] array = {10, -1, 2, 5, 0, 6, 4};
        Integer[] expected = {-1, 0, 2, 4, 5, 6, 10};

        SortAlgorithms.mergeSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }
}