package DZ15;

public class Main {
    public static void main(String[] args) {
        String str1 = "Коту скоро сорок суток";
        String str2 = "Могу добавить";
        String str3 = "А роза упала на лапу Азора";
        String str4 = "Уверена я, а не реву";
        String str5 = "Акт у нимф - минутка";
        System.out.println(str1 + " : " + (coupLine(str1)).equalsIgnoreCase(removeSymbol(str1)));
        System.out.println(str2 + " : " + (coupLine(str2)).equalsIgnoreCase(removeSymbol(str2)));
        System.out.println(str3 + " : " + (coupLine(str3)).equalsIgnoreCase(removeSymbol(str3)));
        System.out.println(str4 + " : " + (coupLine(str4)).equalsIgnoreCase(removeSymbol(str4)));
        System.out.println(str5 + " : " + (coupLine(str5)).equalsIgnoreCase(removeSymbol(str5)));
    }
    public static String coupLine(String n) {
        String result = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            result = result + n.charAt(i);
        }
        return removeSymbol(result);
    }
    public static String removeSymbol (String n){
        n = n.replace(" ","");
        n = n.replace(",","");
        n = n.replace("-","");
        return n;
    }
}
