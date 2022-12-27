package Lesson3.AdditionalTasks;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                int multi = 0;
                multi+=i * j;

                System.out.print(i + " * " + j + " = " + i  * j + "\t"  );
            }
            System.out.println();

        }
    }
}
