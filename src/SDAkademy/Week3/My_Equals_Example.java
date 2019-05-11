package SDAkademy.Week3;

public class My_Equals_Example {

    public static void main(String[] args) {

        System.out.println("Comparing Strings");
        String m1 = "abc";
        String m2 = "abc";
        System.out.println(m1 == m2);
        m1 = m1 + "d";
        m2 = m2 + "d";
        System.out.println(m1.equals(m2)); //compar valori NU referinte

        String m3 = "abc";
        String m4 = "ab";
        m4 = m4 + "c";
        System.out.println(m3 == m4); //false
    }
}
