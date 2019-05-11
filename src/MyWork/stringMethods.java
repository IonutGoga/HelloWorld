package MyWork;

public class stringMethods {

    public static void main(String[] args) {

        String a = "Ionut Goga invata";
        String b = "Ionut Goga invata";

        String a1 = String.format("value is %s",101);
        System.out.println(a1);

        String a2 = a.substring(0, 5);
        System.out.println(a2);

        boolean a3 = a.equals(b); //true
        System.out.println(a3);

        String a4 = a.replace(" ", ".");
        System.out.println(a4);

        String[] a5 = a.split(" ", 3); //  limit for the number of strings in array
        System.out.print(a5[0] +  "\n" + a5[1] + "\n" + a5[2]) ;


    }
}
