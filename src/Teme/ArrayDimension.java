package Teme;


public class ArrayDimension {

    public static void main(String[] args) {

        //tema 2.2

        int[] arr = {5, 56, 74, 13, 22, 94};


        for(int n = 0; n < arr.length; n++){

            System.out.print(arr[n]+ " ");
        }


        System.out.println("\n");
        for( int i = arr.length - 1; i >= 0; i--){

            System.out.print(arr[i] + " ");

        }

    }
}
