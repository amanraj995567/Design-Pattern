package creational.abstractFactory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 5000;
    }

    @Override
    public String name() {
        System.out.println("I am a web developer");
        return "Web Developer";
    }
}
