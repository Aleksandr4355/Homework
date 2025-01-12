package DZ27;

public class Print <T> {
    public T [] array;

    public Print(T[] array) {
        this.array = array;
    }

    public void printArray (){
        System.out.print("Массив: ");
        for (T s : array){
            System.out.print(s + " ");
        }
    }
}
