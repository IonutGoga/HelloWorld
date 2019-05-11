package Teme;

public class Tema3 {

    public static void main(String[] args) {

        int n = 1;


        while(n < 10){
            int sum = (n += n);
            System.out.println(sum);
        }
    }
}
