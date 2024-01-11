package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("What the calculator should do")
public class CalculatorTests {

    @Test
    @DisplayName("add two nums")
    void addSum() {
        int addnumSum = Calculator.add(2, 4);
        assertEquals(6, addnumSum);
    }

    @Test
    @DisplayName("divide nums")
    void sumDivide() {
        int divideSum = Calculator.divide(6,2);
        assertEquals(3, divideSum);
    }

    //test to catch errors where dividing by zero
    @Test
    @DisplayName("arithmetic exception division by zero")
    void setArithmeticException() {
    Exception arythmaticException = assertThrows(ArithmeticException.class, () -> Calculator.divide(1,0));

    assertEquals("/ by zero", arythmaticException.getMessage());
}

@Test
    @DisplayName("sum of multiplication")

    void multiplySum () {
        int multiplySum = Calculator.multiply(2,2);
        assertEquals(4, multiplySum);
}
}

