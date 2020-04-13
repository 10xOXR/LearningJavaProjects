public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(0));;
    }

    private static int getLargestPrime (int number) {

        int largestPrime = -1;

        for (int i = 2; i <= number; i++) {
            if (number == 1 || number < largestPrime) {
                break;
            }
            while (number % i == 0) {
                number /= i;
                largestPrime = i;
            }
        }
        return largestPrime;

    }
}
