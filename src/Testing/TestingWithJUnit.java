package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestingWithJUnit {
    @Test
    public void testSum() {
        assertEquals(4, add(2, 2));
    }

    int add(int i, int j) {
        return i + j;
        // return i / j;
        /**
         * the "i/j" will return an error as the result will be 2 whilst the expected
         * value
         * is 4
         */
    }
}
