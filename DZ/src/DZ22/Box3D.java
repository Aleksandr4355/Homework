package DZ22;

public class Box3D extends Box {
    private double depth;

    public Box3D(Box box, double depth) {
        super(box);
        setDepth(depth);
    }

    public void setInfo() {
        System.out.println("Новые значения");
        System.out.println("Ширина: " + getWidth());
        System.out.println("Высота: " + getHeight());
        System.out.println("Глубина: " + depth);
    }

    public void setDepth(double depth) {
        if (depth < 0)
            throw new IllegalArgumentException("Требуется ввести положительное число");
        this.depth = depth;
    }

    public double getVolumeFigure() {
        return getWidth() * getHeight() * depth;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return  "Box3D {" + super.toString() +
                ", глубина = " + depth +
                '}' + "\nОбъем: " + getVolumeFigure() + "\n";
    }
}
