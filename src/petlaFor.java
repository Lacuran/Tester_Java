public class petlaFor {

    public static void main(String[] args) {

        /*
        String[] animals = new String[] {"cat", "dog", "chicken", "bird"};

        for (int i = 0; i <= animals.length - 1; i++){
            System.out.println(animals[i]);
        }*/


        //for (int i = 0; i <= 10; i++){

            //System.out.println(i);

        double[] grades = new double[]{ 3.5, 2.0, 1.0, 5.0, 6.0, 4.5};
        double suma = 0;
        for (int i = 0; i <= grades.length-1; i++){
            suma += grades[i];

        }
        System.out.println(suma);
        System.out.println(suma/ grades.length);

        int i = 0;
        while (i <= grades.length-1){
            System.out.println(grades[i]);
            i++;
        }
    }
}
