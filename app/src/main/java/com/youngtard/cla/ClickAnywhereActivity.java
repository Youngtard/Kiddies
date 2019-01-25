package com.youngtard.cla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class ClickAnywhereActivity extends AppCompatActivity {
    ViewGroup viewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_anywhere);

        viewGroup = findViewById(R.id.vg_click_anywhere);

        viewGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClickAnywhereActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
