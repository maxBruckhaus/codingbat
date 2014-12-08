import org.junit.Test;

import static org.junit.Assert.*;

public class LinearInTest {

    @Test
    public void testLinearIn() throws Exception {
        LinearIn linear = new LinearIn();
        assertEquals(true, linear.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        assertEquals(false, linear.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        assertEquals(false, linear.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}));
    }
}