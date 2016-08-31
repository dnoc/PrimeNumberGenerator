import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

    private boolean isPrime(int value) {
        if (value == 2) return true;
        return false;
    }

    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primeList = new ArrayList<>();

        if (isPrime(startingValue)) {
            primeList.add(startingValue);
        }

        return primeList;
    }

}
