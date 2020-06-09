package com.tubesprogmob.travelinbali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {
    private static final String TAG = "ConfirmationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Button backhome = (Button) findViewById(R.id.bckhome);
        backhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent homescreen = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(homescreen);
            }
        });
    }
}
