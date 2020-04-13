public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 1;
        int largestCommonDivisor = 1;
        while (divisor <= first && divisor <= second) {
            if (first % divisor == 0 && second % divisor == 0) {
                largestCommonDivisor = divisor;
            }
            divisor++;
        }
        return largestCommonDivisor;
    }
}
