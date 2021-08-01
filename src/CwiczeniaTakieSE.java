public class CwiczeniaTakieSE {

    public static void main(String[] args) {

        int x = 3;
        int y = x < 4 ? --x : ++x;
        System.out.println(y);

        double r = Math.rint(9.5) + Math.rint(11.5);
        System.out.println(r);
    }
}
