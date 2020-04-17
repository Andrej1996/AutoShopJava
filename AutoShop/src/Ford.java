public class Ford extends Car {

    int year = 0;
    int manufacturerDiscount = 0;

    public Ford(int speed, double regularPrice, String color, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        System.out.print("With manufactured discount ");
        return regularPrice - manufacturerDiscount;
    }
}
