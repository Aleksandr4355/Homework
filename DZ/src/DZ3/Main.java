package DZ3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3,num4, num5, fullNumberPrint;
        System.out.print("Введите пятизначное число: ");
        int fullNumber = input.nextInt();
        fullNumberPrint = fullNumber;
        num1 = fullNumber % 10;
        fullNumber = fullNumber / 10;
        num2 = fullNumber % 10;
        fullNumber = fullNumber / 10;
        num3 = fullNumber % 10;
        fullNumber = fullNumber / 10;
        num4 = fullNumber % 10;
        num5 = fullNumber / 10;
        System.out.printf("Произведение цифр числа %d: %d %n", fullNumberPrint, num1*num2*num3*num4*num5);
        System.out.printf("Среднее арифметическое числа %d: %.1f %n", fullNumberPrint, (float)(num1+num2+num3+num4+num5)/5);
    }
}
