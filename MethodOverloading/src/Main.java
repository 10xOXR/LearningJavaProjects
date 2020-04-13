public class Main {

    public static void main(String[] args) {
        double centimetres = calcFeetAndInchesToCentimetres(6, 0);
        double altCentimetres = calcFeetAndInchesToCentimetres(72);

        System.out.println("Method 1 output = " + centimetres + " cm");
        System.out.println("Method 2 output = " + altCentimetres + " cm");
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches < 12) {
            return ((feet * 12) * 2.54) + (inches * 2.54);
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches >= 0) {
            double feet = Math.floor(inches / 12);
            double remainingInches = inches % 12;
            return calcFeetAndInchesToCentimetres(feet, remainingInches);
        }
        return -1;
    }
}
