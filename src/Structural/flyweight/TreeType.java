package Structural.flyweight;

public class TreeType implements Tree{
    private String type;
    private  String color;

    public TreeType(String type, String color){
        this.type=type;
        this.color=color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println(type + "tree at (" + x + "," + y + ") + "  + color);
    }
}
