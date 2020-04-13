public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int divisor = 1;
        StringBuilder factors = new StringBuilder();
        while (divisor <= number) {
            if (number % divisor == 0) {
                factors.append(" ").append(divisor);
            }
            divisor++;
        }
        System.out.println(factors.toString());
    }
}
