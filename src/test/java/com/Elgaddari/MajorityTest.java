package com.Elgaddari;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityTest {
    @Test

    public void testMajority(){
        Majority majority= new Majority();

        assertEquals(false, majority.isMajor(15));
        assertEquals(true, majority.isMajor(20));
    }
}
