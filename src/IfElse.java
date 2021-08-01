import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Karolu podaj wiek: ");
        int karolAge = in.nextInt();

        if (karolAge >= 18) {
            System.out.println("Karol jest Pełnoletni");
        }
        else if (karolAge == 17){
            System.out.println("No prawie prawie, jeszcze roczek ci brakuje");
        }
        else if (karolAge == 16){
            System.out.println("Wracaj do nauki młodociany młocie");
        }
        else {
            System.out.println("Karol nie jest pełnoletni");
        }
    }
}
