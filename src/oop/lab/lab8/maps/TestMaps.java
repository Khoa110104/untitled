package oop.lab.lab8.maps;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(5, 10);
        map.put(15, 20);
        map.put(25, 30);
        System.out.println(map);

        System.out.println(Maps.count(map));

        Maps.empty(map);
        System.out.println(map);

        map.put(10, 22);
        map.put(40, 44);
        map.put(5, 66);

        System.out.println(Maps.contains(map, 1));
        System.out.println(map);

        System.out.println(Maps.containsKeyValue(map, 2, 9));
        System.out.println(Maps.containsKeyValue(map, 1, 22));

        System.out.println(Maps.keySet(map));

        System.out.println(Maps.values(map));

        System.out.println(Maps.getColor(0));
        System.out.println(Maps.getColor(1));
        System.out.println(Maps.getColor(2));
        System.out.println(Maps.getColor(-1));
    }

}
