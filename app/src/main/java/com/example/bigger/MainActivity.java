package com.example.bigger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout t;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.background);
        Button b1 = (Button)findViewById(R.id.changeLayout1);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }

    int size = 15;

    public void bigger(View v){
        TextView big;
        big = findViewById(R.id.content);
        big.setTextSize(size++);
    }

    public void smaller(View v){
        TextView small;
        small = findViewById(R.id.content);
        small.setTextSize(size--);
    }

    public void enter(View v){
        EditText ed1;
        TextView txv;
        ed1 =findViewById(R.id.editText);
        txv = findViewById(R.id.content);
        txv.setMovementMethod(new ScrollingMovementMethod());
        txv.setTextSize(30);
        txv.setText(ed1.getText().toString());
    }

    public void clear(View v){
        TextView clear;
        clear = findViewById(R.id.content);
        clear.setText("");
    }

    public void changeColorRandom (View v) {
        Random x = new Random();
        int r = x.nextInt(256);
        int b = x.nextInt(256);
        int g = x.nextInt(256);
        TextView t = findViewById(R.id.content);
        t.setTextColor(Color.rgb(r,g,b));
    }

    public void changeTextColorR (View v) {
        TextView changeR = findViewById(R.id.content);
        changeR.setBackgroundColor(Color.rgb(255,0,0));
    }

    public void changeTextColorG (View v) {
        TextView changeG = findViewById(R.id.content);
        changeG.setBackgroundColor(Color.rgb(0,255,0));
    }

    public void changeTextColorB (View v) {
        TextView changeB = findViewById(R.id.content);
        changeB.setBackgroundColor(Color.rgb(0,0,255));
    }

    public void changeBGColorP (View v) {
        t.setBackgroundColor(Color.rgb(255,192,203));
    }

    public void changeBGColorYG (View v) {
        t.setBackgroundColor(Color.rgb(124,252,203));
    }

    public void changeBGColorC (View v) {
        t.setBackgroundColor(Color.rgb(0,255,255));
    }
}
