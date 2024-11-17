package DZ8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min_value, max_value, memory_array = 0;
        int[] array;
        System.out.print("Введите начало диопозона: ");
        min_value = input.nextInt();
        System.out.print("Введите конец диопозона: ");
        max_value = input.nextInt();
        for (int i = min_value; i <= max_value; i++) {
            memory_array++;
        }
        array = new int[memory_array];
        for (int y = 0; min_value <= max_value; min_value++, y++) {
            array[y] = min_value;
        }
        System.out.print("Сохраненые значения входящие в массив: " + Arrays.toString(array));
        input.close();
    }
}
