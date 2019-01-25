//package com.youngtard.cla;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import org.w3c.dom.Text;
//
//import java.util.Random;
//
//public class ColorsActivity extends AppCompatActivity {
//    ViewGroup bg;
//    TextView tv_color;
//    Button goLeft;
//    Button goRight;
//
//    Random rand = new Random();
//
//    private static final int red = R.color.red;
//    private static final int orange = R.color.orange;
//    private static final int yellow = R.color.yellow;
//    private static final int green = R.color.green;
//    private static final int blue = R.color.blue;
//    private static final int purple = R.color.purple;
//    private static final int white = R.color.white;
//    private static final int black = R.color.black;
//
//    int[] colors = new int[]{red, orange, yellow, green, blue, purple, white, black};
//    String[] colors2 = new String[]{"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PURPLE", "WHITE", "BLACK"};
//
//    int colorsCount;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_colors);
//
//
//        bg = findViewById(R.id.bg_colors);
//        tv_color = findViewById(R.id.tv_color);
//        goLeft = findViewById(R.id.btn_go_left_t);
//        goRight = findViewById(R.id.btn_go_right_t);
//
//        goLeft.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String currentColor = getCurrentColor();
//                colorsCount = colors.length - 1;
//                --colorsCount;
//                if(colorsCount != 0) {
//                    tv_color.setText(colors2[colorsCount]);
//                    tv_color.setTextColor(colors[colorsCount]);
//                }
//
//            }
//        });
//
//        goRight.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String currentColor = getCurrentColor();
//                colorsCount = colors.length - 1;
//
//                tv_color.setText();
//                tv_color.setTextColor();
//
//            }
//        });
//
//
//
//        bg.setBackgroundColor(colors[rand.nextInt(colors.length - 1)]);
//
//
//
//
//    }
//
//    private String getCurrentColor() {
//        String color = tv_color.getText().toString().toLowerCase();
//
//        return color;
//    }
//}
