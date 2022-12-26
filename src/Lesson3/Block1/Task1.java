package Lesson3.Block1;

import java.util.Scanner;


public class Task1 {
    public static void chooseSeason() {
        System.out.println("Enter the number of the month");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");

            }
            if(choice == 0 || choice > 12) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        chooseSeason();
    }
}

