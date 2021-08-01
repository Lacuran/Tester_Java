import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseZadanie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj liczbe aby zamienić ją na znak specjalny: ");
        int liczba = in.nextInt();

        System.out.println("Podana liczba to: " + liczba);

        if (liczba == 0) {
            System.out.println("Znak specjalny dla tej liczby to: )");
        }
        else if (liczba == 1) {
            System.out.println("Znak specjalny dla tej liczby to: !");
        }
        else if (liczba == 2) {
            System.out.println("Znak specjalny dla tej liczby to: @");
        }
        else if (liczba == 3) {
            System.out.println("Znak specjalny dla tej liczby to: #");
        }
        else if (liczba == 4) {
            System.out.println("Znak specjalny dla tej liczby to: $");
        }
        else if (liczba == 5) {
            System.out.println("Znak specjalny dla tej liczby to: %");
        }
        else if (liczba == 6) {
            System.out.println("Znak specjalny dla tej liczby to: ^");
        }
        else if (liczba == 7) {
            System.out.println("Znak specjalny dla tej liczby to: &");
        }
        else if (liczba == 8) {
            System.out.println("Znak specjalny dla tej liczby to: *");
        }
        else if (liczba == 9) {
            System.out.println("Znak specjalny dla tej liczby to: (");
        }
        else
            System.out.println("Nie ma znaku mordo");

    }
}
