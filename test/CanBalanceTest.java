import org.junit.Test;

import static org.junit.Assert.*;

public class CanBalanceTest {

    @Test
    public void testCanBalance() throws Exception {
        CanBalance balance = new CanBalance();
        assertEquals(true, balance.canBalance(new int[]{5, 4, 9, 4, 9, 5}));
        assertEquals(true, balance.canBalance(new int[]{1, 1, 1, 2, 1}));
        assertEquals(false, balance.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertEquals(true, balance.canBalance(new int[]{10, 10}));
    }
}