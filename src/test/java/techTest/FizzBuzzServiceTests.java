package techTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzServiceTests {

    private FizzBuzzService objectUnderTest;

    @Before
    public void setup() {
        objectUnderTest = new FizzBuzzService();
    }

    @Test
    public void getFizzBuzz_inputIntegerDivisibleBy3_returnsFizz() {
        assertEquals("Fizz", objectUnderTest.getFizzBuzz(6));
    }

    @Test
    public void getFizzBuzz_inputIntegerDivisibleBy5_returnsBuzz() {
        assertEquals("Buzz", objectUnderTest.getFizzBuzz(20));
    }

    @Test
    public void getFizzBuzz_inputIntegerDivisibleByBoth3And5_returnsFizzBuzz() {
        assertEquals("FizzBuzz", objectUnderTest.getFizzBuzz(45));
    }

    @Test
    public void getFizzBuzz_inputIntegerNotDivisibleByEither3Or5_returnsInputInteger() {
        assertEquals("7", objectUnderTest.getFizzBuzz(7));
    }
}