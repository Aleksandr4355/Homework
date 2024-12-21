package DZ22;

public class Box {
    private double width;
    private double height;

    public Box(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public Box(Box other) {
        this.width = other.width;
        this.height = other.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0)
            throw new IllegalArgumentException("Требуется ввести положительное число");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            throw new IllegalArgumentException("Требуется ввести положительное число");
        this.height = height;
    }

    @Override
    public String toString() {
        return "ширина = " + width +
                ", высота = " + height;
    }
}
