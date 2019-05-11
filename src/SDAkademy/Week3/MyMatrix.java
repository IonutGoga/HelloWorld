package SDAkademy.Week3;
import java.util.Scanner;

public class MyMatrix {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int[][] ma = new int[3][4];


        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print("Introduceti valoare pentru: " + i + j + " " + ": ");
                ma[i][j] = s.nextInt();
            }
        }

        System.out.println(); // spatiu

        for(int i = 0; i < ma.length; i++){
            for(int j = 0; j < ma.length; j++){
                System.out.print(ma[i][j] + " ");
            }
            System.out.println(); //spatiu
        }
    }
}
