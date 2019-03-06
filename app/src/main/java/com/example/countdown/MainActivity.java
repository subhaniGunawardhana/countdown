package com.example.countdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countdown();
    }
    private void countdown(){
        TextView textView2 = findViewById(R.id.textView2);
        Handler handler = new Handler();
    }
}
