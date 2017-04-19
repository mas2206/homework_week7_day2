package example.codeclan.com.wordcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WordCounterActivity extends AppCompatActivity {

    private EditText promptEditText;
    private Button getCountButton;
    private TextView myResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        promptEditText = (EditText) findViewById(R.id.prompt_text);
        getCountButton = (Button) findViewById(R.id.word_count_button);
        myResult = (TextView) findViewById(R.id.answer_text);
    }

    public void onWordCountButtonClicked(View button){
        WordCounter words = new WordCounter();
        String userInput = promptEditText.getText().toString();
        int totalWordCount = words.returnWordCount(userInput);
        myResult.setText(totalWordCount + "");
    }

}
