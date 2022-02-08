package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 35;
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        System.out.println(arrL);

        List<String> cities = new ArrayList<>();
        cities.add("Columbus");
        cities.add("New York");
        cities.add("Tokyo");
        System.out.println(cities);
        for(String city: cities){
            System.out.println(city);
        }

        Set<String> cities2 = new TreeSet<>();
        cities2.add("Dayton");
        cities2.add("Columbus");
        cities2.add("Cleveland");
        cities2.add("Columbus");

        System.out.println(cities2);

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "What");
        hashMap.put(2, "if");
        hashMap.put(3, "!");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        for(Integer key : hashMap.keySet()) {
            System.out.println(key);
        }
    }
}
