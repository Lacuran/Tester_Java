package pentlaforfor;

import java.util.Scanner;

public class rysowaniefor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //program rysuje kwadrat z podanego symbolu i podanych wymiarach
        System.out.println("Witaj w rysowaniu kwadrata, Podaj następujące zmienne");
        System.out.print("Podaj symbol w jakim ma być wykonany kwadrat: ");
        String symbol = in.nextLine();
        System.out.print("Podaj długość boku A: "); // Bok a reprezentuje wysokość naszego kwadratu ↓
        int bokA = in.nextInt();
        System.out.print("Podaj długość boku B: "); // Bok B reprezentuje długość naszego kwadratu →
        int bokB = in.nextInt();

        if (symbol.length()  <= 1) {        // zabezpiecza zmieną symbol przed wystąpieniem więcej jak jednego znaku

            for (int i = 1; i <= bokA; i++) {
                System.out.println();
                for (int j = 1; j <= bokB; j++) {
                    System.out.print(symbol);

                }
            }
        }
        else
            System.out.println("Podaj pojedyńczy symbol");

        System.out.println();
        System.out.println("----------------------------------------------");
        for (int i = 1; i <= 5; i++){   //rysuje pojedyńczy kwadrat w pętli
            System.out.println();
                for(int j = 1; j <= 5; j++) {    //po wykonaniu 5 powtórzeń powraca do poprzedniej pętli
                    System.out.print("*");
                }
        }
    }
}
