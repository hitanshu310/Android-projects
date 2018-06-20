package com.example.hitanshu.recyclerviewtutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongHolder> {

    Context context;
    ArrayList songList;
    public SongAdapter(Context context,ArrayList songList) {
        this.context = context;
        this.songList = songList;
    }

    @NonNull
    @Override
    public SongAdapter.SongHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        return new SongHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.SongHolder songHolder, int i) {
        SongInfo sInfo = (SongInfo) songList.get(i);
        songHolder.songName.setText(sInfo.getSongName());
        songHolder.artistName.setText(sInfo.getArtistName());
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }
    public class SongHolder extends ViewHolder
    {
        TextView artistName,songName;
        public SongHolder(@NonNull View itemView) {
            super(itemView);
            songName = (TextView) itemView.findViewById(R.id.textView2);
            artistName = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
