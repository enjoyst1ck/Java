public class Main {
    public static void main(String[] args) {
        Husky husky1 = new Husky("Alfa", 12, 25);
        husky1.Wyswietl_Informacje();
        husky1.dajGlos();
        husky1.jedz();
        System.out.println();

        Husky husky2 = new Husky("Beta", 15, 22);
        Husky husky3 = new Husky("Charlie", 12, 25);
        Husky husky4 = new Husky("Alfa", 12, 25);

        Delfin delfin1 = new Delfin("Delfinek", 8, 30);
        delfin1.Wyswietl_Informacje();
        delfin1.plyn();
        delfin1.nurkuj();
        System.out.println();


        if (husky4.equals(husky1)) {
            System.out.println("Porównywane obiekty mają takie same dane!");
        } else {
            System.out.println("Obiekty są różne!");
        }

        System.out.println();

    }
}
