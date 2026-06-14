package Structural.decorator;

public class ExtraChilli extends BurgerDecorator{
    private Burger burger;
    public ExtraChilli(Burger burger){
        this.burger=burger;
    }
    @Override
    public String getDescription() {
        return  burger.getDescription() + " With extra chilli";
    }

    @Override
    public int getCost() {
        return burger.getCost() + 20;
    }
}
