package com.tubesprogmob.travelinbali;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";
    private String NAMA_TEMPAT = "namaa";
    TextView namaa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        Log.d(TAG, "onCreate: started.");
        getIncomingIntent();

        namaa = (TextView) findViewById(R.id.namaTempat);

        FloatingActionButton btnReservation = (FloatingActionButton) findViewById(R.id.ReservationButton);
        btnReservation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn1 = new Intent(getApplicationContext(), ReservationActivity.class);
                btn1.putExtra(NAMA_TEMPAT, (CharSequence) namaa);
                startActivity(btn1);
            }
        });
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents");
        if (getIntent().hasExtra("image_url") &&
                getIntent().hasExtra("nama_tempat") &&
                getIntent().hasExtra("detailtempat") &&
                getIntent().hasExtra("alamat") &&
                getIntent().hasExtra("nomortelepon")
        ) {
            Log.d(TAG, "getIncomingIntent: found intent extras");
            String imageUrl = getIntent().getStringExtra("image_url");
            String namaTempat = getIntent().getStringExtra("nama_tempat");
            String detailTempat = getIntent().getStringExtra("detailtempat");
            String alamat = getIntent().getStringExtra("alamat");
            String nomortelepon = getIntent().getStringExtra("nomortelepon");

            setImage(imageUrl, namaTempat, detailTempat, alamat, nomortelepon);
        }
    }

    private void setImage(String imageUrl,
                          String namaTempat,
                          String detailTempat,
                          String alamat,
                          String nomortelepon){
        Log.d(TAG, "setImage: setting to image and name to widget");
        TextView nama = findViewById(R.id.nama);
        nama.setText(namaTempat);

        TextView deskripsi = findViewById(R.id.deskripsitempat);
        deskripsi.setText(detailTempat);

        TextView notelp = findViewById(R.id.notelp);
        notelp.setText(nomortelepon);

        TextView alamatt = findViewById(R.id.alamat);
        alamatt.setText(alamat);

        ImageView gambar = findViewById(R.id.imageView2);

        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(gambar);

    }
}
