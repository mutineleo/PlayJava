package org.example.HashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Using Collections.synchronizedMap()
Collections.synchronizedMap() wraps a regular Map implementation (e.g., HashMap) and synchronizes all its method calls to make it thread-safe.

Synchronization is applied to all map operations (like put, get, and remove).
You must manually synchronize on the map when iterating over its contents (as shown in the example above).
It is a simpler solution for making a map thread-safe but less performant compared to ConcurrentHashMap due to broader locking.

 */
public class SynchronizedMapExample {

    public static void main(String[] args) {

        Map<String, String> synchronizedMap =Collections.synchronizedMap(new HashMap<>());

        synchronizedMap.put("1", "v1");
        synchronizedMap.put("2", "v2");
        synchronizedMap.put("3", "v3");

        synchronized (synchronizedMap) {
            synchronizedMap.put("4", "v4");
            for (Map.Entry<String, String> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + synchronizedMap.get(entry.getKey()));
            }
        }

    }
}
