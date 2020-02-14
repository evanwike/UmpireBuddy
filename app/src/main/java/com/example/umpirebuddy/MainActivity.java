package com.example.umpirebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_strikes, txt_balls, txt_outs;
    Button btn_strikes, btn_balls, btn_outs, btn_reset, btn_exit;
    int strikes, balls, outs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_strikes = findViewById(R.id.txt_strikes);
        txt_balls = findViewById(R.id.txt_balls);
        txt_outs = findViewById(R.id.txt_outs);
        btn_strikes = findViewById(R.id.btn_strikes);
        btn_balls = findViewById(R.id.btn_balls);
        btn_outs = findViewById(R.id.btn_outs);
        btn_reset = findViewById(R.id.btn_reset);
        btn_exit = findViewById(R.id.btn_exit);

        strikes = 0;
        balls = 0;
        outs = 0;

        btn_strikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_strikes.setText(String.valueOf(++strikes));
            }
        });

        btn_balls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_balls.setText(String.valueOf(++balls));
            }
        });

        btn_outs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_outs.setText(String.valueOf(++outs));
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strikes = 0;
                balls = 0;
                outs = 0;

                txt_strikes.setText(strikes);
                txt_balls.setText(balls);
                txt_outs.setText(outs);
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
