package Lesson3.Block1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите текущую наружнукю температуру");
        Scanner sc= new Scanner(System.in);
        int temperature = sc.nextInt();

        if(temperature > -5 ) {
            System.out.println("Тепло");
        }else if(temperature >-20 && temperature <=-5 ) {
            System.out.println("Нормально");
        }else if (temperature<=-20) {
            System.out.println("Холодно");
        }
    }
    //
}
