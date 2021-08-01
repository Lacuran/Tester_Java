package oop;

public class Runner {

    public static void main(String[] args) {

        Notebook n1 = new Notebook(3.4, "600g", "8gb", 5000);
        Notebook n2 = new Notebook(5.6, "400g", "4gb", 1499.60);
        System.out.println(n1.ghz);
        System.out.println(n1.waga);
        System.out.println(n1.ram);
        System.out.println(n1.price);
        String something = n1.firstMetod(" mlem mlelm");
        System.out.println(something);
        System.out.println(n1.checkQuality());
        System.out.println("---------------------");
        System.out.println(n2.ghz);
        System.out.println(n2.waga);
        System.out.println(n2.ram);
        System.out.println(n2.price);
        String something2 = n2.firstMetod(" dupa jasiu");
        System.out.println(something2);
        System.out.println(n2.checkQuality());
    }



}
