package Structural.decorator;

public class ExtraCheesBurger extends BurgerDecorator{

    private Burger burger;
    public ExtraCheesBurger(Burger burger){
        this.burger = burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + "with Extra cheese";
    }

    @Override
    public int getCost() {
        return burger.getCost() + 10;
    }
}
