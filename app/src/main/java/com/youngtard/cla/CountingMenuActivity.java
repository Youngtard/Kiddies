package com.youngtard.cla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CountingMenuActivity extends AppCompatActivity {

    Button oneToTwenty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_menu);

        oneToTwenty = findViewById(R.id.btn_one_to_twenty);

        oneToTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountingMenuActivity.this, ClickAnywhereActivity.class);
                startActivity(intent);
            }
        });

    }
}
