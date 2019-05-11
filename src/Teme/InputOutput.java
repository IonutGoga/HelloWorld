package Teme;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        int n, i;
        int s = 0;

        System.out.println("Enter number: ");

        Scanner output = new Scanner(System.in);

        n = output.nextInt();


        for (i = 1; i <= n; i++) {
            s = s * 10 + i;
            System.out.println(s + " ");
        }
    }
}
