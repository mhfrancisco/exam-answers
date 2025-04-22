import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsTest {

    @Test
    public void testSubarrayFound() {
        int[] main = {4, 9, 3, 7, 8};
        int[] sub = {3, 7};
        assertEquals(2, ArrayUtils.findSubarrayIndex(main, sub));
    }

    @Test
    public void testSubarrayNotFound() {
        int[] main = {4, 9, 3, 7, 8};
        int[] sub = {7, 3};
        assertEquals(-1, ArrayUtils.findSubarrayIndex(main, sub));
    }

    @Test
    public void testEmptySubarray() {
        int[] main = {1, 2, 3};
        int[] sub = {};
        assertEquals(-1, ArrayUtils.findSubarrayIndex(main, sub));
    }

    @Test
    public void testSubarrayAtStart() {
        int[] main = {1, 2, 3, 4};
        int[] sub = {1, 2};
        assertEquals(0, ArrayUtils.findSubarrayIndex(main, sub));
    }

    @Test
    public void testSubarrayAtEnd() {
        int[] main = {5, 6, 7, 8};
        int[] sub = {7, 8};
        assertEquals(2, ArrayUtils.findSubarrayIndex(main, sub));
    }

    @Test
    public void testSubarrayLongerThanMain() {
        int[] main = {1, 2};
        int[] sub = {1, 2, 3};
        assertEquals(-1, ArrayUtils.findSubarrayIndex(main, sub));
    }

    @Test
    public void testIdenticalArrays() {
        int[] main = {3, 4, 5};
        int[] sub = {3, 4, 5};
        assertEquals(0, ArrayUtils.findSubarrayIndex(main, sub));
    }
}