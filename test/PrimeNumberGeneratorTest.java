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
}
