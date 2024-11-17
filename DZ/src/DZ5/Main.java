package DZ5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество часов (цифрами): ");
        int timeVariable = input.nextInt();
            if (timeVariable >= 0 && timeVariable <= 24) {
                switch (timeVariable >= 0 && timeVariable <= 5 ? 1 : timeVariable >= 6 && timeVariable <= 12 ? 2 : timeVariable >= 13 && timeVariable <= 16 ? 3 : timeVariable >= 17 && timeVariable <= 24 ? 4 : 0) {
                    case 1 -> System.out.println("Доброй ночи!");
                    case 2 -> System.out.println("Доброе утро!");
                    case 3 -> System.out.println("Добрый день!");
                    case 4 -> System.out.println("Добрый вечер!");
                }
                ;
            } else System.out.println("Ошибка");
    }
}
