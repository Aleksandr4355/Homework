package DZ24;

public class Cylinder extends Figure {

    public Cylinder(double radius, int height) {
        super(radius, height);
    }

    @Override
    public void info() {
        System.out.printf("%-7s %-8s | %-11s %.2f%n", "Фигура:", "цилиндр", "Объем фигуры:", getSize());
    }

    @Override
    public double getSize() {
        return Math.PI * getRadius() * 2 * getHeight();
    }
}
