import org.junit.Test;

import static org.junit.Assert.*;

public class SquareUpTest {

    @Test
    public void testSquareUp() throws Exception {
        SquareUp squareUp = new SquareUp();
        assertArrayEquals(new int[]{1}, squareUp.squareUp(1));
        assertArrayEquals(new int[]{0, 1, 2, 1}, squareUp.squareUp(2));
        assertArrayEquals(new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}, squareUp.squareUp(3));
        assertArrayEquals(new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}, squareUp.squareUp(4));
    }
}