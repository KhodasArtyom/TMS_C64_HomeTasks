package Lesson3.Block2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if(len<0) {
            System.out.println("Длина массива не может быть с отрицательным количеством элементов");
        }
        int[] array;
        array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10) );
            System.out.println("Число под индексом " + i + "=" + array[i] + " ");
        }
    }
}
