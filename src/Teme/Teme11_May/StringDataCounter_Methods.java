package Teme.Teme11_May;


public class StringDataCounter_Methods {


    public void countWords(String input){

        String[] x = input.split(" ");

        System.out.println(x.length);
    }

    public void countVowels(String input){

        int y = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u')
            {
                y++;
            }
        }
        System.out.println(y);
    }

    public void countSentences(String input){
        int y = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '.' || input.charAt(i) == ',' || input.charAt(i) == '?' ||
            input.charAt(i) == '!' || input.charAt(i) == ';' || input.charAt(i) == ':'){
                y++;
            }
        }
        System.out.println(y);
    }
}
