public class GeneratorApp {

    public static void main(String args[]) {
        PrimeNumberGenerator primeNumberGenerator = new PrimeGenerator();

        if (args.length != 2) {
            System.out.println("Error: enter 2 integers.");
        } else {
            try {
                int startValue = Integer.parseInt(args[0]);
                int endValue = Integer.parseInt(args[1]);
                System.out.println(primeNumberGenerator.generate(startValue, endValue));
            } catch (Exception e) {
                System.out.println("Error computing input. Stack trace: ");
                e.printStackTrace();
            }
        }
    }
}
