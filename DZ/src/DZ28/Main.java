package DZ28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String stringInput = input.nextLine();
        System.out.println("\nИсходная строка: " + stringInput);
        try {
            verificationLitter(stringInput);
            System.out.println("Строка содержит гласные буквы");
        } catch (ExceptionString e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verificationLitter(String stringInput) throws ExceptionString {
        String pattern = "[a e i о u y]+|[а о э е и ы у ё ю я]+";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(stringInput.toLowerCase());
        if (!mat.find()) {
            throw new ExceptionString("Ошибка: строка не содержит гласных букв");
        }
    }
}
    class ExceptionString extends Exception {
        public ExceptionString(String message) {
            super(message);
        }
    }
