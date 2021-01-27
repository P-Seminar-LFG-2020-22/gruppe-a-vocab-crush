package com.example.vocabcrush;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {
    Button add, play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        // Get the Intent that started this activity and extract the string
        Intent home = getIntent();


        add = (Button) findViewById(R.id.add_deck);
        play = (Button) findViewById(R.id.chose_deck);
    }

    public void click_add(View view){
        Intent add = new Intent(this, Add.class);
        startActivity(add);
    }

    public void click_chose_deck(View view){
        Intent chose_deck = new Intent(this, Chose_Deck.class);
        startActivity(chose_deck);
    }


}

