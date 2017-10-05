package com.example.aina.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 04/10/2017.
 */

public class ListResepAdapter  extends RecyclerView.Adapter<ListResepAdapter.ListResepViewHolder>{

    private Context context;

    private ArrayList<ListResep>listResep;

    public ListResepAdapter(Context context, ArrayList<ListResep> listResep) {
        this.context = context;
        this.listResep = listResep;
    }

    @Override
    public ListResepAdapter.ListResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listresep,parent,false);
        return new ListResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListResepAdapter.ListResepViewHolder holder, final int position) {
        holder.gambarResep.setImageResource(listResep.get(position).getGambarResep());
        holder.judulResep.setText(listResep.get(position).getJudulResep());
        holder.deskripsiResep.setText(listResep.get(position).getDeskripsiResep());

        holder.judulResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent judulresep = new Intent(context,DetailResep.class);
                judulresep.putExtra("judul",listResep.get(position).getJudulDetail());
                judulresep.putExtra("gambar",listResep.get(position).getGambarDetail());
                judulresep.putExtra("deskripsi",listResep.get(position).getDeskripsiDetail());
                context.startActivity(judulresep);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ListResepViewHolder extends RecyclerView.ViewHolder{
        ImageView gambarResep;
        TextView judulResep;
        TextView deskripsiResep;
        public ListResepViewHolder(View itemView) {
            super(itemView);
            gambarResep = (ImageView)itemView.findViewById(R.id.GambarResep);
            judulResep = (TextView)itemView.findViewById(R.id.JudulResep);
            deskripsiResep = (TextView)itemView.findViewById(R.id.DeskripsiResep);

        }
    }
}
