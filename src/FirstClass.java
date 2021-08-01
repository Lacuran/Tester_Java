public class FirstClass {

    public static void main(String[] args) {

        System.out.println("Sup Nigga!!!");
        System.out.println("standardowy tekst");

        String tekstA = "przykładowy tekst";
        String tekstB = "inny przykładowy tekst";
        System.out.println("Jeszcze tak można" + " " +  tekstA + " " + tekstB);

        String imie = "Konrel";
        String nazwisko = "Wrzesien";
        int wiek = 30;
        char plec = 'M';
        int wzrost = 168;
        double waga = 65.5;
        boolean czyJestPelnoletni = wiek > 18;



        System.out.println(imie + " " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Płeć: " + plec);
        System.out.println("Wzrost " + wzrost);
        System.out.println("Waga " + waga);
        System.out.println("Ma latka?" + " " +czyJestPelnoletni);

        if (wiek > 18){
            System.out.println("Jest Pełnoletni");
        }


    }
}
