package com.tubesprogmob.travelinbali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class activityEducation extends AppCompatActivity {
    private static final String TAG = "activityEducation";

    //vars
    private ArrayList<String> mNama = new ArrayList<>();
    private ArrayList<String> mImagesURL = new ArrayList<>();
    private ArrayList<String> mDetailTempat = new ArrayList<>();
    private ArrayList<String> mAlamat = new ArrayList<>();
    private ArrayList<String> mNomerTelepon = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        //list tempat
        mImagesURL.add("https://balistarisland.com/wp-content/uploads/2016/04/baliclassiccenter.jpg");
        mNama.add("Bali Classic Center (Ubud)");
        mDetailTempat.add("Belajar lebih jauh mengenai kehidupan dan tradisi masyarakat Bali");
        mAlamat.add("Jl. Br Nyuh Kuning MAS Ubud, MAS,Ubud");
        mNomerTelepon.add("(0361) 978145");

        mImagesURL.add("https://natantransport.com/wp-content/uploads/2019/05/Kebun-Raya-balimediainfo-com.jpg");
        mNama.add("Kebun Raya Bali (Tabanan)");
        mDetailTempat.add("Study tour dengan belajar aneka macam flora");
        mAlamat.add("Jl. Kebun Raya, Candikuning, Tabanan");
        mNomerTelepon.add("(0368) 2033211");

        mImagesURL.add("https://www.greenqueen.com.hk/wp-content/uploads/2020/01/greenschool-1.jpg");
        mNama.add("Green School Bali (Badung)");
        mDetailTempat.add("Wisata ini merupakan sekolah alam di tempat terbuka");
        mAlamat.add("Jl. Raya Sibang Kaja, Badung");
        mNomerTelepon.add("(0361) 469875");

        mImagesURL.add("https://www.balimagictour.com/wp-content/uploads/bali-zoo-elephant.jpg");
        mNama.add("Bali Zoo Park (Gianyar)");
        mDetailTempat.add("Mempelajari berbagai macam species yang ada di dunia");
        mAlamat.add("Singapadu, Sukawati, Gianyar");
        mNomerTelepon.add("(0361) 294357");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/0e/ba/a9/c3/jewelry-making-class.jpg");
        mNama.add("House Of Alaia Studio (Badung)");
        mDetailTempat.add("Belajar membuat perhiasan sendiri dengan cara tradisional");
        mAlamat.add("Jl. Pantai Batu Bolong No. 27 B, Badung");
        mNomerTelepon.add("+62821-4734-8746 ");

        mImagesURL.add("https://www.balisafarimarinepark.com/wp-content/uploads/2017/11/NS.jpg");
        mNama.add("Bali Safari & Marine Park (Gianyar)");
        mDetailTempat.add("Berwisata sembari mempelajari Fauna di seluruh dunia");
        mAlamat.add("Jl. Prof Ida Bagus Mantra Km. 19,8, Gianyar");
        mNomerTelepon.add("(0361) 950000");

        mImagesURL.add("https://www.balitoursclub.net/wp-content/uploads/2015/12/Objek-wisata-monumen-Bajra-Sandhi-Denpasar.jpg");
        mNama.add("Monumen Bajra Sandhi (Denpasar)");
        mDetailTempat.add("Mempelajari kehidupan, adat istiadat, dan perjuangan masyarakat Bali masa lampau");
        mAlamat.add("Jl. Raya Puputan No. 142,Denpasar");
        mNomerTelepon.add("(0361) 264517");

        mImagesURL.add("https://m-kuta.com/wp-content/uploads/2018/12/taman-nusa-bali-.jpg");
        mNama.add("Taman Nusa (Gianyar)");
        mDetailTempat.add("Menyediakan berbagai replika peninggalan bangunan bersejarah di Indonesia");
        mAlamat.add("Jl. Taman Bali, Banjar Blahpane,Gianyar");
        mNomerTelepon.add("(0361) 952952");

        mImagesURL.add("https://www.hargatiket.net/wp-content/uploads/2019/12/Taman-Nasional-Bali-Barat.jpg");
        mNama.add("Taman Nasional Bali Barat");
        mDetailTempat.add(" Taman Nasional Bali Barat terdiri dari berbagai habitat hutan dan sabana");
        mAlamat.add("Pulau Menjangan, Kabupaten Jembrana");
        mNomerTelepon.add("(0365) 61060");

        initRecylerView();
    }

    private void initRecylerView(){
        Log.d(TAG, "initRecylerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_education);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(this, mNama, mImagesURL, mDetailTempat, mNomerTelepon, mAlamat);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
