package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        // $5 * 2 = 10
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        // $5 * 3 = 15
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        // $5は他の$5と等価である
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        // $5は$6と等価でない
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
