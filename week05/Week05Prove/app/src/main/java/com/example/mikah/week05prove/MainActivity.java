package com.example.mikah.week05prove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.goButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final EditText bookBox = (EditText) findViewById(R.id.bookTextBox);
                final EditText chapterBox = (EditText) findViewById(R.id.chapterTextBox);
                final EditText verseBox = (EditText) findViewById(R.id.verseTextBox);
                Intent intent = new Intent(getBaseContext(), ShareActivity.class);
                intent.putExtra("book", bookBox.getText().toString());
                intent.putExtra("chapter", chapterBox.getText().toString());
                intent.putExtra("verse", verseBox.getText().toString());
                startActivity(intent);
            }
        });
    }
}
