package DZ7;

public class Main2 {
    public static void main(String[] args) {
        int h = 7;
        int w = h * 2 - 1;
        int m = w / 2;
        for (int i = 0, l = m, r = m; i < h; i++, l--, r++) {
            for (int j = 0; j < w; j++) {
                if (j >= l && j <= r) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
