package org.example.Questions.FinalFinallyFinalize;


/*
final
Usage: It is a keyword that can be applied to variables, methods, and classes.
LearnFinal variable: A final variable can only be assigned once. After that, its value cannot be changed.
LearnFinal method: A final method cannot be overridden by subclasses.
LearnFinal class: A final class cannot be subclassed.

 */
public class LearnFinal {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.funcA();
        Child ch = new Child();
        ch.funcA();
        MyFinalClass myFinalClass = new MyFinalClass();
        myFinalClass.funcA();
        // class SubClass extends MyFinalClass { } // Compilation error: cannot subclass final class

    }
}
