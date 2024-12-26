package org.example.HashMap;

import java.util.*;

public class FailFastVsEnumeration {
    public static void main(String[] args) {

        System.out.println("Fail-Fast Example with HashMap");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "v1");
        hashMap.put(null, "v2");
        hashMap.put("3", null);
        hashMap.put("4", null);
        hashMap.put("5", "v5");
        hashMap.put("6", "v6");


        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        try {
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
                hashMap.put("8", "v8"); // Structural modification during iteration not allowed
            }
        } catch (ConcurrentModificationException e) {
            System.err.println("HashMap iterator is fail-fast, meaning it will throw a ConcurrentModificationException if the map is structurally modified during iteration.");
        }

        System.out.println("Enumeration Example with Hashtable");
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1", "v1");
//        hashtable.put(null, "v2"); // null key or values not allowed
//        hashtable.put("3", null); // null key or values not allowed
//        hashtable.put("4", null);
//        hashtable.put("5", "v5"); // null key or values not allowed
        hashtable.put("6", "v6");

        Enumeration<String>  keys = hashtable.keys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + " -> " + hashtable.get(key));
            hashtable.put("8", "v8"); // Structural modification does not throw exception

        }

    }
}
