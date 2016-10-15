package com.example.mikah.week05prove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        String book = getIntent().getExtras().getString("book");
        String chapter = getIntent().getStringExtra("chapter");
        String verse = getIntent().getStringExtra("verse");

        String output = "Your favorite scripture is: " + book + " " + chapter + ":" + verse;

        final TextView textBox = (TextView) findViewById(R.id.scriptureView);

        textBox.setText(output);
    }
}
