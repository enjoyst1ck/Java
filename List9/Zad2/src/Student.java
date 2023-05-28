public class Student implements Comparable<Student> {
    private int rocznik;
    private String nazwisko;
    private double srednia;

    public Student(int rocznik, double srednia, String nazwisko) {
        this.rocznik = rocznik;
        this.srednia = srednia;
        this.nazwisko = nazwisko;
    }

    public int getRocznik() {
        return rocznik;
    }

    public double getSrednia() {
        return srednia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public int compareTo(Student other) {
        if (rocznik != other.rocznik) {
            return Integer.compare(rocznik, other.rocznik);
        } else if (srednia != other.srednia) {
            return Double.compare(srednia, other.srednia);
        } else {
            return nazwisko.compareTo(other.nazwisko);
        }
    }
}
