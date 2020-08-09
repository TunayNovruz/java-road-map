package Enum;

public enum Car {
    Ford(15000),Fiat(10000),Kia(6000);
    private int price;
    Car(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
