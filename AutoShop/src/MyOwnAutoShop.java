public class MyOwnAutoShop {
    public static void main(String[] args) {

        Truck truck = new Truck(100,100000,"Black");
        Ford ford1 = new Ford(220,30000,"Blue",1000);
        Ford ford2 = new Ford(220,35000,"White",1000);
        Car car = new Car(220,4000,"Yellow");
        Sedan sedan = new Sedan(220,10000,"Black", 6);


        System.out.println("Truck sale price is: " + truck.getSalePrice());
        System.out.println("Ford 1 sale price is: " + ford1.getSalePrice());
        System.out.println("Ford 2 sale price is: " + ford2.getSalePrice());
        System.out.println("Car sale price is: " + car.getSalePrice());
        System.out.println("Sedan sale price is: " + sedan.getSalePrice());
    }
}
