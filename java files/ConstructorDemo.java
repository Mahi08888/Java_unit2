class Car {
    String brand;

    Car(String b) {
        brand = b;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Car c = new Car("BMW");
        System.out.println("Brand: " + c.brand);
    }
}
