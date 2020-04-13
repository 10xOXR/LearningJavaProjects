package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
	    double firstValue = 20.00d;
	    double secondValue = 80.00d;
	    double sumValue = (firstValue + secondValue) * 100;
        double remainValue = sumValue % 40.00d;

        boolean remainBool = (remainValue == 0) ? true : false;
        System.out.println(remainBool);

        if (!remainBool) {
            System.out.println("Got some remainder.");
        }

    }
}
