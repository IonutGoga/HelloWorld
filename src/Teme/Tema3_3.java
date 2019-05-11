package Teme;
import java.util.Scanner;

public class Tema3_3 {

    public static void main(String[] args) {


        System.out.print("Enter date: ");

        Scanner scanner = new Scanner(System.in);
        String myDate = scanner.nextLine();



        if (myDate.length() <= 8){

            System.out.println("Year: " + myDate.substring(0,4));
            System.out.println("Mounth: " + myDate.substring(4, 6));
            System.out.println("Day: " + myDate.substring(6,8));
        } else if (myDate.contains("/") && myDate.length() <= 10) {

            String[] x  = myDate.split("/", 3);

            System.out.println("Year: " + x[0] + "\n" + "Mounth: " + x[1] + "\n" + "Day: " + x[2]);


        } else if (myDate.contains(" ") && myDate.length() <= 10){

            String[] x  = myDate.split(" ", 3);
            System.out.println("Year: " + x[0] + "\n" + "Mounth: " + x[1] + "\n" + "Day: " + x[2]);

        } else if (myDate.contains(",") && myDate.length() <= 10){

            String[] x  = myDate.split(",", 3);
            System.out.println("Year: " + x[0] + "\n" + "Mounth: " + x[1] + "\n" + "Day: " + x[2]);
        } else {

            System.out.print("Error");
        }

    }

}
