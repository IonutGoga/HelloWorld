package Teme;

public class Tema3_1 {

    public static void main(String[] args) {

        Integer[] arr = new Integer[10];

        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 12;
        arr[3] = 7;
        arr[4] = 8;
        arr[5] = 10;
        arr[6] = 3;
        arr[7] = 7;
        arr[8] = 13;
        arr[9] = 16;


        for(int i = 0; i < arr.length - 1; i++){

            for(int j = i + 1; j < arr.length; j++){

               if(arr[i].equals(arr[j])){

                   System.out.println(arr[j]);

               }

            }

        }

    }



}
