import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void zad1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        n++;
        String pom = "";
        int[][] tabDate = new int[n][n];
        ArrayList<Integer> maxLength = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                tabDate[i][j] = i * j;
            }
        }

        for(int z = 0; z < n; z++){
            pom = Integer.toString(tabDate[z][n-1]);
            maxLength.add(pom.length() + 1);
        }

        for(int m = 0; m < n; m++){
            for(int c = 0; c < n; c++){
                if(m == 0 || c == 0){
                    int resoult2 = m + c;
                    String format2 = String.format("%" + maxLength.get(c) + "d", resoult2);
                    System.out.print(format2);
                }else {
                    int result = tabDate[m][c];
                    String format = String.format("%" + maxLength.get(c) + "d", result);

                    System.out.print(format);
                }
            }
            System.out.println();
        }
    }

    public static void zad3() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        ArrayList<Date> dates = new ArrayList<>();

        while(loop){
            System.out.println("Wprowadź date w formacie " + format.toPattern());
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
        //zad1();
        zad3();
    }
}