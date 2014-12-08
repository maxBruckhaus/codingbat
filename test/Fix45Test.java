import static org.junit.Assert.*;

public class Fix45Test {

    @org.junit.Test
    public void testFix45() throws Exception {
        Fix45 f = new Fix45();
        assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9}, f.fix45(new int[]{5, 4, 9, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1}, f.fix45(new int[]{1, 4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5}, f.fix45(new int[]{1, 4, 1, 5, 5, 4, 1}));
        assertArrayEquals(new int[]{1, 1, 4, 5, 4, 5}, f.fix45(new int[]{5, 5, 4, 1, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 2}, f.fix45(new int[]{4, 2, 4, 5, 5}));
    }
}