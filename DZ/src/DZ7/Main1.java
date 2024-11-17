package DZ7;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = 13; // высота треугольника
        for (int i = 1; i < height; i++) { // идем по строкам i - соответсвует строке
            for (int j = 0; j < height - i; j++) { // пробелы в строках
                System.out.print("   ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
