package DZ20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SquareFigure sf = new SquareFigure();
        int side1, side2, side3, height;
        try {
            do {
                System.out.println("************* Меню программы *************");
                System.out.println("Вычисления площади фигур: \n1. Расчет площади треугольника по формуле Герона. \n2. Расчет площади треугольника через высоту и основание. \n3. Расчет площади прямоугольника по двум сторонам. \n4. Расчте площади квадрата по длине стороны. \n5. Подсчет количество выполненых расчетов площади. \n6. Выход из программы!");
                System.out.println("******************************************");
                System.out.print("\nВведите цифру нужной команды -> ");
                switch (scannerNumbers()) {
                    case 1:
                        System.out.println("\nДля вычисления площади треугольника по формуле Герона");
                        System.out.print("Введите длину стороны 1: ");
                        side1 = scannerNumbers();
                        System.out.print("Введите длину стороны 2: ");
                        side2 = scannerNumbers();
                        System.out.print("Введите длину стороны 3: ");
                        side3 = scannerNumbers();
                        sf.calculationSquareTriangle(side1, side2, side3);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("\nДля вычисления площади треугольника через высоту и основание");
                        System.out.print("Введите высоту: ");
                        height = scannerNumbers();
                        System.out.print("Введите длину основания треугольника: ");
                        side3 = scannerNumbers();
                        sf.calculationSquareTriangle(height, side3);
                        break;
                    case 3:
                        System.out.println("\nДля вычисления площади прямоугольника по двум сторонам");
                        System.out.print("Введите длину сторона 1: ");
                        side1 = scannerNumbers();
                        System.out.print("Введите длину сторона 2: ");
                        side2 = scannerNumbers();
                        sf.calculationSquareFigure(side1, side2);
                        break;
                    case 4:
                        System.out.println("\nДля вычисления площади квадрата по длине стороны");
                        System.out.print("Введите длину стороны 1: ");
                        side1 = scannerNumbers();
                        sf.calculationSquareFigure(side1);
                        break;
                    case 5:
                        System.out.println("\n<Колличество подсчетов площади: " + SquareFigure.getCount() + ">\n");
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("\n<Ошибка ввода команды!>");
                        System.out.println("");
                        break;
                }
            } while (true);
        } finally {
            System.out.println("\n<Работа программы завершена>");
        }
    }

    public static int scannerNumbers() {
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            n = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\n<Ошибка при вводе данных!>");
            System.out.println("<Код ошибки: " + e + ">\n");
        }
        return n;
    }

}
