package DZ24;

public abstract class Figure {
    private double radius;
    private int height;
    private int line;

    public Figure(double radius, int height) {
        setRadius(radius);
        setHeight(height);
    }

    public Figure(double radius) {
        setRadius(radius);
    }

    public Figure(int height, int line) {
        setHeight(height);
        setLine(line);
    }

    public double getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public int getLine() {
        return line;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Ошибка, должны быть только положительные цисла");
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Ошибка, должны быть только положительные цисла");
    }

    public void setLine(int line) {
        if (line > 0)
            this.line = line;
        else
            throw new IllegalArgumentException("Ошибка, должны быть только положительные цисла");
    }

    public abstract void info();

    public abstract double getSize();
}
