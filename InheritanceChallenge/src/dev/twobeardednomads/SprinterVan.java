package dev.twobeardednomads;

public class SprinterVan extends Car {

    private String modalName;
    private int maxWeight;
    private boolean is4X4;

    public SprinterVan(String modalName, int maxWeight, boolean is4X4) {
        super(5, 3, 1, 6, 6);
        this.modalName = modalName;
        this.maxWeight = maxWeight;
        this.is4X4 = is4X4;
    }

    public String getModalName() {
        return modalName;
}

    public int getMaxWeight() {
        return maxWeight;
    }

    public boolean isIs4X4() {
        return is4X4;
    }
}
