package Structural.bridge;

public class Suv extends Car {
    public Suv(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Suv is ready to drive");
    }
}
