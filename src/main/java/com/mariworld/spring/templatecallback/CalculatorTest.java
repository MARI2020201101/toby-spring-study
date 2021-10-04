package com.mariworld.spring.templatecallback;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCal(){
        Calculator calculator = new Calculator();
        String filePath ="./sums.txt";
        int sum = calculator.calculate(filePath);
        Assert.assertEquals(10,sum);
    }
}
