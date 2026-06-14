package Structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Tree t1 = TreeFactory.getTreeType("A" , "Green");
        t1.display(1,2);

        Tree t2 = TreeFactory.getTreeType("A" , "Green");
        t2.display(4,8);

        Tree t3 = TreeFactory.getTreeType("C" , "Red");
        t3.display(5,2);

    }
}
