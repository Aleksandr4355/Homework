package DZ24;

public class Main {
    public static void main(String[] args) {
        Figure figure [] = new Figure[3];
        figure[0] = new Shar(5);
        figure[1] = new Cylinder(12,14);
        figure[2] = new Pyramid(10,8);
        for(Figure f : figure){
            f.info();
        }
    }
}
