package Teme.Teme11May;

public class StringDataCounter {

    public static void main(String[] args) {


       String input = "Notre Dame is a very old cathedral in Paris, France. It is one of France's most famous landmarks and many people visit it each year. The cathedral is on a small island on the River Seine. It is the cathedral of the Catholic Archdiocese of Paris, one of 23 archdioceses in France. The cathedral was built during two centuries. It is a very good example of Gothic Architecture in France. At the time it was finished, the cathedral was the biggest such building in Western Europe. Between 1844 and 1864, the building was renovated under the direction of Eugène Viollet-le-Duc, who incorporated elements into the design that the medieval building had not possessed before. The two rose windows which ornate the transept are among the biggest in Europe: each has a diameter of 13m. " ;


        StringDataCounter_Methods b = new StringDataCounter_Methods();
        b.countWords(input);
        b.countVowels(input);
        b.countSentences(input);
    }
}
