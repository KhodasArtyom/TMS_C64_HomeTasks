package Lesson3.AdditionalTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float surcharge = 0.07f;
        System.out.println("Введите сумму вклада:");
        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        System.out.println("Введите количество месяцев: ");
        int month = scanner.nextInt();
        System.out.println();

        System.out.print("Сумма вклада = " + sum + "\n");
        System.out.println("Количество добавленных месяцев: " + month + "\n надбавка ко вкладу в размере 7 %");
        float sumWithPercent = (sum * surcharge) * month;
        for (int i = 1; i <= month; i++) {

        }
        System.out.print("Cумма вклада = ");
        System.out.println(sumWithPercent + sum);
    }
}
