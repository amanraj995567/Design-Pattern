package creational.abstractFactory;

public class Manager implements Employee{

    @Override
    public int salary() {
        System.out.println("Manger: My salary is 50000");
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am a manger ");
        return "Manager";
    }
}
