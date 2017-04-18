package example.codeclan.com.wordcounterapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordCounterTest {

    @Test
    public void wordCountTest(){
        WordCounter words = new WordCounter();
        assertEquals(5, words.returnWordCount("Five words in a sentence"));
    }

}