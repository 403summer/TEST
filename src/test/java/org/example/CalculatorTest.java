package org.example;

import junit.framework.TestCase;

public class CalculatorTest {
    public void testAddTrue() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5,5);
        int expectedValue = 10;

        assert(actualValue == expectedValue);
    }

    public void testAddFslse() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5,10);
        int expectedValue = 5;

        assert(actualValue != expectedValue);

    }
}