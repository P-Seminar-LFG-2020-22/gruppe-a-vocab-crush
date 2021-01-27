package com.example.vocabcrush;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Add extends AppCompatActivity {

    TextView hinzufügen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_add);

        // Get the Intent that started this activity and extract the string
        Intent add = getIntent();

        hinzufügen = (TextView) findViewById(R.id.hinzufügen);
    }
}
