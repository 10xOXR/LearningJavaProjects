public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit;
        int lastDigit = number % 10;
        int reversed = 0;
        while (number != 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        firstDigit = reversed % 10;
        return firstDigit + lastDigit;
    }
}
