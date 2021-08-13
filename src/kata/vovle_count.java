package kata;
import java.util.Scanner;
public class vovle_count {
    public static void main(String[] args) {
        System.out.println("Podaj słowo lub zdanie aby je przeliterować i poznać ilość samogłosek: ");
        Scanner in = new Scanner(System.in);

        String x = in.nextLine();
        System.out.println("Twoje słowo lub zdanie to: " + x);

        int suma = 0;

        for (int i = 0; i < x.length(); i++) {
            char z = x.charAt(i);
            System.out.println("Literka przy indeksie " + i + " to: " + z );

            if (z == 'a' || z == 'u' || z == 'e' || z == 'i' || z == 'o'){
                suma++;
            }
        }
        System.out.println("Ilosć samogłosek: " + suma);


        System.out.println("Zdanie bez spacji: ");
        x = x.replaceAll("\\s","");
        System.out.println(x);
    }
}
