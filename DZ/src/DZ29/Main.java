package DZ29;

interface AnonymousInterface {
    void anonymousMethod(String text1, String text2);
}

interface LambdaInterface {
    void lambdaMethod(String text1, String text2);
}

public class Main {
    public static void main(String[] args) {
        String txt1 = "Собака", txt2 = "Кот";
        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void anonymousMethod(String text1, String text2) {
                System.out.println(txt1.length() > txt2.length() ? txt2 : txt1);
            }
        };
        LambdaInterface lambdaInterface = (text1, text2) ->
                System.out.println(txt1.length() > txt2.length() ? txt2 : txt1);
        anonymousInterface.anonymousMethod(txt1,txt2);
        lambdaInterface.lambdaMethod(txt1, txt2);
    }
}
