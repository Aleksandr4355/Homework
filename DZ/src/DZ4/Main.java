package DZ4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 99: ");
        int numberMoney = input.nextInt();
        int numberMoneyPrint = numberMoney;
        if (numberMoney >= 1 && numberMoney <= 99) {
            if (numberMoney >= 11 && numberMoney <= 14)
                System.out.println(numberMoneyPrint + " копеек");
            else if (numberMoney % 10 == 1)
                System.out.println(numberMoneyPrint + " копейка");
            else if (numberMoney % 10 >= 2 && numberMoney % 10 <= 4)
                System.out.println(numberMoneyPrint + " копейки");
            else System.out.println(numberMoneyPrint + " копеек");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
