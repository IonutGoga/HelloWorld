package Teme;

import java.util.Scanner;

public class showExtension {

    public static void main(String[] args) {


        System.out.print("Type here: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String a = input.substring(input.lastIndexOf(".") + 1);

        System.out.println(a.toLowerCase());
        System.out.println(input.substring(1,4));
        System.out.println(input.lastIndexOf("."));
        System.out.println(input.substring(5));


    }

}
