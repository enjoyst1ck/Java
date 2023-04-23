import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void zad3() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        ArrayList<Date> dates = new ArrayList<>();

        while(loop){
            System.out.println("Wprowadź date w formacie dd.MM.yyyy");
            String dateFromUser = scanner.nextLine();
            Date date = format.parse(dateFromUser);

            if(dates.contains(date)){
                System.out.println("Ta data jest już wpisana.");
            }
            else{
                if(dates.size() == 4) {
                    dates.remove(0);
                }
                dates.add(date);

                dataSort(dates);
                for(int i = 0; i < dates.size(); i++){
                    System.out.println((i+1) + ". " + dates.get(i));
                }
            }

        }
    }

    public static void dataSort(ArrayList<Date> dates){
        for(int i = 0; i < dates.size(); i++){
            for(int j = i + 1; j < dates.size(); j++){
                int compare = dates.get(i).compareTo(dates.get(j));
                if(compare == 1){
                    Date pom = dates.get(i);
                    dates.set(i, dates.get(j));
                    dates.set(j, pom);
                }
            }
        }
    }

    public static void main(String[] args) throws ParseException{
        zad3();
    }
}