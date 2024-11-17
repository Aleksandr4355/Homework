package DZ11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int figureNumber;
        System.out.println("Вычисление площади фигуры");
        System.out.println("Выбор фигуры:" + "\n1 - треугольник" + "\n2 - прямоугольник" + "\n3 - круг");
        System.out.print("Введите число: ");
        figureNumber = input.nextInt();
        if (figureNumber == 1)
            System.out.printf("Площадь треугольника равна: %.2f", triangle());
        else if (figureNumber == 2) {
            System.out.print("Площадь прямоугольника равна: " + rectangle());
        } else if (figureNumber == 3) {
            System.out.printf("Площадь круга равна: %.2f", circle());
        } else
            System.out.println("ошибка");
    input.close();
    }

    public static float triangle() {
        int a, b, c;
        float polPerimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину стороны а: ");
        a = input.nextInt();
        System.out.print("Введите длину стороны b: ");
        b = input.nextInt();
        System.out.print("Введите длину стороны c: ");
        c = input.nextInt();
        input.close();
        polPerimeter = (float) (a + b + c) / 2;
        return (float) (Math.sqrt(polPerimeter * (polPerimeter - a) * (polPerimeter - b) * (polPerimeter - c)));
    }

    public static int rectangle() {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        a = input.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        b = input.nextInt();
        input.close();
        return a * b;
    }

    public static float circle() {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        a = input.nextInt();
        input.close();
        return (float) (Math.PI * Math.pow(a, 2));
    }
}
