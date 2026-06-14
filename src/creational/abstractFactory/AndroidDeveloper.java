package creational.abstractFactory;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Salary is 8000");
        return 8000;
    }

    @Override
    public String name() {
        System.out.println("I am a android developer");
        return "Android Developer";
    }
}
