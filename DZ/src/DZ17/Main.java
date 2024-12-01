package DZ17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] s = {"123456@i.ru", "123_456@ru.name.ru", "login@i.ru", "логин-1@.ru","lo_43@r.емаил.com", "login.3@i.ru", "login.3-67@i.ru", "1login@ru.name.ru", "123Login_name-28@i.e-mail.com", "login_43@r.емаил.ru"};
        String pattern = "^[\\w-.А-Яа-яёЁ]*@[\\w-.]+$";
        for (int i = 0; i < s.length; i++) {
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s[i]);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
