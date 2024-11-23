package DZ14;

public class Main {
    public static void main(String[] args) {
        String s = "Hello, World";
        System.out.println(s);
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                number1++;
            } else if (ch >= 'A' && ch <= 'Z') {
                number2++;
            }
        }
        System.out.println("Количество строчных букв - " + number1);
        System.out.println("Количество прописных букв - " + number2);
    }
}
