package Lesson3.Block1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of the month");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

            if(choice == 1 || choice ==2 || choice == 12) {
                System.out.println("Winter");
            } else if(choice==3 || choice == 4 || choice == 5) {
                System.out.println("Spring");
            }else if(choice==6 || choice ==7 || choice == 8) {
                System.out.println("Summer");
            }else if (choice == 9 || choice == 10 || choice== 11) {
                System.out.println("Autumn");
            }else{
                System.out.println("There isn't such season");
        }
    }
    //
}
