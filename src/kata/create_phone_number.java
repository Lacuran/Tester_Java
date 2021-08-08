package kata;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class create_phone_number {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tablicaZNumerem[] = new int[9];
        System.out.println("Podaj numer telefonu: ");

        for (int i = 0; i < tablicaZNumerem.length; i++){
            tablicaZNumerem[i] = in.nextInt();
        }

        for (int i = 0; i < tablicaZNumerem.length; i++){
            System.out.print(tablicaZNumerem[i]);

            if (tablicaZNumerem[i] == tablicaZNumerem[2]){
                System.out.print("-");
            } else if (tablicaZNumerem[i] == tablicaZNumerem[5]){
                System.out.print("-");
            }
        }
    }

}
