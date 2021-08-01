import java.util.Scanner;

public class delta {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double delta;

        System.out.println("Witaj, \nTen program pomoże ci w policzeniu delty i rozwiąże równanie kwadratowe.");


        System.out.println("Podaj zmienne a, b, c aby policzyć delte: ");
        System.out.print("a = ");
        double a = in.nextDouble();

        System.out.print("b = ");
        double b = in.nextDouble();

        System.out.print("c = ");
        double c = in.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta jest równa = " + delta);
        double sqrtDelta = Math.sqrt(delta);
        System.out.println("Pierwiastek z delty = " + sqrtDelta);

        if (delta > 0){
            double x1;
            double x2;

            x1 = (-b + sqrtDelta)/ (2 * a);
            x2 = (-b - sqrtDelta)/ (2 * a);

            System.out.println("Mamy dwa rozwiązania: " + x1 + " " + x2);

        }
        else if (delta == 0){
            double x0;

            x0 = -b/(2 * a);

            System.out.println("Delta jest równa 0 czyli mamy jedno rozwiązanie: " + x0);

        }
        else if (delta < 0){
            System.out.println("delta ujemna, brak rozwiązań");
        }

    }

}
