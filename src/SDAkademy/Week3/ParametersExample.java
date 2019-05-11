package SDAkademy.Week3;

public class ParametersExample {

    public static void incrementValue(int n){
        n++;
    }

    public static void incrementValue(Circle c){
        c.radius++;
    }

    public static void main(String[] args) {

        int n =7;
        System.out.println(n);
        incrementValue(n);
        System.out.println(n);

        Integer x = null;
        System.out.println(x);

        Circle c = new Circle();
        c.radius = 7;
        System.out.println(c.radius);
        incrementValue(c);
        System.out.println(c.radius);


    }
}
