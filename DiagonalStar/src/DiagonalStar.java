public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(7);
    }

    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int row = 1;
            int column = 1;

            while (row <= number) {
                if (row == 1 || row == number) {
                    while (column <= number) {
                        System.out.print("*");
                        column++;
                    }
                }
                while (column <= number) {
                    if (column == 1 || column == number || column == row || column == (number - (row -1))) {
                        System.out.print("*");
                    } else System.out.print(" ");
                    column++;
                }
                row++;
                column = 1;
                System.out.println();
            }
        }
    }
}
