import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator implements PrimeNumberGenerator{

    public boolean isPrime(int value) {
        if (value < 2) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primeList = new ArrayList<>();
        int start, end;

        if (startingValue > endingValue) {
            start = endingValue;
            end = startingValue;
        } else {
            start = startingValue;
            end = endingValue;
        }

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) primeList.add(i);
            if (i == Integer.MAX_VALUE) break;
        }

        return primeList;
    }

}
