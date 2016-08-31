import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

    private boolean isPrime(int value) {
        if (value < 2) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primeList = new ArrayList<>();

        for (int i = startingValue; i <= endingValue; i++) {
            if (isPrime(i)) primeList.add(i);
        }

        return primeList;
    }

}
