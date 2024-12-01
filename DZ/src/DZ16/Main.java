package DZ16;

public class Main {
    public static void main(String[] args) {
        String text = "  Текст с повторяющимися символами ";
        System.out.println("Исходнфя строка - " + '"' + text + '"');
        System.out.println("Измененная строка: " + '"' + removeSymbol(text) + '"');
    }

    public static StringBuilder removeSymbol(String str) {
        StringBuilder textBuilder = new StringBuilder();
        int pos;
        char[] textArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (textArray[i] == textArray[j] && j > i) {
                    textArray[j] = ' ';
                }
            }
        }
        str = String.valueOf(textArray);
        textBuilder.append(str);
        while ((pos = textBuilder.indexOf(" ")) != -1) {
            textBuilder = textBuilder.deleteCharAt(pos);
        }
        return textBuilder;
    }
}
