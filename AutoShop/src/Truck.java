public class Truck extends Car {
    int weight = 0;


    public Truck(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            System.out.print("With 10% discount ");
            regularPrice = regularPrice - (regularPrice * 0.1);
        } else {
            System.out.print("With 20% discount ");
            regularPrice = regularPrice - (regularPrice * 0.2);
        }
        return regularPrice;
    }
}
