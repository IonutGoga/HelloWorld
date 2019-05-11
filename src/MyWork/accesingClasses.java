package MyWork;


public class accesingClasses {

    public static void main(String[] args){



        System.out.println(clasaMea("Ionut"));
        System.out.println(x(2,4));

        System.out.println(clasaMea2() + "Ionut");
    }

    public static String clasaMea(String name) {

            return name;

    }

    public static int x(int a, int b){

        String c = new String("adb");
        int sum = a + b + c.length();
        return sum;
    }

    public static String clasaMea2(){

        String nume2 = "Numele meu este: ";
        return nume2;
    }
}
