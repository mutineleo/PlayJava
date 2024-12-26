package org.example.Questions.FinalFinallyFinalize;

/*
finalize()
Usage: It is a method defined in the Object class, intended to perform cleanup operations
        before an object is garbage collected.

Effect:

The finalize() method is called by the garbage collector before an object is removed from memory.
It is not guaranteed to be called. The garbage collector may not run the finalize() method in
certain cases, or it might run it at an indeterminate time.
It is generally not recommended to use finalize() for critical resource management, as it is unreliable.
Instead, try using the try-with-resources statement or manually calling cleanup methods.

 */
public class LearnFinalize {

    @Override
    protected void finalize() throws Throwable {
        // Cleanup code before the object is garbage collected
        System.out.println("Finalizing object...");

    }
    public static void main(String[] args) {
        LearnFinalize obj = new LearnFinalize();
        obj = null; // Make object eligible for GC
        System.gc(); // Request garbage collection (not guaranteed to run finalize)

    }
}
