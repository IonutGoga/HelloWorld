package SDAkademy.Week3;

public class Circle {

    public static double PI = 3.14;

    public static void showPI(){

        System.out.println(PI);
    }


    public double radius;

    public double calculateDiameter(){

        return 2 * this.radius;
    }

    public double calculateCircumference(){

        return 2 * PI * this.radius;
    }

    public double calculateArea(){

        return PI * this.radius * this.radius;
        // radius este o proprietate de instanta

    }

}
