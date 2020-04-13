public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int start = number;

        while (number != 0) {
            reversed *= 10;
            reversed += (number % 10);
            number /= 10;
        }
        return reversed == start;
    }
}
