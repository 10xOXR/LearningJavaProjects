public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(0);
        System.out.println(getDigitCount(0));
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int lastDigit = 0;
        int originalInputCount = getDigitCount(number);
        int reversedInputCount = getDigitCount(reverse(number));
        int input = reverse(number);

        StringBuilder outputString = new StringBuilder();
        if (number == 0) {
            outputString.append("Zero").append(" ");
        } else {
            while (input > 0) {
                lastDigit = input % 10;
                switch (lastDigit) {
                    case 0:
                        outputString.append("Zero").append(" ");
                        break;
                    case 1:
                        outputString.append("One").append(" ");
                        break;
                    case 2:
                        outputString.append("Two").append(" ");
                        break;
                    case 3:
                        outputString.append("Three").append(" ");
                        break;
                    case 4:
                        outputString.append("Four").append(" ");
                        break;
                    case 5:
                        outputString.append("Five").append(" ");
                        break;
                    case 6:
                        outputString.append("Six").append(" ");
                        break;
                    case 7:
                        outputString.append("Seven").append(" ");
                        break;
                    case 8:
                        outputString.append("Eight").append(" ");
                        break;
                    case 9:
                        outputString.append("Nine").append(" ");
                        break;
                    default:
                        System.out.println("Invalid Value");
                }
                input /= 10;
            }
        }

        for (int i = reversedInputCount; i < originalInputCount; i++) {
            outputString.append("Zero").append(" ");
        }

        if (outputString.length() > 0) {
            outputString.setLength(outputString.length() - 1);
        }
        System.out.println(outputString.toString());
    }

    public static int reverse (int number) {
        int reversed = 0;

        while (number != 0) {
            reversed *= 10;
            reversed += (number % 10);
            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        if (number == 0) {
            count++;
        } else {
            while (number > 0) {
                count++;
                number /= 10;
            }
        }
        return count;
    }
}
