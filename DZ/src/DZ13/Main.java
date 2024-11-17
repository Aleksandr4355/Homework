package DZ13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int j = 0;
    public static void main(String[] args) {
        int size;
        System.out.print("Введите размер массива: ");
        size = input.nextInt();
        int[] mas = new int[size];
        fillingArray(mas);
        System.out.println("В массиве найдено отрицаительных чисел: " + searchValue(0, mas));
        input.close();
    }
    static void fillingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("->");
            array[i] = input.nextInt();
        }
    }
    static int searchValue(int i, int[] array) {
        if (i <= array.length - 1) {
            if (array[i] < 0) {
                j = j + 1;
            }
            searchValue(i + 1, array);
        }
        return j;
    }
}
