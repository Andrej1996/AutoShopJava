public class Sedan extends Car {


    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    int length = 0;

    @Override
    public double getSalePrice() {
        if (length > 4) {
            System.out.print("With 5% discount ");
            regularPrice = regularPrice - (regularPrice * 0.05);

        } else {
            System.out.print("With 10% discount ");
            regularPrice = regularPrice - (regularPrice * 0.10);
        }
        return regularPrice;
    }
}
