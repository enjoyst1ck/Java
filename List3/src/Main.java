import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void zad4() throws ParseException{
        Scanner scan = new Scanner(System.in);
        String pattern = "MM.dd.yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        System.out.println("Podaj date w formacie MM.dd.yyyy");
        String data1 = scan.nextLine();
        Date date1 = dateFormat.parse(data1);

        System.out.println("Podaj date w formacie MM.dd.yyyy");
        String data2 = scan.nextLine();
        Date date2 = dateFormat.parse(data2);

    }
    public static void main(String[] args) throws ParseException{
        zad4();
    }
}