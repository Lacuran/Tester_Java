import java.util.Arrays;

public class firstArray {

    public static void main(String[] args) {

        String[] arrayJeden = new String[5];

        arrayJeden[0] = "Kornel";
        arrayJeden[1] = "Wrzesień";
        arrayJeden[2] = "Magazynier";
        arrayJeden[3] = "Kot";
        arrayJeden[4] = "Perkusja";

        System.out.println(arrayJeden[0] + ", " + arrayJeden[4]);

        System.out.println(Arrays.toString(arrayJeden));

        int rozmiarTab = arrayJeden.length;
        System.out.println(rozmiarTab);

        String[] zwierz = new String[] {"kot", "pies", "ptak", "słoń", "Jerry"};


        for (int i = 0; i <= arrayJeden.length-1 ; i++){
            System.out.println(arrayJeden[i]);

        }
    }
}
