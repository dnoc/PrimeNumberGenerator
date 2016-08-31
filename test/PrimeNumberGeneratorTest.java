import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeNumberGeneratorTest {
    PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setup() {
        primeNumberGenerator = new PrimeNumberGenerator();
    }

    @Test
    public void whenLessThanTwoIsEnteredItReturnsNothing() {
        List<Integer> output = new ArrayList<>();
        assertEquals(output, primeNumberGenerator.generate(0, 1));
    }

    @Test
    public void whenANegativeIsEnteredItReturnsNothing() {
        List<Integer> output = new ArrayList<>();
        assertEquals(output, primeNumberGenerator.generate(-3, -3));
    }

    @Test
    public void whenANegativeRangeIsEnteredItReturnsNoNegatives() {
        List<Integer> output = Arrays.asList(2, 3);
        assertEquals(output, primeNumberGenerator.generate(-5, 3));
    }

    @Test
    public void whenTwoIsEnteredItReturnsTwo() {
        List<Integer> output = Arrays.asList(2);
        assertEquals(output, primeNumberGenerator.generate(2, 2));
    }

    @Test
    public void whenFourIsEnteredItReturnsNothing() {
        List<Integer> output = new ArrayList<>();
        assertEquals(output, primeNumberGenerator.generate(4, 4));
    }

    @Test
    public void whenTwoThroughTenIsEnteredItReturnsPrimes() {
        List<Integer> output = Arrays.asList(2, 3, 5, 7);
        assertEquals(output, primeNumberGenerator.generate(2, 10));
    }

    @Test
    public void whenOneThroughHundredIsEnteredItReturnsPrimes() {
        List<Integer> output = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        assertEquals(output, primeNumberGenerator.generate(1, 100));
    }

    @Test
    public void whenMaxValueIsEnteredItReturnsMaxValue() {
        List<Integer> output = Arrays.asList(Integer.MAX_VALUE);
        assertEquals(output, primeNumberGenerator.generate(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}
