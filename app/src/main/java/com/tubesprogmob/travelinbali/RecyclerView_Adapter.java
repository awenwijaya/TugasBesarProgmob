package com.tubesprogmob.travelinbali;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.ViewHolder>{

    private static final String TAG = "RecyclerView_Adapter";

    private ArrayList<String> mNamaTempat = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mDetailTempat = new ArrayList<>();
    private ArrayList<String> mNomerTelepon = new ArrayList<>();
    private ArrayList<String> mAlamat = new ArrayList<>();
    private Context mContext;

    public RecyclerView_Adapter(Context context,
                                ArrayList<String> namaTempat,
                                ArrayList<String> images,
                                ArrayList<String> detailTempat,
                                ArrayList<String> nomorTelepon,
                                ArrayList<String> alamat){
        mNamaTempat = namaTempat;
        mImages = images;
        mDetailTempat = detailTempat;
        mNomerTelepon = nomorTelepon;
        mAlamat = alamat;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
        holder.namaTempat.setText(mNamaTempat.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + mNamaTempat.get(position));
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("nama_tempat", mNamaTempat.get(position));
                intent.putExtra("detailtempat", mDetailTempat.get(position));
                intent.putExtra("alamat", mAlamat.get(position));
                intent.putExtra("nomortelepon", mNomerTelepon.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNamaTempat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView namaTempat;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            namaTempat = itemView.findViewById(R.id.namaTempat);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}
