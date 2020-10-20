package com.example.donarhub1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    RatingBar rb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        rb = (RatingBar) findViewById(R.id.ratingBar);
        tv = (TextView) findViewById(R.id.textView2);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv.setText(String.valueOf(v));
            }
        });
    }
}

