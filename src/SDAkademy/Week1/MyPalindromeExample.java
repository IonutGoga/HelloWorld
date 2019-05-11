package SDAkademy.Week1;
import java.util.Scanner;

public class MyPalindromeExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int initialN = n;
        int mirroredN = 0;

        while(n > 0){
            int digit = n % 10;

            System.out.println("am descoperit cifra " + digit);

            n = n / 10;

            System.out.println("n este acum " + n);

            mirroredN = mirroredN * 10 + digit;

            System.out.println("mirrored n este "+ mirroredN);
        }

        System.out.println("n initial este " + initialN);
        System.out.println("mirrored n este " + mirroredN);

        if(initialN == mirroredN){
            System.out.println("numarul este palindrom");
        } else {
            System.out.println("numarul NU este palindrom");
        }

    }
}
