package DZ18;

import java.sql.SQLOutput;
import java.util.Formattable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] numberIphoneArray = {"+7 499 555-75-33", "+74995557533", "7(499)555 75 33", "7 (499) 555-75 33", "7r499 555 75-33", "7 499 55-75-33", "+7 r99 555-75-33", "+7 499 555-75-3354"};
        String pattern = "^\\+?7\\s*\\(?\\d{3}\\)?\\s*\\d{3}(\\s*-?\\d{2}){2}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher;
        for (int i = 0; i < numberIphoneArray.length; i++) {
            matcher = regex.matcher(numberIphoneArray[i]);
            System.out.println((matcher.find()) ? (matcher.group() + " - номер телефона введен верно") : (numberIphoneArray[i] + " - допущена ошибка, некорректный ввод номера телефона"));
        }
    }
}
