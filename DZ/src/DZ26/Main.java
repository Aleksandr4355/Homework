package DZ26;

public class Main {
    public static void main(String[] args) {
        System.out.println("Скорость самолета составляет " + Transport.AIRPLANE.getSpeed() + " миль в час\n");
        System.out.println("Скорость транспортных средств:");
        for(Transport tr : Transport.values()){
            System.out.println(tr + " типичная скорость составляет " + tr.getSpeed() + " миль в час");
        }
    }
}
