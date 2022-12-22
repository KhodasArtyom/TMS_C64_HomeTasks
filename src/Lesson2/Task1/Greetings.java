package Lesson2.Task1;

import java.util.Scanner;

public class Greetings {
    private short currentYear=2022;

    public void enterNameAndAge() {
        System.out.print("Hello,please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Ok, " +name +". " + "now enter the date of your birth: ");
        short yearOfBirth = scanner.nextShort();
        byte age = (byte) (currentYear - yearOfBirth);


        System.out.println("Thanks," + name + ". "+ "You are " + age +" "+ "years old. Welcome to our course!!" );

    }
}
