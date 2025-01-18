package DZ28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws ExceptionString {
        Scanner input = new Scanner(System.in);
        System.out.print("Ввведите строку: ");
        String stringInput = input.nextLine();
        if (verificationLitter(stringInput)) {
            System.out.println("Исходная строка: " + stringInput + "\nВ строке найдены глассные буквы");
        } else {
            throw new ExceptionString("Исходная строка: " + stringInput + ", Ошибка: строка не содержит гласные букв");
        }
    }

    public static boolean verificationLitter(String stringInput) {
        String pattern = "[a e i о u y]+|[а о э е и ы у ё ю я]+";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(stringInput.toLowerCase());
        return mat.find();
    }
}

class ExceptionString extends Exception {
    public ExceptionString(String message) {
        super(message);
    }
}