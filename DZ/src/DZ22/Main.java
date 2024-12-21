package DZ22;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(5.0, 3.0);
        Box3D box3D = new Box3D(box, 2.0);
        System.out.println(box3D);
        box3D.setWidth(10.0);
        box3D.setHeight(5.0);
        box3D.setDepth(7.0);
        box3D.setInfo();
        System.out.println(box3D);
    }
}
