import java.sql.SQLOutput;
import java.util.Scanner;

public class PrzestenyRok {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj rok by sprawdzić czy jest przestępny: ");
        int year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(" Rok jest Przestepny");
        }
        else
        System.out.println("Rok nie jest Przestępny");
        }

    }
