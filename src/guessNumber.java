import java.util.Random;
import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(15);

        System.out.println("\nWitaj w grze zgadnij liczbę!\n\n" );
        System.out.println("Zasady są proste: ");
        System.out.println("Masz cztery próby do odgadnięcia losowej liczby,");
        System.out.println("ale nieprzejmuj się bedziesz miał podpowiedzi.\n");
        System.out.println("Podaj liczbę z przedziału od 0 do 15.");
        System.out.print("Wybrałes liczbę: ");
        int liczba = in.nextInt();
        System.out.print("\n");

        int proby = 1;

        if (liczba > randomNumber){
            System.out.println("Podana liczba jest mniejsza od " + liczba);
        }
        else if (liczba < randomNumber){
            System.out.println("Podana liczba jest większa od " + liczba);
        }
        else if ( liczba == randomNumber){
            System.out.println("Gratulacja trafiłęś za pierwszym razem: " + randomNumber);
        }
        System.out.println("Jest to twoja " + proby + " próba");


        while (liczba != randomNumber && proby <= 5){
            System.out.println("Spróbuj jeszcze raz\n");
            System.out.print("Wybrałes liczbę: ");
            liczba = in.nextInt();
            System.out.print("\n");

            proby++;
            System.out.println("Jest to twoja " + proby + " próba");

            if (liczba > randomNumber){
                System.out.println("Podana liczba jest mniejsza od " + liczba);
            }
            else if (proby == 5){
                System.out.println("Niestety wykorzystałęś swoje wszystkie szanse.");
                System.out.println("Przegrałeś :(((");
            }
            else if (liczba < randomNumber){
                System.out.println("Podana liczba jest większa od " + liczba);
            }
            else if (liczba == randomNumber){
                System.out.println("Gratulacje udało ci się odgadnąć liczbe: " + randomNumber);
                System.out.println("Potrzebowałeś na to: " + proby + " proby");
            }
        }
    }
}
