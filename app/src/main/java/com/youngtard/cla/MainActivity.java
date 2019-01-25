package com.youngtard.cla;


import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.TransitionManager;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Random;

//better font for number
//multiple display color for words
//welcome audio
//complete clap/praise


public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    Button goLeft;
    Button goRight;


    ViewGroup transitionsContainer;


    TextView number;
    TextView numberInWords;

    android.media.MediaPlayer mediaPlayer;

    private static final int oneR = R.raw.one;
    private static final int twoR = R.raw.two;
    private static final int threeR = R.raw.three;
    private static final int fourR = R.raw.four;
    private static final int fiveR = R.raw.five;
    private static final int sixR = R.raw.six;
    private static final int sevenR = R.raw.seven;
    private static final int eightR = R.raw.eight;
    private static final int nineR = R.raw.nine;
    private static final int tenR = R.raw.ten;
    private static final int elevenR = R.raw.eleven;
    private static final int twelveR = R.raw.twelve;
    private static final int thirteenR = R.raw.thirteen;
    private static final int fourteenR = R.raw.fourteen;
    private static final int fifteenR = R.raw.fifteen;
    private static final int sixteenR = R.raw.sixteen;
    private static final int seventeenR = R.raw.seventeen;
    private static final int eighteenR = R.raw.eighteen;
    private static final int nineteenR = R.raw.nineteen;
    private static final int twentyR = R.raw.twenty;

    private static final int redPink = R.color.pink_red;
    private static final int green = R.color.success_dark;
    private static final int primary = R.color.colorPrimaryDark;
    private static final int other = R.color.other;

    int[] colors = new  int[]{redPink, green, primary, other};






    Numbers one = new Numbers("one", oneR);
    Numbers two = new Numbers("two", twoR);
    Numbers three = new Numbers("three", threeR);
    Numbers four = new Numbers("four", fourR);
    Numbers five = new Numbers("five", fiveR);
    Numbers six = new Numbers("six", sixR);
    Numbers seven = new Numbers("seven", sevenR);
    Numbers eight = new Numbers("eight", eightR);
    Numbers nine = new Numbers("nine", nineR);
    Numbers ten = new Numbers("ten", tenR);
    Numbers eleven = new Numbers("eleven", elevenR);
    Numbers twelve = new Numbers("twelve", twelveR);
    Numbers thirteen = new Numbers("thirteen", thirteenR);
    Numbers fourteen = new Numbers("fourteen", fourteenR);
    Numbers fifteen = new Numbers("fifteen", fifteenR);
    Numbers sixteen = new Numbers("sixteen", sixteenR);
    Numbers seventeen = new Numbers("seventeen", seventeenR);
    Numbers eighteen = new Numbers("eighteen", eighteenR);
    Numbers nineteen = new Numbers("nineteen", nineteenR);
    Numbers twenty = new Numbers("twenty", twentyR);

//    private HashMap<String, Integer> numbersList = new HashMap<>();

    Numbers[] numbersList = new Numbers[]{one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty};







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goLeft = findViewById(R.id.btn_go_left);
        goRight = findViewById(R.id.btn_go_right);


        transitionsContainer = findViewById(R.id.transitions_container);

        number = findViewById(R.id.tv_number);
        numberInWords = findViewById(R.id.tv_number_in_words);
//        numberInWords.setVisibility(View.INVISIBLE);


        //TODO PUT IN onStart?
        mediaPlayer = android.media.MediaPlayer.create(this, R.raw.one);
        mediaPlayer.start();


    }

    @Override
    protected void onStart() {
        super.onStart();

//        transitionsContainer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                runTransitions();
//
//            }
//        });


        //TODO: Register listeners in onCreate?
        goRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runTransitions();
            }
        });

        goLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runTransitionsToLeft();
            }
        });


    }

    private int getNumber() {
        int currentNumber = Integer.parseInt(number.getText().toString());

        return currentNumber;
    }

    ;

    private void runTransitions() {
        mediaPlayer.release();

//        TransitionManager.beginDelayedTransition(transitionsContainer, new ChangeBounds());

//                Toast.makeText(MainActivity.this, "I was clicked", Toast.LENGTH_SHORT).show();
        int currentNumber = getNumber();

        if (currentNumber == 20) {
            return;
        }

        int numberIncrement = ++currentNumber;

        number.setText(numberIncrement + "");


//        for(String l : numberInWords.getText().toString()) {
//
//        }

//        numberInWords.setText(Html.fromHtml());

        Random rand = new Random();

//        int  n = rand.nextInt(4) + 1;
//        numberInWords.setTextColor(getResources().getColor(colors[rand.nextInt(3)]));
        numberInWords.setText(numbersList[numberIncrement - 1].getWord().toUpperCase());

        int resId = numbersList[numberIncrement-1].getRes();

        Uri path = Uri.parse("android.resource://com.youngtard.cla/" + resId);


        mediaPlayer = android.media.MediaPlayer.create(this, path);
        mediaPlayer.start();


    }

    private void runTransitionsToLeft() {
        mediaPlayer.release();

//        TransitionManager.beginDelayedTransition(transitionsContainer, new ChangeBounds());

//                Toast.makeText(MainActivity.this, "I was clicked", Toast.LENGTH_SHORT).show();
        int currentNumber = getNumber();

        if (currentNumber == 1) {
            return;
        }

        int numberDecrement = --currentNumber;

        number.setText(numberDecrement + "");

        Random rand = new Random();

//        int  n = rand.nextInt(4) + 1;
//        int currentColor = getResources().getColor(R.id.tv_number_in_words);

//        numberInWords.setTextColor(getResources().getColor(colors[rand.nextInt(3)]));
        numberInWords.setText(numbersList[numberDecrement - 1].getWord().toUpperCase());


        int resId = numbersList[numberDecrement-1].getRes();

        Uri path = Uri.parse("android.resource://com.youngtard.cla/" + resId);


        mediaPlayer = android.media.MediaPlayer.create(this, path);

        mediaPlayer.start();



    }


    @Override
    public void onCompletion(MediaPlayer mp) {

        mp.release();

    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//
//        Intent intent = new Intent(MainActivity.this, CountingMenuActivity.class);
//        startActivity(intent);
//    }
}
