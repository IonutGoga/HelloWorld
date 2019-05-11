package SDAkademy.Week1;

public class SmallPrintPractice {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10){
            System.out.println(i);
            i++;
        }

        int j = 0;
        while(j < 10){
            System.out.print(j);
            j++;
        }
        System.out.println();

        int k1 = 0;
        while(k1 < 10){
            int sum = 0;
            int k2 = 0;
            while(k2 < k1){
                sum = sum + k2;
                k2++;
            }
            System.out.println("Suma este " + sum);
            k1++;
        }
    }
}
