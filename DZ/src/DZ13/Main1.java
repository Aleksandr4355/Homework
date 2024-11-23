package DZ13;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 6, -7, -11};
        System.out.println("n = " + calcNegativeNumbers(arr, 0));
    }

    static int calcNegativeNumbers(int[] numbers, int index) {
        if (index == numbers.length)
            return 0;
        return (numbers[index] < 0 ? 1 : 0) + calcNegativeNumbers(numbers, index + 1);
    }
}
