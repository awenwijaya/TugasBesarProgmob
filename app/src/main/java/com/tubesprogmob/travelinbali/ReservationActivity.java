package com.tubesprogmob.travelinbali;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReservationActivity extends AppCompatActivity{
    private static final String TAG = "ReservationActivity";
    /** Called when the activity is first crated. */
    String metode_pembayaran[]={"Payment Methods","Transfer","Offline Payment"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        Spinner spinner = (Spinner) findViewById(R.id.paymentMethod);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,metode_pembayaran);
        spinner.setAdapter(adapter);


        Button reservbutton = (Button) findViewById(R.id.button_pemesanan);
        reservbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent reservasi = new Intent(getApplicationContext(), ConfirmationActivity.class);
                startActivity(reservasi);
            }
        });


    }


}