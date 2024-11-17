package DZ7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height, width;
        System.out.print("Для построения равнобедренного треугольника введите нечетное число не равное 1: ");
        width = input.nextInt();
        if (width > 1) {
            height = width / 2 + 1;
            for (int i = 1, y = 0; i <= height; i++, y++) {
                for (int j = 1; j <= width; j++) {
                    if (i == 1 && j == height || j >= height - y && j <= height + y) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println("");
            }
        }else System.out.println("Ошибка");
    }
}
