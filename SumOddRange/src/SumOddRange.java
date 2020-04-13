public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }
        return !(number % 2 == 0);
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if ((start > 0 && end > 0) && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
