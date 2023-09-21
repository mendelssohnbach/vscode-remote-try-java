package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        // $5 * 2 = 10
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        // $5 * 3 = 15
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        // $5は他の$5と等価である
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        // $5は$6と等価でない
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        // CHF5は他のCHF5と等価である
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        // CHF5はCHF6と等価でない
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        // CHF5は＄5と等価でない
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
