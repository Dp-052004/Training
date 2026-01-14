package inheritance;

public class Vehicle1 {

    String color;

    // Constructor for Vehicle
    Vehicle1(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

        // Vehicle object
        Vehicle1 v = new Vehicle1("Black");
        System.out.println(v.color);

        // Bike object
        Bike b = new Bike("Red", "Yamaha", 150000);
        System.out.println("\nBike Details:");
        System.out.println(b.color);
        System.out.println(b.brand);
        System.out.println(b.price);

        // Car object
        Car c = new Car("White", "Honda", 1200000);
        System.out.println("\nCar Details:");
        System.out.println(c.color);
        System.out.println(c.brand);
        System.out.println(c.price);
    }
}

// Bike class inheriting Vehicle
class Bike extends Vehicle1 {

    String brand;
    int price;

    Bike(String color, String brand, int price) {
       super(color);
        this.brand = brand;
        this.price = price;
    }
}

// Car class inheriting Vehicle
class Car extends Vehicle1 {

    String brand;
    int price;

    Car(String color, String brand, int price) {
        super(color);
        this.brand = brand;
        this.price = price;
    }
}
