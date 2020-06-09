package com.tubesprogmob.travelinbali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class activityCulinary extends AppCompatActivity {

    private static final String TAG = "activityCulinary";

    //vars
    private ArrayList<String> mNama = new ArrayList<>();
    private ArrayList<String> mImagesURL = new ArrayList<>();
    private ArrayList<String> mDetailTempat = new ArrayList<>();
    private ArrayList<String> mAlamat = new ArrayList<>();
    private ArrayList<String> mNomerTelepon = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinary);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        //list tempat
        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/73/f5/28/fb-img-1496380561303.jpg");
        mNama.add("Warung Nasi Ayam Bu Oki (Jimbaran)");
        mDetailTempat.add("Menawarkan masakan khas Bali, yaitu ayam betutu.");
        mAlamat.add("Jl. Celagi Basur no. 3Y, Jimbaran");
        mNomerTelepon.add("081353213247");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-p/14/af/7c/97/photo1jpg.jpg");
        mNama.add("Warung Men Runtu (Denpasar)");
        mDetailTempat.add("Menawarkan masakan khas Bali, rujak, dan lain sebagainya.");
        mAlamat.add("Jl. Sekuta No 32c, Sanur, Denpasar Selatan");
        mNomerTelepon.add("081916116633");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/02/2c/23/00/seafood-cafes-on-jimbaran.jpg");
        mNama.add("Menega Cafe (Jimbaran)");
        mDetailTempat.add("Menyediakan pilihan seafood segar dari laut dan langsung dimasak.");
        mAlamat.add("Jl. Sekuta No 32c, Sanur, Denpasar Selatan");
        mNomerTelepon.add("081916116633");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/18/81/ec/02/bebek-tepi-swah-restaurant.jpg");
        mNama.add("Bebek Tepi Sawah Restaurant (Ubud)");
        mDetailTempat.add("Menyediakan menu kuliner khas Ubud, Bebek, dan masih banyak lagi");
        mAlamat.add("Jl. Raya Goa Gajah, Ubud, Gianyar");
        mNomerTelepon.add("081558070210");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/07/77/2e/b0/ayam-betutu-khas-gilimanuk.jpg");
        mNama.add("Ayam Betutu Khas Gilimanuk (Tuban)");
        mDetailTempat.add("Menyajikan menu ayam betutu khas Gilimanuk dengan sambal spesial");
        mAlamat.add("Jl. Raya Tuban no.2X, Tuban, Kuta");
        mNomerTelepon.add("0361757535");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/09/a5/de/e1/nasi-ayam-men-weti.jpg");
        mNama.add("Warung Men Weti (Denpasar)");
        mDetailTempat.add("Menyajikan nasi campur khas Bali");
        mAlamat.add("Jl. Letda Reta no.52, Dangin Puri Klod, Denpasar Timur, Denpasar");
        mNomerTelepon.add("085338509922");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/0c/ba/52/84/babi-guling-pak-dobiel.jpg");
        mNama.add("Babi Guling Pak Dobiel (Nusa Dua)");
        mDetailTempat.add("Menyediakan babi guling lengkap dengan bumbu lengkap (bese genep)");
        mAlamat.add("Jl. Srikandi no.9, Benoa, Kuta Selatan");
        mNomerTelepon.add("0361771633");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/11/e7/43/4c/nuri-s-signature-pork.jpg");
        mNama.add("Naughty Nuri Seminyak (Seminyak)");
        mDetailTempat.add("Menyediakan makanan amerika, steak, bar, dan barbekyu");
        mAlamat.add("Jl. Mertanadi no.62, Kerobokan, Seminyak");
        mNomerTelepon.add("03618476783");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/12/16/79/9b/20180114-131817-largejpg.jpg");
        mNama.add("Sate Babi Bawah Pohon (Legian)");
        mDetailTempat.add("Menyediakan Sate Babi yang serba murah meriah");
        mAlamat.add("Jl. Dewi Sri IV Jl. Campuhan I - Dewi Sri, Legian, Kuta");
        mNomerTelepon.add("081936253567");

        initRecylerView();
    }

    private void initRecylerView(){
        Log.d(TAG, "initRecylerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_culinary);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(this, mNama, mImagesURL, mDetailTempat, mNomerTelepon, mAlamat);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}