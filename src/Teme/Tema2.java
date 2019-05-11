package Teme;

public class Tema2 {

    public static void main(String[] args) {

        int n = 1;
        int m = 3;
        while(n < 30){
            if(n % m == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
