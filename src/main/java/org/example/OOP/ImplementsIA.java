package org.example.OOP;

public class ImplementsIA implements IA{
    @Override
    public void funcA() {
        System.out.println("Inside ImplementsIA funcA");
    }

    @Override
    public void funcB() {
        System.out.println("Inside ImplementsIA funcB");
    }

    public void funD() {
        System.out.println("Inside ImplementsIA funcD");
    }
}
