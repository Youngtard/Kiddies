package com.youngtard.cla;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//logo
//app name
//english alphasbets

public class MainMenu extends AppCompatActivity {
    Button counting;
    Button colors;
    Button letters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        counting = findViewById(R.id.btn_counting);
        colors = findViewById(R.id.btn_colors);
        letters = findViewById(R.id.btn_letters);


        counting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, CountingMenuActivity.class);
                startActivity(intent);

            }
        });

        letters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, LettersActivity.class);
                startActivity(intent);
            }
        });

//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainMenu.this, ColorsActivity.class);
//                startActivity(intent);
//            }
//        });




//        Uri path = Uri.parse("android.resource://com.youngtard.cla/" + resId);

        MediaPlayer mediaPlayer = android.media.MediaPlayer.create(this, R.raw.welcome);

        mediaPlayer.start();



    }

    @Override
    protected void onStart() {
        super.onStart();




    }
}
