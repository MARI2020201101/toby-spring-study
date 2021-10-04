package com.mariworld.spring.templatecallback;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CalculatorTest {

    private Calculator calculator;
    private String filePath;

    @Before
    public void setUp(){
        calculator = new Calculator();
        filePath = "./sums.txt";
    }

    @Test
    public void testCal() throws FileNotFoundException {
        int sum = calculator.calculate(filePath,new SumBRCallback());
        Assert.assertEquals(10,sum);
    }
    @Test
    public void testCal2() throws FileNotFoundException {
        int multiply = calculator.calculate(filePath,new MultiplyBRCallback());
        Assert.assertEquals(24,multiply);
    }

    @Test
    public void testLineSumcal(){
        //클라이언트는 내부 로직은 모르고, 메소드만 호출한다.
        //바깥에서 해당 콜백안넣어줘도 이미 다 구현됨...!!! 쩐다-
        int val = calculator.calcSum(filePath);
        Assert.assertEquals(10,val);
    }
}
