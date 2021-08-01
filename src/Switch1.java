import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj Liczbe: ");
        int number = in.nextInt();
        switch (number){
            case 1:
                System.out.println("Znak Specjalny dla tej liczby to: !");
                break;
            case 2:
                System.out.println("Znak Specjalny dla tej liczby to: @");
                break;
            case 3:
                System.out.println("Znak Specjalny dla tej liczby to: #");
                break;
            case 4:
                System.out.println("Znak Specjalny dla tej liczby to: $");
                break;
            case 5:
                System.out.println("Znak Specjalny dla tej liczby to: %");
                break;
            case 6:
                System.out.println("Znak Specjalny dla tej liczby to: ^");
                break;
            case 7:
                System.out.println("Znak Specjalny dla tej liczby to: 7");
                break;
            case 8:
                System.out.println("Znak Specjalny dla tej liczby to: *");
                break;
            case 9:
                System.out.println("Znak Specjalny dla tej liczby to: (");
                break;
            case 0:
                System.out.println("Znak Specjalny dla tej liczby to: )");
                break;
            default:
                System.out.println("Ta liczba nie ma znaku");
        }
    }
}
