package SDAkademy.Week1;

public class PrimeNumbers {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        int i = 2;

        while (i <= n / 2 && isPrime == true) {
            if (n % i == 0) {
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }


    public static void main(String[] args) {


        int m = 100;

        int i = 2;
        while (i <= m) {
            boolean iIsPrime = isPrime(i);
            if (iIsPrime) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        int j = 2;
        int nrOfPrimesFound = 0;
        while (nrOfPrimesFound < m) {
            if(isPrime(j)){
                System.out.print(j + " ");
                nrOfPrimesFound++;
            }
            j++;
        }

    }
}
