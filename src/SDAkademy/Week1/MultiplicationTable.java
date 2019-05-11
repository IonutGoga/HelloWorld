package SDAkademy.Week1;

public class MultiplicationTable {

    public static void main(String[] args) {

        int i = 0, j = 0;
        int k = 0;

        while(i <= 10) {
            while(j <= 10) {
                if(k <= 10) {
                    System.out.println(i + " * " + k + " = " + i * j);
                    j++;
                    k++;
                }
            }
            System.out.println();
            j = 1;
            i++;
            k = 1;
        }
    }

    public static class CMMDC {

        public static void main(String[] args) {
            int a = 16;
            int b = 28;
            if(a != 0) {
                while (a != b){
                    if(a > b){
                        a -= b;
                    } else {
                        b -= a;
                    }
                }
            }
            System.out.println(b);
        }
    }
}

