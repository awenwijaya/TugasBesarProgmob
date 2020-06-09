package com.tubesprogmob.travelinbali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class activityEntertainment extends AppCompatActivity {
    private static final String TAG = "activityEntertainment";

    //vars
    private ArrayList<String> mNama = new ArrayList<>();
    private ArrayList<String> mImagesURL = new ArrayList<>();
    private ArrayList<String> mDetailTempat = new ArrayList<>();
    private ArrayList<String> mAlamat = new ArrayList<>();
    private ArrayList<String> mNomerTelepon = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        //list tempat
        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-m/1280/14/92/66/7b/the-garuda-wisnu-kencana.jpg ");
        mNama.add("Garuda Wisnu Kencana (Ungasan)");
        mDetailTempat.add("Garuda wisnu kencana atau GWK merupakan salah satu taman wisata budaya yang berada di Bali Selatan. Wisata ini memang cukup populer, terlebih saat ini pembangunan patung raksasai Garuda Wisnu Kencana sudah berhasil diselesaikan. Anda bisa menikmati kemegahan patung karya I Nyoman Nuarta yang juga ditemani dengan keindahan bukit-bukit kapur di sekitarnya. Dan tak hanya itu saja, di GWK terdapat teater seni yang dimana anda bisa melihat berbagai jenis kesenian dan tarian bali setiap harinya.");
        mAlamat.add("Jl. Raya Uluwatu, Ungasan, Kec. Kuta Sel., Kabupaten Badung, Bali ");
        mNomerTelepon.add("(0361)700808");

        mImagesURL.add("https://www.balitoursclub.net/wp-content/uploads/2015/12/Objek-wisata-Tegalalang-Bali.jpg");
        mNama.add("Ceking Tegalalang (Gianyar)");
        mDetailTempat.add("Ubud lebih mengangkat pariwisata dengan budaya lokal, alamnya juga masih asri, masih banyak hamparan sawah hijau yang bisa anda temukan pada kawasan ini, termasuk juga objek wisata Tegalalang atau Ceking Rice Terrace yang letaknya berdekatan yang hanya 5 km dari pusat kota Ubud, menyebabkan dikenal juga sebagai sawah terasering Ubud dan menjadi tempat rekreasi selain pantai yang sedang hits dan populer di pulau Dewata Bali.");
        mAlamat.add("Jl. Raya Tegallalang, Tegallalang, Kec. Tegallalang, Kabupaten Gianyar, Bali");
        mNomerTelepon.add("-");

        mImagesURL.add("https://www.nativeindonesia.com/wp-content/uploads/2018/08/monkey-forest-ubud.jpg");
        mNama.add("Monkey Forest Ubud (Ubud)");
        mDetailTempat.add("Salah satu daya tarik yang ada di Monkey Forest Ubud adalah disini anda bisa langsung berinteraksi dengan kera ekor panjang yang memang menghuni kawasan wisata ini. Di kawasan ini, kera-kera memang hidup bebas. Warga setempat menganggap jika kera-kera tersebut adalah keramat yang tidak boleh diganggu. Sehingga anda benar-benar bisa merasakan suasana seperti menyatu dengan alam.");
        mAlamat.add("Jl. Monkey Forest, Ubud, Kecamatan Ubud, Kabupaten Gianyar, Bali");
        mNomerTelepon.add(" (0361)971304");

        mImagesURL.add("https://www.nativeindonesia.com/wp-content/uploads/2018/08/desa-penglipuran-bali.jpg");
        mNama.add("Desa Penglipuran (Bangli)");
        mDetailTempat.add("Jika anda sering melihat sinetron-sinetron di salah satu stasiun televisi, mungkin anda usdah tidak asing lagi dengan tampakan Desa Penglipuran. Desa adat di Bali ini menjadi salah satu destinasi wisata yang tidak boleh terlewatkan saat berlibur di Pulau Bali. Berada di desa Kubu, Kab. Bangli, desa penglipuran ini bertempat di ketinggian 700 mdpl. Sehingga bisa dibayangkan sendiri bagaiaman sejuknya udara saat anda masuk ke kawasan Desa penglipuran. Di desa Penglipuran, anda masih bisa melihat suasana adat Bali yang begitu kental. Anda bisa melihat tampakan rumah-rumah penduduk yang bentuknya hampir sama.");
        mAlamat.add("Jl. Penglipuran, Kubu, Kec. Bangli, Kabupaten Bangli, Bali");
        mNomerTelepon.add(" 082266007575");


        mImagesURL.add("https://cdn-brilio-net.akamaized.net/news/2018/11/05/154531/941570-50-wisata-bali-paling-hits-saat-ini.jpg");
        mNama.add("Air Terjun Tukad Cepung (Bangli)");
        mDetailTempat.add("Hampir semua wisata Bali bisa dikatakan keren-keren, termasuk wisata airnya. Salah satu yang menarik adalah saat kamu mengunjungi air terjun Tukad Cepung. Suasana di sini benar-benar terasa di alam bebas, kamu tak hanya sekedar bisa menikmati air terjunnya saja, namun kamu juga bisa memanjati tebing. Kawasan ini masih sangat asri.");
        mAlamat.add("JJl. Tembuku, Dusun Penida Kelod, Tembuku, Kabupaten Bangli, Bali");
        mNomerTelepon.add("-");

        mImagesURL.add("https://media-cdn.tripadvisor.com/media/photo-s/17/70/d1/28/dinner-time.jpg");
        mNama.add("La Brisa Bali (Canggu)");
        mDetailTempat.add("Bersantai dan nongkrong, itu cocoknya di La Brisa. Ini sini kamu akan menjumpai wisatawan lokal maupun luar negeri. Mereka biasanya menghabiskan waktu untuk bersantai, makan, dan ngobrol bersama teman-temannya. Tak heran memang, tempat ini begitu cozy. Makanya banyak yang betah bermalas-malasan di sini. La Brisa memang tempat tongkrong paling hits di Bali.");
        mAlamat.add("Jl. Pantai Batu Mejan, Canggu, Kec. Kuta Utara, Kabupaten Badung, Bali");
        mNomerTelepon.add("08113946666");

        mImagesURL.add("https://www.baligetaway.co.id/wp-content/uploads/2014/10/finns-beach-club-canggu-bali.jpg ");
        mNama.add("Finns Beach Club Canggu Bali");
        mDetailTempat.add("Seperti Beach Club Kuta lainnya, Finns Beach Club juga menawarkan daya tarik yang membuat para pengunjung betah berlama lama seperti pavailiun bambu yang terbuka serta menyediakan menu internasional, bar di kolam renang untuk melihat matahari terbenam yang sangat eksotis. Fasilitas yang disediakan oleh Finns Beach Club antara lain ada 6 bar, kolam renang, Swim Up Bar, Live Music, Restaurant, Handuk, Ruang Ganti, Wifi, ATM, Payung dan Retail Shop.");
        mAlamat.add("Jl. Pantai Berawa, Canggu, Kec. Kuta Utara, Kabupaten Badung, Bali");
        mNomerTelepon.add("(0361)8446327");

        mImagesURL.add("https://cdn-brilio-net.akamaized.net/news/2018/11/05/154531/941581-50-wisata-bali-paling-hits-saat-ini.jpg");
        mNama.add("Hidden Canyon, Beji Guwang (Gianyar)");
        mDetailTempat.add("Buat siapapun yang mengunjunginya dan berhasil mengabadikan momen di sini, lalu di upload ke Instagram bakal membuat teman-temanmu iri. Hiden Canyon Beji Guwang ini memilliki panorama alam yang begitu eksotis, terletak di Jalan Sahadewa, Kabupaten Gianyar, Bali ini merupakan kawasan wisata yang diincar para turis lho.");
        mAlamat.add("Jalan Sahadewa, Banjar Wangbung, Guwang, Sukawati, Guwang, Kec. Sukawati, Kabupaten Gianyar, Bali");
        mNomerTelepon.add("-");

        mImagesURL.add("https://3.bp.blogspot.com/-EzmD4xxJALA/V3yFNvg1f9I/AAAAAAAAaFY/aYmpzTgXvDctMIAd6dT7zC-8u0icT0LcwCLcB/s1600/DSC05217-01.jpeg");
        mNama.add("La Laguna Bali (Canggu)");
        mDetailTempat.add("Wisata Bali La Laguna menawarkan spot foto menarik. Banyak spot foto yang bisa kamu jadikan salah satu tempat untuk mengabadikan foto. La Laguna berada di Cangu, sekitar 10 menit dari Seminyak. Di sini kamu bisa bersantai dengan menyantap beberapa hidangan lezat. Kawasan ini langsung berpapasan dengan pantai, jadi pemandangannya sangat mendukung.");
        mAlamat.add("Jalan Pantai Kayu Putih Berawa, Tibubeneng, Kec. Kuta Utara, Kabupaten Badung, Bali");
        mNomerTelepon.add("081236382272");

        initRecylerView();
    }

    private void initRecylerView(){
        Log.d(TAG, "initRecylerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_entertainment);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(this, mNama, mImagesURL, mDetailTempat, mNomerTelepon, mAlamat);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
