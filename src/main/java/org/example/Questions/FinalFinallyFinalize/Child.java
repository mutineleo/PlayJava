package org.example.Questions.FinalFinallyFinalize;

public class Child extends Parent{
    public void funcA() {
        System.out.println("inside Child funcA");
    }
//    public  final void funcB() { // Compilation error: cannot override final method
//        System.out.println("inside Parent funcB");
//    }
}
