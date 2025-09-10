abstract class Vehicle {
    public abstract void move();

}

class Bmw extends Vehicle {
    public void move() {
        System.out.println("BMW is SuperFast car");
    }

}

public class CarAbstract {
    public static void main(String[] args) {
        Bmw myBMW = new Bmw();
        myBMW.move();
    }
}