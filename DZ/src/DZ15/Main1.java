package DZ15;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(isPalindrom("Лидер Венере не вредил"));
        System.out.println(isPalindrom("Могу добавить"));
    }
    public static boolean isPalindrom(String str){
        String result = "";
        str = str.toLowerCase().replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        System.out.println("Исходная строка: " + str);
        System.out.println("Развернутая строка: " + result);
        return str.equals(result) ? true : false;
    }
}
