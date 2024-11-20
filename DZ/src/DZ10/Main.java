package DZ10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int figureNumber, a, b, c;
        float polPerimeter;
        System.out.println("Вычисление площади фигуры");
        System.out.println("Выбор фигуры:" + "\n1 - треугольник" + "\n2 - прямоугольник" + "\n3 - круг");
        System.out.print("Введите число: ");
        figureNumber = input.nextInt();
        switch (figureNumber) {
            case 1:
                System.out.print("Введите длину стороны а: ");
                a = input.nextInt();
                System.out.print("Введите длину стороны b: ");
                b = input.nextInt();
                System.out.print("Введите длину стороны c: ");
                c = input.nextInt();
                polPerimeter = (float) (a + b + c) / 2;
                System.out.printf("Площадь треугольника равна: %.2f", Math.sqrt(polPerimeter * (polPerimeter - a) * (polPerimeter - b) * (polPerimeter - c)));
                break;
            case 2:
                System.out.print("Введите длину прямоугольника: ");
                a = input.nextInt();
                System.out.print("Введите ширину прямоугольника: ");
                b = input.nextInt();
                System.out.println("Площадь прямоугольника равна: " + a * b);
                break;
            case 3:
                System.out.print("Введите радиус круга: ");
                a = input.nextInt();
                System.out.printf("Площадь круга равна: %.2f", Math.PI * Math.pow(a, 2));
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        input.close();
        System.out.println("\nДомашние задание");
    }
}
