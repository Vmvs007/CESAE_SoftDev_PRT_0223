package poo_fp11.BikeStore;

public class Bicycle {

    private int id, numberOfGears;
    private double wheelSize, bikeLenght,price;
    private String mainColor;
    private boolean adjustableSeatpost;

    public Bicycle(int id, int numberOfGears, double wheelSize, double bikeLenght, double price, String mainColor, boolean adjustableSeatpost) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.wheelSize = wheelSize;
        this.bikeLenght = bikeLenght;
        this.price = price;
        this.mainColor = mainColor;
        this.adjustableSeatpost = adjustableSeatpost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public double getBikeLenght() {
        return bikeLenght;
    }

    public void setBikeLenght(double bikeLenght) {
        this.bikeLenght = bikeLenght;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public boolean isAdjustableSeatpost() {
        return adjustableSeatpost;
    }

    public void setAdjustableSeatpost(boolean adjustableSeatpost) {
        this.adjustableSeatpost = adjustableSeatpost;
    }
}
