import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeNumberGeneratorTest {
    PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setup() {
        primeNumberGenerator = new PrimeNumberGenerator();
    }

    @Test
    public void whenTwoIsEnteredItReturnsTwo() {
        List<Integer> output = new ArrayList<>();
        output.add(2);
        assertEquals(output, primeNumberGenerator.generate(2, 2));
    }

    @Test
    public void whenFourIsEnteredItReturnsNothing() {
        List<Integer> output = new ArrayList<>();
        assertEquals(output, primeNumberGenerator.generate(4, 4));
    }

    @Test
    public void whenTwoThroughTenIsEnteredItReturnsPrimes() {
        List<Integer> output = new ArrayList<>();
        output.add(2);
        output.add(3);
        output.add(5);
        output.add(7);
        assertEquals(output, primeNumberGenerator.generate(2, 10));
    }

}
