import java.security.PublicKey;

public abstract class Pies extends Zwierze implements Ladowe {
    public float waga;

    public Pies() {

    }

    public Pies(float waga) {
        this.waga = waga;
    }

    public Pies(String imie, int wiek, float waga) {
        super(imie, wiek);
        this.waga = waga;
    }

    public void Wyswietl_Informacje() {
        super.Wyswietl_Informacje();
        System.out.println("Waga: " + waga);
    }
}
