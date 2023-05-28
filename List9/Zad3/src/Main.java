import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args){

        NumberFormat numberFormat = NumberFormat.getInstance();

        int numberOfElements = 1_000_000;

        // Tworzenie ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;
        String formattedNumber = numberFormat.format(arrayListAddTime);

        System.out.println("Czas dodawania elementów w kolekcji ArrayList wynosi: " + formattedNumber + " nanosekund");

        // Pojedynczy element w ArrayList
        startTime = System.nanoTime();
        arrayList.add(numberOfElements);
        endTime = System.nanoTime();
        long arrayListElementAddTime = endTime - startTime;
        formattedNumber = numberFormat.format(arrayListElementAddTime);
        System.out.println("Czas dodawania pojedynczego elementu w kolekcji ArrayList wynosi: " + formattedNumber + " nanosekund");

        System.out.println();

        // Tworzenie LinkedList
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;
        formattedNumber = numberFormat.format(linkedListAddTime);
        System.out.println("Czas dodawania elementów w kolekcji LinkedList wynosi: " + formattedNumber + " nanosekund");

        // Pojedynczy element w LinkedList
        startTime = System.nanoTime();
        arrayList.add(numberOfElements);
        endTime = System.nanoTime();
        long linkedListElementAddTime = endTime - startTime;
        formattedNumber = numberFormat.format(linkedListElementAddTime);
        System.out.println("Czas dodawania pojedynczego elementu w kolekcji LinkedList wynosi: " + formattedNumber + " nanosekund");

        // Różnica w czasach
        long timeDifference = Math.abs(arrayListAddTime - linkedListAddTime);
        formattedNumber = numberFormat.format(timeDifference);
        System.out.println("Różnica pomiędzy czasami, gdy dodajemy elementy wynosi: " + formattedNumber + " nanosekund");
        System.out.println();

        // Wyszukiwanie elementu w ArrayList
        startTime = System.nanoTime();
        arrayList.contains(numberOfElements - 1);
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;
        formattedNumber = numberFormat.format(arrayListSearchTime);
        System.out.println("Czas wyszukiwania elementu w kolekcji ArrayList: " + formattedNumber + " nanosekund");

        // Wyszukiwanie elementu w LinkedList
        startTime = System.nanoTime();
        linkedList.contains(numberOfElements - 1);
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime;
        formattedNumber = numberFormat.format(linkedListSearchTime);
        System.out.println("Czas wyszukiwania elementu w kolekcji LinkedList: " + formattedNumber + " nanosekund");

        timeDifference = Math.abs(arrayListSearchTime - linkedListSearchTime);
        formattedNumber = numberFormat.format(timeDifference);
        System.out.println("Różnica pomiędzy czasami, gdy wyszukujemy elementy wynosi: " + formattedNumber + " nanosekund");
    }
}