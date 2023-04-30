package com.xyz.HomeWork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView showHobbies ;
    private EditText yourHobbies ;
    private Button add ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showHobbies = findViewById(R.id.showHobbies) ;
        yourHobbies = findViewById(R.id.yourHobbies) ;
        add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHobbies.setVisibility(View.VISIBLE);
                showHobbies.setText(yourHobbies.getText().toString());
            }
        });


    }
}