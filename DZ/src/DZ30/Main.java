package DZ30;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        String text;
        Predicate<String> textCheck = s -> s.isEmpty();
        System.out.println("Для для завершения работы программы введите <exit>");
        while (true) {
            System.out.print("Введите строку " + i + ": ");
            text=scanner.nextLine();
            if (text.toLowerCase().equals("exit")){
                break;
            }
            System.out.println("В строке "+ i + (textCheck.test(text) ? " нет текста" : " есть текст"));
            i++;
        }
    }
}
