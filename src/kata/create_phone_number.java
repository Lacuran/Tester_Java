package kata;

import java.util.Scanner;

public class create_phone_number {

    public static void main(String[] args) {
        //ćwiczenie z codewars które polegało na zmiane formatu nr telefonu i dodanie od niego "-"


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj numer telefonu: ");

        int nrTel = in.nextInt();
        int lenght = String.valueOf(nrTel).length();

        if (lenght > 9){
            System.out.println("Za długi nr telefonu.");
        }
        else {
            String telefon = String.valueOf(nrTel);
            String poprawnyFormat = telefon.substring(0,3) + "-" + telefon.substring(3,6) + "-" + telefon.substring(6);
            System.out.println(poprawnyFormat);
        }
    }
}
