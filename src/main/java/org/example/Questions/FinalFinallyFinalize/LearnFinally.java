package org.example.Questions.FinalFinallyFinalize;

public class LearnFinally {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.err.println("Exception : "+ e);
//            System.exit(0);
        } finally {
            System.out.println("Inside finally.");
        }
    }
}
