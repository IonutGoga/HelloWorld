package SDAkademy.Week3;

public class ScopeExample {

    public static void main(String[] args) {

        System.out.println(Circle.PI);

        Circle.showPI();

        Circle c1 = new Circle();
        c1.radius = 6;

        Circle c2 = new Circle();
        c2.radius = 21;

        System.out.println(c1.radius);
        System.out.println(c2.radius);
        System.out.println();

        System.out.println(c1.calculateDiameter());
        System.out.println(c2.calculateDiameter());
        System.out.println();

        System.out.println(c1.calculateCircumference());
        System.out.println(c2.calculateCircumference());
        System.out.println();

        System.out.println(c1.calculateArea());
        System.out.println(c2.calculateArea());

    }
}
