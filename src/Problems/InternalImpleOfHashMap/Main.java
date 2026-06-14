package Problems.InternalImpleOfHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, Integer> mp = new MyHashMap<>(1000);
        mp.put(1, 121 );
        mp.put(2, 122);
        mp.put(3, 123);
        mp.put(2+1024, 122);
        System.out.println(mp.get(2));
    }
}
