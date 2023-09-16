package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Doller five = new Doller(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
