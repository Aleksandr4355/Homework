package DZ25;

public class Rectangle implements InterfaceFigure {
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void widthFigure(int width) {
        setWidth(width);
    }

    @Override
    public void heightFigure(int height) {
        setHeight(height);
    }

    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException ("Ошибка, должны быть только положительные цисла");
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException ("Ошибка, должны быть только положительные цисла");
    }

    public void infoSizeFigure() {
        System.out.println("Width : " + width + ", Height : " + height);
    }
}
