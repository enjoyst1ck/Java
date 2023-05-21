public class Main {
    public static void main(String[] args) {
        //Index spoza zakresu danej tablicy
        try {
            int[] tab = {1, 2, 3};
            int x = tab[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index spoza tablicy.");
        }

        //NullPointerException - gdzy odwolujemy sie do obiektu który ma wartosc null
        try {
            String text = null;
            int textLength = text.length();
        } catch (NullPointerException e){
            System.out.println("Obiekt jest pusty.");
        }
    }
}