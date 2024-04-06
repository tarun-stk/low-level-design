package org.stk;

import org.stk.utils.HashMap;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> customMap = new HashMap<>();
        System.out.println("customMap.isEmpty(): " + customMap.isEmpty());
        customMap.put("India", 250);
        customMap.put("US", 125);
        customMap.put("Canada", 80);
        customMap.put("Australia", 55);

        List<String> keySet = customMap.keySet();
//        System.out.println("List of all items: ");
//
//        for (int i = 0; i < keySet.size(); i++) {
//            System.out.println("Key: " + keySet.get(i) + ", Value: " + customMap.get(keySet.get(i)));
//        }

        System.out.println();
        System.out.println("customMap.remove(\"Australia\"): " + customMap.remove("Australia"));
        System.out.println("customMap.remove(\"UK\"): " + customMap.remove("UK"));
        System.out.println();

        customMap.put("Canada", 95);
//        System.out.println("List of all items: ");
//        keySet = customMap.keySet();
//        for (int i = 0; i < keySet.size(); i++) {
//            System.out.println("Key: " + keySet.get(i) + ", Value: " + customMap.get(keySet.get(i)));
//        }

        customMap.put("Nepal", 63);
        customMap.put("Finland", 45);
        customMap.put("Brazil", 69);
        customMap.put("RSA", 55);
        customMap.put("Saudi Arabia", 63);
        customMap.put("Yemen", 10);
        customMap.put("UAE", 61);
        customMap.put("China", 200);

        System.out.println("List of all items: ");
        keySet = customMap.keySet();
        for (int i = 0; i < keySet.size(); i++) {
            System.out.println("Key: " + keySet.get(i) + ", Value: " + customMap.get(keySet.get(i)));
        }
        System.out.println();
        System.out.println("customMap.get(\"Russia\"): " + customMap.get("Russia"));
        System.out.println("customMap.isEmpty(): " + customMap.isEmpty());
    }
}