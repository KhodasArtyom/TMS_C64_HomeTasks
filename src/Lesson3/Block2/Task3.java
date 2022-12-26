package Lesson3.Block2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Ввеите любое число: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long sum = 0;
        for (int i = 0; i <=number; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел равна от 0 до " + number +"(включительно)"+ " = " +  + sum );
    }
}
