public class DigitSumChallenge {

    public static int sumDigits(int number) {
        if (number >= 10) {
            int remaining = number;
            int sum = 0;
            while (remaining > 0) {
                sum += (remaining % 10);
                remaining /= 10;
            }
            return sum;
        }
        return -1;
    }
}