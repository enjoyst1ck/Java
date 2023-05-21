public class Main {
    public static void main(String[] args) {
        //Index spoza zakresu danej tablicy
        try {
            int[] tab = {1, 2, 3};

            int index1 = tab[2];
            System.out.println(index1);

            int x = tab[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index spoza tablicy.");
        }

        //ArithmeticException  - gdy dzielimy przez zero
        try {
            int a = 6 / 2;
            System.out.println(a);

            int z = 5 / 0;
            System.out.println(z);

        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero.");
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