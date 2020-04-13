package dev.twobeardednomads;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double floorArea = this.floor.getArea();
        double carpetCost = this.carpet.getCost();

        return floorArea * carpetCost;
    }
}
