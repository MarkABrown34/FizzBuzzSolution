package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void itReturnsTheNumberWhenTheNumberIsNotDivisibleByThreeOrFive() {
        Assert.assertEquals("1", fizzBuzz.calculate(1));
        Assert.assertEquals("2", fizzBuzz.calculate(2));
        Assert.assertEquals("4", fizzBuzz.calculate(4));
    }

    @Test
    public void itReturnsFizzWhenANumberIsDivisibleByThree() {
        Assert.assertEquals("fizz", fizzBuzz.calculate(3));
        Assert.assertEquals("fizz", fizzBuzz.calculate(6));
        Assert.assertEquals("fizz", fizzBuzz.calculate(9));
    }

    @Test
    public void itReturnsBuzzWhenANumberIsDivisibleByFive() {
        Assert.assertEquals("buzz", fizzBuzz.calculate(5));
        Assert.assertEquals("buzz", fizzBuzz.calculate(10));
        Assert.assertEquals("buzz", fizzBuzz.calculate(20));
    }

    @Test
    public void itReturnsFizzBuzzWhenANumberIsDivisibleByThreeAndFive() {
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(15));
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(30));
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(45));
    }
}