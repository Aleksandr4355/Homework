package DZ24;

public class Pyramid extends Figure{
    public Pyramid(int height, int line) {
        super(height, line);
    }

    @Override
    public void info() {
        System.out.printf("%-7s %-8s | %-11s %.2f%n", "Фигура:", "пирамида", "Объем фигуры:", getSize());
    }

    @Override
    public double getSize() {
        return (getHeight() * Math.pow(getLine(),2))/3;
    }
}
