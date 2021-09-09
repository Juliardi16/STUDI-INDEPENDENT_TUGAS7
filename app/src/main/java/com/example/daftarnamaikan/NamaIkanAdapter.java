package com.example.daftarnamaikan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NamaIkanAdapter  extends RecyclerView.Adapter<NamaIkanAdapter.IkanViewHolder>{
    private ArrayList<HomeModel> dataIkan;

    public NamaIkanAdapter(ArrayList<HomeModel> dataIkan) {
        this.dataIkan = dataIkan;
    }

    @NonNull
    @Override
    public NamaIkanAdapter.IkanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_namaikan,parent,false);
        return new IkanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NamaIkanAdapter.IkanViewHolder holder, int position) {
        holder.tvNama.setText(dataIkan.get(position).getNama());
        holder.tvWarna.setText(dataIkan.get(position).getWarna());
    }

    @Override
    public int getItemCount() {
        return dataIkan.size();
    }


    public class IkanViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNama,tvWarna;

        public IkanViewHolder(View view){
            super(view);
            tvNama = view.findViewById(R.id.tv_nama);
            tvWarna = view.findViewById(R.id.tv_warna);
        }
    }
}
