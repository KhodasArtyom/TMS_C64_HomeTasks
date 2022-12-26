package Lesson3.Block2;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("The square of numbers from 10 to 20:");
        for (int i = 10; i <=20 ; i++) {
            double square = Math.pow(i,2);
            System.out.println("The square of number " + i + " = " + square);
        }
    }
}
