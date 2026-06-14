package Structural.bridge;

public class Main {
    public static void main(String[] args) {
          PetrolEngine pe = new PetrolEngine();
          ElectricEngine ee = new ElectricEngine();

          Car c1 = new Sedan(pe);
          c1.drive();

    }
}
