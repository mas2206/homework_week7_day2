package example.codeclan.com.wordcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCounterActivity extends AppCompatActivity {

    private EditText promptEditText;
    private Button getCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        promptEditText = (EditText) findViewById(R.id.prompt_text);
        getCountButton = (Button) findViewById(R.id.word_count_button);
    }

    public void onWordCountButtonClicked(View button){
        WordCounter words = new WordCounter();
        String userInput = words.returnWordCount(userInput);
    }

}
