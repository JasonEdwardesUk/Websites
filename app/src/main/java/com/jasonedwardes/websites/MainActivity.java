package com.jasonedwardes.websites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.one);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.two);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.three);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.four);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.five);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.six);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.seven);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.eight);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.nine);
        btn9.setOnClickListener(this);
        btn10 = findViewById(R.id.ten);
        btn10.setOnClickListener(this);
        btn11 = findViewById(R.id.eleven);
        btn11.setOnClickListener(this);
        btn12 = findViewById(R.id.twelve);
        btn12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.one:
                gotoUrl("https://www.ebay.com");
                break;
            case R.id.two:
                gotoUrl("https://www.amazon.com");
                break;
            case R.id.three:
                gotoUrl("https://www.youtube.com");
                break;
            case R.id.four:
                gotoUrl("https://androidforums.com");
                break;
            case R.id.five:
                break;
            case R.id.six:
                break;
            case R.id.seven:
                break;
            case R.id.eight:
                break;
            case R.id.nine:
                break;
            case R.id.ten:
                break;
            case R.id.eleven:
                break;
            case R.id.twelve:
                break;
        }
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}