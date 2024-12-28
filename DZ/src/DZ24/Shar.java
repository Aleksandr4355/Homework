package DZ24;

public class Shar extends Figure {

    public Shar(double radius) {
        super(radius);
    }

    @Override
    public double getSize() {
        return (4 * Math.PI * Math.pow(getRadius(), 3)) / 3;
    }

    @Override
    public void info() {
        System.out.printf("%-7s %-8s | %-11s %.2f%n", "Фигура:", "шар", "Объем фигуры:", getSize());
    }
}
