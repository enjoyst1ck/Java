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

    public static void main(String[] args) throws ParseException{
        zad1();
    }
}