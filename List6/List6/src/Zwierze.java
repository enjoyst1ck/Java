public abstract class Zwierze {
    String imie;
    int wiek;

    public Zwierze(){

    }

    public Zwierze(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    public void Wyswietl_Informacje(){
        System.out.println("Imie: " + imie);
        System.out.println("Wiek: " + wiek);
    }
}
