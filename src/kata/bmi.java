package kata;

import java.util.Scanner;

class zmienne{
    double waga;
    double wzrost;
    double bmi;
}

public class bmi {


    public static void main(String[] args) {
        //program oblicza bmi
        zmienne obliczeniaBmi = new zmienne();
        Scanner in = new Scanner(System.in);


        System.out.println("Podaj wagę: ");
        obliczeniaBmi.waga = in.nextInt();

        System.out.println("Podaj wzrost: ");
        obliczeniaBmi.wzrost = in.nextInt();
        obliczeniaBmi.wzrost = obliczeniaBmi.wzrost / 100;

        obliczeniaBmi.bmi = obliczeniaBmi.waga/ (Math.pow(obliczeniaBmi.wzrost, 2.0));

        System.out.println("Twoje BMI to: " + String.format("%.2f", obliczeniaBmi.bmi));

        if (obliczeniaBmi.bmi <= 18.5){
            System.out.println("Niedowaga");
        }else if (obliczeniaBmi.bmi <= 25.0){
            System.out.println("Waga normalna");
        }else if (obliczeniaBmi.bmi <= 30.0){
            System.out.println("Nadwaga");
        }else if (obliczeniaBmi.bmi > 30.0){
            System.out.println("Otyłość");
        }

    }
}
