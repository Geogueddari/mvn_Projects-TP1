package com.Elgaddari;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemperatureTest {
    @Test
    public void testTemperatureConversion() {
        Temperature temperature = new Temperature();
        assertEquals((double) ((9 / 5) * 100 + 32), temperature.convertCelciusToFahrenheit(100),0.0001);

    }

}
