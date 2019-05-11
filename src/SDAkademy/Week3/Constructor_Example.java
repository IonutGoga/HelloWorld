package SDAkademy.Week3;

public class Constructor_Example {

    public static void main(String[] args) {

        /*
        Square s = new Square();
        s.side = 5;

        GRESIT
        */


        Square s = new Square(5);
        System.out.println(s.side);

        Square s1 = new Square();
        s1.side = 7;
        System.out.println(s1.side);
    }

}
