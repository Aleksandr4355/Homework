package DZ9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] * array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
