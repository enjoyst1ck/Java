public class Husky extends Pies{
    public Husky(String imie, int wiek, float waga) {
        super(imie, wiek, waga);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!(obj instanceof Husky))
            return false;
        Husky otherHusky = (Husky) obj;
        return (this.imie.equals(otherHusky.imie) && this.wiek == otherHusky.wiek && this.waga == otherHusky.waga);
    }
}