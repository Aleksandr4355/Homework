package DZ23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Захаренко Леонид", "Gr222");
        System.out.println(student1);
        System.out.println(student1 + " сумма степендии: " + student1.grants(scannerNumber()) + "\n");
        Student student2 = new Graduate("Коробков Андрей", "Gr221", "Защита безопастности");
        System.out.println(student2);
        System.out.println(student2 + " сумма степендии: " + student2.grants(scannerNumber()) + "\n");
    }

    public static int scannerNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите средний балл ученика -> ");
        int n = input.nextInt();
        if (n > 0 && n <= 5)
            return n;
        else
            throw new IllegalArgumentException ("Ошибка ввода, введете число от 1 до 5 включительно");
    }
}

class Student {
    private String fio;
    private String group;


    public Student(String fio, String group) {
        this.fio = fio;
        this.group = group;
    }

    public int grants(int grade) {
        return (grade == 5) ? 1000 : 800;
    }

    @Override
    public String toString() {
        return fio + ", группа: " + group + ",";
    }

}

class Graduate extends Student {
    private String theme;

    public Graduate(String fio, String group, String theme) {
        super(fio, group);
        this.theme = theme;
    }

    @Override
    public int grants(int grade) {
        return (grade == 5) ? 2000 : 1800;
    }

    @Override
    public String toString() {
        return super.toString() + " тема: " + theme + ", ";
    }
}