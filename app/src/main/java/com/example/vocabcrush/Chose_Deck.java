package com.example.vocabcrush;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Chose_Deck extends AppCompatActivity {

    TextView auswählen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_chose_deck);

        // Get the Intent that started this activity and extract the string
        Intent chose_deck = getIntent();

        auswählen = (TextView) findViewById(R.id.auswählen);
    }
}

