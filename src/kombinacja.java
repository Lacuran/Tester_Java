import java.util.Scanner;

// program liczy ilość możliwych kombinacji
// n reprezentuje ilosc elementow jakie mamy
//k reprezentuje ilość kombinacji jaka nas interesuje

public class kombinacja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Dej mnie ilość liczb jakie masz: n! = ");
        int n = in.nextInt();

        System.out.print("A teraz dej mnie jaką masz kombinacje: k! = ");
        int k = in.nextInt();


        int wynikN = 1;
        int wynikK = 1;
        int kombiZero; //zabezpiecza program przed dzieleniem przez 0

        if (n == 0){
            System.out.println("co to za kombinacja bez elementow???");
        }
        else if (n >= 1){

            for (int i = n ; i >= 1 ; i--){
                wynikN *= i;
            }
        }

        if (k == 0) {
            System.out.println("bez zadnej kombinacjie. Smuteczek :(((");
        }
        else if (k >= 1){

            for (int j = k; j >= 1; j--){
                wynikK *= j;
            }
        }

        kombiZero = n - k;
        int kombiJeden = 1;


        if (kombiZero == 0){
            System.out.println("Te liczby co podałeś to mają tylko jedną kombinacje bez powtórzeń bubciu");
        }
        else if (kombiZero >= 1){

            for (int d = kombiZero; d >= 1; d--){
                kombiJeden *= d;
            }
        }

        int przedOstatniKrok = wynikK * kombiJeden;
        int krokOstatni = wynikN / przedOstatniKrok;
        System.out.println("Ilośc możliwych kombinacji bez powtórzeń: " + krokOstatni);

    }
}
