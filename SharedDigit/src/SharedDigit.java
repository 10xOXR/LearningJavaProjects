public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if ((numOne < 10 || numOne > 99) || (numTwo < 10 || numTwo > 99)) {
            return false;
        }
        int firstDigit = numOne % 10;
        int secondDigit = numOne / 10;
        int thirdDigit = numTwo % 10;
        int fourthDigit = numTwo / 10;

        return (firstDigit == thirdDigit || firstDigit == fourthDigit) || (secondDigit == thirdDigit || secondDigit == fourthDigit);
    }
}
