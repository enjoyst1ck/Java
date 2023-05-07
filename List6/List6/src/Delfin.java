public class Delfin extends Zwierze implements Wodne{

    float predkosc;
    public Delfin()
    {

    }

    public Delfin(float predkosc){
        this.predkosc = predkosc;
    }

    public Delfin(String imie, int wiek, float predkosc){
        super(imie, wiek);
        this.predkosc = predkosc;
    }

    public void Wyswietl_Informacje(){
        super.Wyswietl_Informacje();
        System.out.println("Predkosc: " + predkosc + "km/h");
    }

    public void plyn() {
        System.out.println("Płynę");
    }

    public void nurkuj() {
        System.out.println("Nurkuję");
    }
}
