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

    public static void zad5() {
        TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
        TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Warsaw");

        Calendar calendar1 = Calendar.getInstance(timeZone1);
        calendar1.set(2023, 6, 5, 1,30,0);




        calendar1.setTimeZone(timeZone2);




    }
    public static void main(String[] args) throws ParseException{
        zad4();
    }
}