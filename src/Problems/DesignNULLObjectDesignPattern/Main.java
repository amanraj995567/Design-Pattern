package Problems.DesignNULLObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetaile(vehicle);
    }

    public static void printVehicleDetaile(Vehicle vehicle){
        System.out.println("Seating Capacity:" + vehicle.getSeatCapacity());
        System.out.println("Fuel Capacity:" + vehicle.getTankCapacity());
    }
}
