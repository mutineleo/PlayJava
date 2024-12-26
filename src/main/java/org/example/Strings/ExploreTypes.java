package org.example.Strings;

public class ExploreTypes {

    public static void main(String[] args) {
        /*
        String
        Nature: Immutable (once created, cannot be changed).
        Storage: Stored in the String pool (special memory area) to optimize memory.
        Thread-Safety: Since it’s immutable, it’s inherently thread-safe.
        Performance: Slower in scenarios where frequent modifications (e.g., concatenation) are required, as each modification creates a new String object
         */
        String a = "Hello"; // creates in string pool ( special memory area)
        a = a + " World!"; // creates new string (Hello World!)
        System.out.println(a);

        /*
        StringBuilder
        Nature: Mutable (can change its content).
        Thread-Safety: Not thread-safe, as it doesn’t synchronize methods.
        Performance: Faster than String when frequent modifications are needed, as it modifies the object in place.
         */
        StringBuilder stringBuilder = new StringBuilder("Hello !"); // doesn't create in string pool
        stringBuilder.append("I am a stringBuilder"); // modify the existing string
        System.out.println(stringBuilder);

        /*
        StringBuffer
        Nature: Mutable (like StringBuilder).
        Thread-Safety: Thread-safe, as it synchronizes methods to prevent concurrent modifications.
        Performance: Slower than StringBuilder because of the overhead of synchronization.
         */
        StringBuffer stringBuffer = new StringBuffer("Hello! ");
        stringBuffer.append("I am stringBuffer");
        System.out.println(stringBuffer);




    }


}
