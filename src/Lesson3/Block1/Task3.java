package Lesson3.Block1;

import java.util.Scanner;
import java.util.SortedMap;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Число четное");
                //add else if < 0
            } else if(number < 0){
                System.out.println("Число не может быть  < 0");
        }else {
                System.out.println("Число не четное");
            }
    }
    //

}


