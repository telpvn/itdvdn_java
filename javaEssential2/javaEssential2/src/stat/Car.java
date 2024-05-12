package stat;

public class Car {
    String model;
    String color;

   static double count;

    public static void main(String[] args) {
        Car.count = 1;
        Car.count = 2;
        Car.count = 100;
    }
}
