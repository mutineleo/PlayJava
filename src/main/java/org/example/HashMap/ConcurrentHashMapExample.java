package org.example.HashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
Using ConcurrentHashMap
ConcurrentHashMap is a highly efficient, thread-safe map implementation that allows concurrent read and write operations
 without locking the entire map. It divides the map into segments and locks only the segment being modified.

 Allows multiple threads to read and write concurrently without blocking each other.
No need for manual synchronization during iteration.
Provides atomic operations like putIfAbsent, replace, and compute.

 */
public class ConcurrentHashMapExample {
    public static void main(String[] args) {

        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("1", "v1");
        concurrentHashMap.put("2", "v2");
        concurrentHashMap.put("3", "v3");
        concurrentHashMap.put("4", "v4");

        concurrentHashMap.putIfAbsent("4", "v4new");
        concurrentHashMap.replace("1", "v1new");

        for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + concurrentHashMap.get(entry.getKey()));
        }

    }
}
