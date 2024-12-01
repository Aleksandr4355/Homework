package DZ16;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("  Текс с повторяющимся символами ");
        System.out.println("Исходнфя строка - " + '"' + text + '"');
        ;
        System.out.println(removeSymbol(text));

    }
    public static StringBuilder removeSymbol (StringBuilder textP){
        int pos;
        int pos1;
        while ((pos =(textP.indexOf(" "))) != -1){
            textP = textP.deleteCharAt(pos);
        }
        for (int i = 0; i < textP.length(); i++) {

        }

        System.out.println();
        return textP;
    }

}
//System.out.println(); // поиск индекса указаного символа
//System.out.println(sb.indexOf("l",4)); // поиск индекса указаного символа с индекса