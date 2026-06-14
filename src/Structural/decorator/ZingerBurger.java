package Structural.decorator;

public class ZingerBurger extends Burger{

    @Override
    public String getDescription() {
        return "Simple Zinger Burger";
    }

    @Override
    public int getCost() {
        return 180;
    }
}
