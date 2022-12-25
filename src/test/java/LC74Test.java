import static org.junit.Assert.*;

public class LC74Test {

    @org.junit.Test
    public void searchMatrix() {
        boolean actual1 = LC74.searchMatrix(new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3);
        boolean actual2 = LC74.searchMatrix(new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 13);

        assertTrue(actual1);
        assertFalse(actual2);

    }
}