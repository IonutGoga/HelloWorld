package SDAkademy.Week3;

public class My_String_Example {


    public static void main(String[] args) {

        String s1 = new String();
        String s2 = new String("abc");
        String s3 = "abcd";

        char c = 'c';
        char c2 = '\n';
        char c3 = '\\';

        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);

        String someMessage = "Ana are mere.";
        System.out.println(someMessage.length()); //lungimea

        System.out.println(someMessage.charAt(2)); //afiseaza al 3 lea caracter

        System.out.println(someMessage.indexOf('m')); //pozitia lui m

        System.out.println(someMessage.lastIndexOf('a')); //pizitia utimului a

        String emptyString = "";
        System.out.println(emptyString.isEmpty()); //boolean

        System.out.println(someMessage.substring(3, 7)); //afiseaza caracterele de la indexul 3 la indexul 7

        System.out.println(someMessage.toUpperCase());
        System.out.println(someMessage.toLowerCase());
        System.out.println(someMessage.concat( " si pere. "));

        someMessage = someMessage.concat(" si pere. ");
        System.out.println(someMessage);

        someMessage.replace(".", ""); //inlocuire character
        System.out.println(someMessage);

        //eliminates heading and trailling spaces
        String spacedMessage = "   sout    ";
        System.out.println(spacedMessage);
        spacedMessage = spacedMessage.trim();
        System.out.println(spacedMessage);

        String[] split = someMessage.split(" ");
        for (int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }

        System.out.println(someMessage.startsWith("Ana")); //boolean
        System.out.println(someMessage.endsWith("pere. ")); //boolean

        System.out.println("Comparing Strings: ");
        String m1 = "abc";
        String m2 = "abc";
        System.out.println(m1 == m2);
        m1 = m1 + "d";
        m2 = m2 + "d";
        System.out.println(m1.equals(m2)); //compar valori NU referinte

    }
}
