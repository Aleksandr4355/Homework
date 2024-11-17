package DZ12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sizeSquare = numberScan();
        printSquare(sizeSquare);
    }
    public static int numberScan() {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        a = input.nextInt();
        if (a >= 3) {
            return a;
        } else
            System.out.println("Ошибка, число должно быть больше 2");
        return numberScan();
    }
    public static void printSquare(int sizeSquare){
        for (int i = 0; i < sizeSquare; i++) {
            for (int j = 0; j < sizeSquare * 2; j++) {
                if ((i >= 1 && i < sizeSquare - 1) && (j >= 1 && j < (sizeSquare * 2) - 1)) {
                    if (j<sizeSquare){
                        System.out.print("\\/");
                    }
                } else
                    System.out.print("=");
            }
            System.out.println();
        }
    }
}
