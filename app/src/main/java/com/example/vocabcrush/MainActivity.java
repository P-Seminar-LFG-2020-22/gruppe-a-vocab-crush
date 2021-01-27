package com.example.vocabcrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView startscreen;
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capture the layout's TextView and set the string as its text
        startscreen = (ImageView) findViewById(R.id.Startscreen);

        start = (Button) findViewById(R.id.start_button);
    }

    public void click_start(View view) {
        Intent home = new Intent(this, HomeScreen.class);
        startActivity(home);
    }
}