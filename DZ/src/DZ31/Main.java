package DZ31;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> colorPalette = new LinkedList<>(Arrays.asList("Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"));
        System.out.println("Список: " + colorPalette);
        ListIterator<String> colorListIterator = colorPalette.listIterator();
        System.out.println("\nСписок итераторов в прямом направление:");
        while (colorListIterator.hasNext()){
            System.out.println("Индекс = " + colorListIterator.nextIndex() + ", Элемент = " + colorListIterator.next());
        }
        System.out.println("\nСписок итераторов в обратном направление:");
        while (colorListIterator.hasPrevious()){
            System.out.println("Индекс = " + colorListIterator.previousIndex() + ", Элемент = " + colorListIterator.previous());
        }
    }
}