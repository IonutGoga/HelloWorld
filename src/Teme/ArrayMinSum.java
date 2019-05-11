package Teme;

import java.util.*;

public class ArrayMinSum {

    public static void main(String[] args) {

        int[] arr = {5, 17, 2, 9, 34, 77, 91, 23, 11, 4};

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter minSum: ");
        int minSum = scan.nextInt();


        int sum = 0;
        int i = 0;


        while (sum < minSum) {

            sum = sum + arr[i];
            System.out.print(arr[i] + ", ");
            i++;
        }
        System.out.println();
        System.out.println(sum);
    }

}

