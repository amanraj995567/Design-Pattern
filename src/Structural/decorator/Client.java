package Structural.decorator;

public class Client {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() + " " + burger.getCost());

        burger = new ExtraCheesBurger(burger);
        System.out.println(burger.getDescription() + " " + burger.getCost());

        burger = new ExtraChilli(burger);
        System.out.println(burger.getDescription() + " " + burger.getCost()) ;
    }
}
