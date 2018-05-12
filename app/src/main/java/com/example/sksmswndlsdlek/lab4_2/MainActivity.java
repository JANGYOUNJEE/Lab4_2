package com.example.sksmswndlsdlek.lab4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout BlueScreen;
    LinearLayout GreenScreen;

    Button Openbutton;
    Button Closebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlueScreen=(LinearLayout)findViewById(R.id.blue);
        GreenScreen=(LinearLayout)findViewById(R.id.green);

        Openbutton=(Button)findViewById(R.id.open);
        Closebutton=(Button)findViewById(R.id.close);

        Openbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate1);
                GreenScreen.startAnimation(anim);
                GreenScreen.setVisibility(View.VISIBLE);
            }
        });

        Closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate2);
                GreenScreen.startAnimation(anim);
                GreenScreen.setVisibility(View.GONE);
            }
        });
    }
}
