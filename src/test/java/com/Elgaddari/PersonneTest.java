package com.Elgaddari;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class PersonneTest {
    @Test
    public void testMessageClass() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Personne student = new Personne("student", 20);

        assertEquals("Name : " + student.getName() + " , Age : " + student.getAge(), student.displayInfos());

        student.setName("abdeljabbar");
        student.setAge(21);

        assertEquals("Name : " + student.getName() + " , Age : " + student.getAge(), student.displayInfos());
    }
}
