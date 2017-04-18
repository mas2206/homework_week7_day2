package example.codeclan.com.wordcounterapp;

/**
 * Created by user on 18/04/2017.
 */

public class WordCounter {

    private String userInput;

    public WordCounter(){
        userInput = new String();
    }

    public int returnWordCount(String sentence){
        String trim = sentence.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }


}
