package com.example.randomnumberupto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String a = intent.getStringExtra("maxNo");
        TextView textView = findViewById(R.id.txt);
        Button rnd = findViewById(R.id.randombutton);

        rnd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int val = random.nextInt(Integer.parseInt(a));
                textView.setText(Integer.toString(val));
            }
        });
    }
}