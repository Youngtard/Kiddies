package com.youngtard.cla;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LettersActivity extends AppCompatActivity {
    private TextView letter;
    private Button goLeft;
    private Button goRight;

    android.media.MediaPlayer mediaPlayer;


    private static final int a = R.raw.a;
    private static final int b = R.raw.b;
    private static final int c = R.raw.c;
    private static final int d = R.raw.d;
    private static final int e = R.raw.e;
    private static final int f = R.raw.f;
    private static final int g = R.raw.g;
    private static final int h = R.raw.h;
    private static final int i = R.raw.i;
    private static final int j = R.raw.j;
    private static final int k = R.raw.k;
    private static final int l = R.raw.l;
    private static final int m = R.raw.m;
    private static final int n = R.raw.n;
    private static final int o = R.raw.o;
    private static final int p = R.raw.p;
    private static final int q = R.raw.q;
    private static final int r = R.raw.r;
    private static final int s = R.raw.s;
    private static final int t = R.raw.t;
    private static final int u = R.raw.u;
    private static final int v = R.raw.v;
    private static final int w = R.raw.w;
    private static final int x = R.raw.x;
    private static final int y = R.raw.y;
    private static final int z = R.raw.z;

    int[] letters = new int[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};


    Letters aa = new Letters(65, a);
    Letters bb = new Letters(66, b);
    Letters cc = new Letters(67, c);
    Letters dd = new Letters(68, d);
    Letters ee = new Letters(69, e);
    Letters ff = new Letters(70, f);
    Letters gg = new Letters(71, g);
    Letters hh = new Letters(72, h);
    Letters ii = new Letters(73, i);
    Letters jj = new Letters(74, j);
    Letters kk = new Letters(75, k);
    Letters ll = new Letters(76, l);
    //TODo Why no mm?
    Letters mmm = new Letters(77, m);
    Letters nn = new Letters(78, n);
    Letters oo = new Letters(79, o);
    Letters pp = new Letters(80, p);
    Letters qq = new Letters(81, q);
    Letters rr = new Letters(82, r);
    Letters ss = new Letters(83, s);
    Letters tt = new Letters(84, t);
    Letters uu = new Letters(85, u);
    Letters vv = new Letters(86, v);
    Letters ww = new Letters(87, w);
    Letters xx = new Letters(88, x);
    Letters yy = new Letters(89, y);
    Letters zz = new Letters(90, z);

    Letters[] letters2 = new Letters[]{aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk, ll, mmm, nn, oo, pp, qq, rr, ss, tt, uu, vv, ww, xx, yy, zz};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);

        letter = findViewById(R.id.tv_letter);
        goLeft = findViewById(R.id.btn_go_left_tt);
        goRight = findViewById(R.id.btn_go_right_tt);


        //TODO PUT IN onStart?
        mediaPlayer = android.media.MediaPlayer.create(this, R.raw.a);
        mediaPlayer.start();

        goRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rightTransition();

            }
        });

        goLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goLeftTransition();


            }
        });


    }


//    find a in array
//get index
//increment index
//    set text to increment value

    private String getCurrentLetter() {

        return letter.getText().toString();
    }

    private void rightTransition() {
        mediaPlayer.release();
        String currentLetter = getCurrentLetter();
        char c = currentLetter.charAt(0);
        int resID = 0;

        if (c != 90) {

            ++c;

            letter.setText(String.valueOf(c));

            for (int i = 0, j = 65; i < letters2.length; i++, j++) {
                if (letters2[i].getCp() == c) {
                    resID = letters2[i].getResID();


                }
            }

            Uri path = Uri.parse("android.resource://com.youngtard.cla/" + resID);

            mediaPlayer = android.media.MediaPlayer.create(this, path);
            mediaPlayer.start();


        }
    }

    private void goLeftTransition() {

        mediaPlayer.release();
        String currentLetter = getCurrentLetter();
        char c = currentLetter.charAt(0);
        int resID = 0;

        if (c != 65) {

            --c;

            letter.setText(String.valueOf(c));

            for (int i = 0, j = 65; i < letters2.length; i++, j++) {
                if (letters2[i].getCp() == c) {
                    resID = letters2[i].getResID();


                }
            }

            Uri path = Uri.parse("android.resource://com.youngtard.cla/" + resID);

            mediaPlayer = android.media.MediaPlayer.create(this, path);
            mediaPlayer.start();

        }

    }
}
