package org.example.OOP;

public interface IA {
    public void funcA();

    public default void funcB() {
        System.out.println("Inside funB");
    }

    public static void funcC() {
        System.out.println("Inside funcC");
    }
}
