import java.util.Arrays;
import java.util.Scanner;

public class secondArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = in.nextLine();
        System.out.print("Podaj zawód: ");
        String zawod = in.nextLine();


        String[] dane = new String[] {imie, zawod};

        System.out.println("Tablica z twoimi danymi: " + Arrays.toString(dane));
        System.out.println("Pierwszy element tablicy: " + dane[0]);
        System.out.println("Drugi element tablicy: " + dane[1]);

    }
}
