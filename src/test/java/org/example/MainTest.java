package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add() {
        int num1 = 2, num2 =2;
        int total = num1 + num2;
        assertEquals(4, total);
    }

    @Test
    void minus() {
        int num1 = 4, num2 =2;
        int total = num1 - num2;
        assertEquals(2, total);
    }

    @Test
    void multiply() {
        int num1 = 4, num2 =2;
        int total = num1 * num2;
        assertEquals(8, total);
    }

    @Test
    void divide() {
        int num1 = 3, num2 =3;
        int total = num1 / num2;
        assertEquals(1, total);
    }
}