package com.example.randomnumberupto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText max;
    Button enter;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        max = findViewById(R.id.maxNumber);
        enter = findViewById(R.id.enterbutton);
        txt = findViewById(R.id.entertext);

    }

    public void numberactvity(View view) {

        String a = max.getText().toString().trim();

        if (a.isEmpty()){
            Toast.makeText(this,"Invalid Input",Toast.LENGTH_LONG).show();

        }
        else{

            Toast.makeText(this,"Numbers upto "+a ,Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this,MainActivity2.class);
            intent.putExtra("maxNo",a);
            startActivity(intent);
        }




    }
}