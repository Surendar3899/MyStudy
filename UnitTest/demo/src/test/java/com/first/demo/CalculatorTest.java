package com.first.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.first.demo.service.Calculator;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testDivide(){
        assertEquals(4,calculator.divide(3,7));
    }
}
