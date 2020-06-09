package com.tubesprogmob.travelinbali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class activitySport extends AppCompatActivity {
    private static final String TAG = "activitySport";

    //vars
    private ArrayList<String> mNama = new ArrayList<>();
    private ArrayList<String> mImagesURL = new ArrayList<>();
    private ArrayList<String> mDetailTempat = new ArrayList<>();
    private ArrayList<String> mAlamat = new ArrayList<>();
    private ArrayList<String> mNomerTelepon = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        //list tempat
        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/1-4-seabreacher-via-aussiebaliadventures-740x444.jpg");
        mNama.add("Seabreacher (Denpasar)");
        mDetailTempat.add("watercraft dengan kokpit");
        mAlamat.add("Jl. Tukad Punggawa, Serangan, Denpasar Selatan");
        mNomerTelepon.add("0819 3623 6632");

        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/7-1-abyss-zipline-via-linafossaa-740x740.jpg");
        mNama.add("Abyss Zipline (Nusa Ceningan");
        mDetailTempat.add("Meluncur di antara dua tebing di atas deburan ombak ");
        mAlamat.add("Pulau Nusa Ceningan");
        mNomerTelepon.add("(0361) 765 845");

        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/5-2-5gx3-by-5gxbali-740x740.jpg");
        mNama.add("5GX Reverse Bungy (Kuta)");
        mDetailTempat.add("Anda akan dilontarkan ke langit denganketapel raksasa");
        mAlamat.add("Jl. Raya Legian, Kuta, Badung");
        mNomerTelepon.add("087860635464");

        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/2-3-Aling-Gorges-by-Tamara_jayne91-740x607.jpg");
        mNama.add("Canyoning (Ubud)");
        mDetailTempat.add("Kegiatan pemacu adrenalin yang mengharuskan Anda menggerakkan semua otot tubuh");
        mAlamat.add("Jl. Raya Mas No. 62, Ubud, Gianyar");
        mNomerTelepon.add("(0361)971288");


        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/3-1-Aling-Aling-Waterfall-by-kaioshk-740x740.jpg");
        mNama.add("Air Terjun Aling-Aling (Buleleng)");
        mDetailTempat.add("Menyajikan perosotan alami untuk menuju ke kolam ");
        mAlamat.add("Jl. I Dewa Made Kaler, Buleleng");
        mNomerTelepon.add("082144072994");

        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/17-1-via-duiduidam-740x778.jpg");
        mNama.add("Bali Treetop Adventure Park (Bedugul)");
        mDetailTempat.add("Terdapat 7 macam sirkuit dan 72 tantangan yang bisa Anda coba");
        mAlamat.add("Kebun Raya Eka Karya Bali, Candikuning, Bedugul");
        mNomerTelepon.add("(0361) 934 0009");

        mImagesURL.add("https://www.wandernesia.com/wp-content/uploads/2019/04/Flying-Fish-by-@tanjungbenoawatersport.jpg");
        mNama.add("Flying Fish (Nusa Dua)");
        mDetailTempat.add("Terbang seperti ikan terbang");
        mAlamat.add("Pantai Nusa Dua");
        mNomerTelepon.add("0812 3615 8243 ");

        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/mahana-via-rhondaw6-1024x1024-740x740.jpg");
        mNama.add("Mahana Point Cliff Jump (Nusa Lembongan)");
        mDetailTempat.add("Melompat dari atas tebing dan terjun langsung ke laut biru");
        mAlamat.add("Jl. Raya Ceningan, Dusun Ceningan Kawan, Nusa Lembongan");
        mNomerTelepon.add("-");

        mImagesURL.add("https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2017/10/via-gustindra-1024x769-740x556.jpg");
        mNama.add("Flyboarding (Badung)");
        mDetailTempat.add("flyboarding merupakan gabungan dari papan selancar dan motor jetski.");
        mAlamat.add("Jl Pratama 70, Tanjung Benoa");
        mNomerTelepon.add("0812 3800 147");

        initRecylerView();
    }

    private void initRecylerView(){
        Log.d(TAG, "initRecylerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_sport);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(this, mNama, mImagesURL, mDetailTempat, mNomerTelepon, mAlamat);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
