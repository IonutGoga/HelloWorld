package MyWork;

public class integerMethods {

    public static void main(String[] args) {

        Integer x = 123;
        Integer y = 5;
        String a = "abc";

        int x1 = x.compare(x, y);
        System.out.println(x1);

        int x2 = Integer.parseInt("30");
        int x3 = Integer.parseInt("25"); //transforma text in numar
        System.out.println(x2 + x3);


        if((x ^ y) > 10) { // ^ inseamna  - exclusive sau

            System.out.println(x);


        }

    }
}
