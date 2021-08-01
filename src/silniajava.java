import java.util.Scanner;

public class silniajava {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj n aby policzyć silnie: n = ");

        int silnia = in.nextInt();
        int wynikSilnia = 1;

        if (silnia == 0) {
            System.out.println("Silnia jest równa 1");
        }
        else if (silnia >= 1){
            for (int i = silnia ; i >= 1 ; i--){
                wynikSilnia *= i;
            }
            System.out.println(silnia + "! =  " + wynikSilnia);
        }


        /*
        System.out.print("n = ");
        int n = in.nextInt();
        int i = 1, s=1;
        while(i<=n){
            s=s*i;
            i++;
        }
        System.out.print(n);
        System.out.print("! = ");
        System.out.println(s);
        */

    }

}
