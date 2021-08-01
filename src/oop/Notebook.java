package oop;

public class Notebook {
    double ghz;
    String waga;
    String ram;
    double price;

    //KOnstruktor

    public Notebook (double ghz, String weight, String ram, double price){
        this.ghz = ghz;
        this.waga = weight;
        this.ram = ram;
        this.price = price;
    }

    public String firstMetod(String in) {
        return "first metod executed" + in;
    }

    public String checkQuality(){
        if (this.price > 2000 && this.ghz > 2.0){
            return "szybki i drogi";
        }
        else {
            return "tani i wolny";
        }
    }

}
