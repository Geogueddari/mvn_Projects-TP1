package com.Elgaddari;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class MessageTest {
    @Test
    public void testMessageClass() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Message message = new Message();
        message.displayHelloWorld();

        assertEquals("hello from Message class", outContent.toString().trim());
    }
}
