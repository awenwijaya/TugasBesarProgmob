package com.tubesprogmob.travelinbali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnkuliner = (ImageButton) findViewById(R.id.buttonCulinary);
        btnkuliner.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn1 = new Intent(getApplicationContext(), activityCulinary.class);
                startActivity(btn1);
            }
        });

        ImageButton btneducation = (ImageButton) findViewById(R.id.buttonEducation);
        btneducation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn2 = new Intent(getApplicationContext(), activityEducation.class);
                startActivity(btn2);
            }
        });

        ImageButton btnentertainment = (ImageButton) findViewById(R.id.buttonEntertainment);
        btnentertainment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn3 = new Intent(getApplicationContext(), activityEntertainment.class);
                startActivity(btn3);
            }
        });

        ImageButton btnSport = (ImageButton) findViewById(R.id.buttonSport);
        btnSport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn4 = new Intent(getApplicationContext(), activitySport.class);
                startActivity(btn4);
            }
        });
    }
}
