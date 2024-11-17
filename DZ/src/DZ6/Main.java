package DZ6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество символов: ");
        int number_symbol = input.nextInt();
        if (number_symbol > 0) {
            input.nextLine();
            System.out.print("Введите символов: ");
            String symbol = input.nextLine();
            System.out.println("Для ориентации линии введите число:\n 1 - горизонтальная ориентация \n 0 - вертикальная ориентация");
            System.out.print("Введите ориентацию линии: ");
            int line_meaning = input.nextInt();
            for (int i = 0; number_symbol != i; i++) {
                if (line_meaning == 1) System.out.print(symbol + " ");
                else if (line_meaning == 0) System.out.println(symbol);
                else System.out.println("Ошибка ввода данных");
            }
        } else
            System.out.println("Ошибка ввода данных");
        input.close();
    }
}
