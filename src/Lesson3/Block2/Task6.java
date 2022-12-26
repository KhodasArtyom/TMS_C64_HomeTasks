package Lesson3.Block2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number>=number) {
            number++;
            if(number % 5 == 0) {
                System.out.println("The first number that is divisible by 5 is " + number);
                break;
            }
        }


        }
    }

