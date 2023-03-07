package com.example.firstapp;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg ;
    RadioButton rb ;
    TextView G;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            rg=findViewById(R.id.GenderChoose);
            G=findViewById(R.id.gender);
            Button buttonSignUp = findViewById(R.id.Register);
            buttonSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int RadioID=rg.getCheckedRadioButtonId();
                    rb=findViewById(RadioID);
                }
            });

        EditText username=(EditText) findViewById(R.id.Username);
        MaterialButton register=(MaterialButton) findViewById(R.id.Register);
        register.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View v){
            String username1=username.getText().toString();
            Toast.makeText(MainActivity.this, "Welcome ,  "+username1, Toast.LENGTH_SHORT).show();
        }
        });
    }
        public void checkButton(View v){
        int RadioID=rg.getCheckedRadioButtonId();
        rb=findViewById(RadioID);
            Toast.makeText(this, "You are "+rb.getText(),Toast.LENGTH_SHORT).show();
        }
}
