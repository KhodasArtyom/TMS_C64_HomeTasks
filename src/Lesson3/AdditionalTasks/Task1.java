package Lesson3.AdditionalTasks;

public class Task1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1;
        int number3;
        System.out.print(number1 + " " + number2 + " ");
        for (int i = 3; i <=11; i++) {
            number3 = number1 + number2;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;


        }
    }
}
