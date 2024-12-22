package com.Elgaddari;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {

    @Test
    public void testAddition() {
        Calculate calculate = new Calculate();
        assertEquals(10+5, calculate.add(10, 5));

    }

}
