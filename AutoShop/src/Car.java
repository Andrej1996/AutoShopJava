public class Car {

    int speed = 0;
    double regularPrice = 0;
    String color = " ";

    public double getSalePrice() {
        return regularPrice;
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

}
