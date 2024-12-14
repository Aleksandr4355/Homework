package DZ20;

public class SquareFigure {
    static private int count;

    public SquareFigure() {
    }

    public void calculationSquareTriangle(int side1, int side2, int side3) {
        double polPerimeter, square;
        polPerimeter = (side1 + side2 + side3) / 2;
        square = Math.sqrt(polPerimeter * (polPerimeter - side1) * (polPerimeter - side2) * (polPerimeter - side3));
        if (square == 0.0)
            System.out.println("\n<Такого треугольника не существует!>");
        else {
            System.out.println("\n<Площадь треуглоьника по методу Герона " + "(" + side1 + "," + side2 + "," + side3 + "): " + square + ">");
            count++;
        }
    }

    public void calculationSquareTriangle(int height, int side3) {
        double square;
        square = 0.5 * height * side3;
        System.out.println("\n<Площади треугольника через высоту и основание" + "(" + height + "," + side3 + "): " + square + ">\n");
        count++;
    }

    public void calculationSquareFigure(int side1, int side2) {
        System.out.println("\n<Площадь прямоугольника по двум сторонам: " + (side1*side2) + ">\n");
        count++;
    }

    public void calculationSquareFigure(int side1) {
        System.out.println("\n<Площадь квадрата по длине стороны: " + (Math.pow(side1,2)) + ">\n");
        count++;
    }


    public static int getCount() {
        return count;
    }
}
