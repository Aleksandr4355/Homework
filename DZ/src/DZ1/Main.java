package DZ1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Переменная типа byte   занимает " + Byte.BYTES + " Байт памяти (" + Byte.SIZE + "  бит памяти)," + " и принимает значения в диапазоне от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);

        System.out.println("Переменная типа short  занимает " + Short.BYTES + " Байт памяти (" + Short.SIZE + " бит памяти)," + " и принимает значения в диапазоне от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);

        System.out.println("Переменная типа int    занимает " + Integer.BYTES + " Байт памяти (" + Integer.SIZE + " бит памяти)," + " и принимает значения в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);

        System.out.println("Переменная типа long   занимает " + Long.BYTES + " Байт памяти (" + Long.SIZE + " бит памяти)," + " и принимает значения в диапазоне от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);

        System.out.println();

        System.out.println("Переменная типа float  занимает " + Float.BYTES + " Байт памяти (" + Float.SIZE + " бит памяти)," + " и принимает значения в диапазоне от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);

        System.out.println("Переменная типа double занимает " + Double.BYTES + " Байт памяти (" + Double.SIZE + " бит памяти)," + " и принимает значения в диапазоне от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);;
    }
}