package Structural.flyweight;

import java.util.HashMap;

public class TreeFactory {
    private static HashMap<String, TreeType> trees = new HashMap<>();
    public static  TreeType getTreeType(String type, String color){
        String key = type + color;
        if(!trees.containsKey(key)){
            trees.put(key, new TreeType(type, color));
        }
        return trees.get(key);
    }
}
