import java.sql.SQLOutput;
import java.util.Scanner;

public class PlayWithScanner {

    public static void main(String[] args) {
/* metoda skanera która wprowadza wartośi przez uzytkownika!!!
 */
        Scanner in = new Scanner(System.in);
        //System.out.println("Prosze wpisać coś na ekran");

        //String readLine = in.nextLine();
        //System.out.println("Wpisałeś: " + readLine);

        System.out.println("Podaj dwie liczby aby je dodać: ");
        System.out.print("Dej mnie Pierwszą Liczbe: ");
        int first = in.nextInt();
        System.out.print("Dej mnie Drugą Liczbe: ");
        int second = in.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Pierwsza podana liczba to: " + first);
        System.out.println("Druga podana liczba to: " + second);
        System.out.println("Suma podanych liczb wynosi: " + (first + second));

    }
}
