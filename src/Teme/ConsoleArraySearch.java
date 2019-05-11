package Teme;
import java.util.Scanner;

public class ConsoleArraySearch {

    public static void main(String[] args) {

        int[] arr = {5, 34, 35, 36, 37, 38};

        Scanner input = new Scanner(System.in);

        System.out.print("input : ");

        int n = input.nextInt();
        int a;

        for(a = 0; a < arr.length; a++){

            if(arr[a] == n){

                System.out.println(arr[a]);
            }
        }
    }
}
