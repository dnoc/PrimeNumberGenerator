import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeNumberGeneratorTest {
    PrimeNumberGenerator primeGenerator;

    @Before
    public void setup() {
        primeGenerator = new PrimeGenerator();
    }

    @Test
    public void whenLessThanTwoIsEnteredItReturnsNothing() {
        List<Integer> output = new ArrayList<>();
        assertEquals(output, primeGenerator.generate(0, 1));
    }

    @Test
    public void whenANegativeIsEnteredItReturnsNothing() {
        List<Integer> output = new ArrayList<>();
        assertEquals(output, primeGenerator.generate(-3, -3));
    }

    @Test
    public void whenANegativeRangeIsEnteredItReturnsNoNegatives() {
        List<Integer> output = Arrays.asList(2, 3);
        assertEquals(output, primeGenerator.generate(-5, 3));
    }

    @Test
    public void whenTwoIsEnteredItReturnsTwo() {
        List<Integer> output = Arrays.asList(2);
        assertEquals(output, primeGenerator.generate(2, 2));
    }

    @Test
    public void whenFourIsEnteredItReturnsNothing() {
        List<Integer> output = new ArrayList<>();
        assertEquals(output, primeGenerator.generate(4, 4));
    }

    @Test
    public void whenTwoThroughTenIsEnteredItReturnsPrimes() {
        List<Integer> output = Arrays.asList(2, 3, 5, 7);
        assertEquals(output, primeGenerator.generate(2, 10));
    }

    @Test
    public void whenOneThrough101IsEnteredItReturnsPrimes() {
        List<Integer> output = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101);
        assertEquals(output, primeGenerator.generate(1, 101));
    }

    @Test
    public void whenMaxValueIsEnteredItReturnsMaxValue() {
        List<Integer> output = Arrays.asList(Integer.MAX_VALUE);
        assertEquals(output, primeGenerator.generate(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void when7900Through7920IsEnteredItReturnsPrimes() {
        List<Integer> output = Arrays.asList(7901, 7907, 7919);
        assertEquals(output, primeGenerator.generate(7900, 7919));
    }

    @Test
    public void whenTwoThroughTenIsEnteredInReverseOrderItReturnsPrimes() {
        List<Integer> output = Arrays.asList(2, 3, 5, 7);
        assertEquals(output, primeGenerator.generate(10, 2));
    }

    @Test
    public void whenOneThroughHundredIsEnteredInReverseOrderItReturnsPrimes() {
        List<Integer> output = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101);
        assertEquals(output, primeGenerator.generate(101, 1));
    }
}
