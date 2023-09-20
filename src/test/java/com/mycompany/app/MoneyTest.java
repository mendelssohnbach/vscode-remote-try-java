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
        assertEquals(new Dollar(10), five.times(2));
        // $5 * 3 = 15
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        // $5は他の$5と等価である
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        // $5は$6と等価でない
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        // CHF5は他のCHF5と等価である
        assertTrue(new Franc(5).equals(new Franc(5)));
        // CHF5はCHF6と等価でない
        assertFalse(new Franc(5).equals(new Franc(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
