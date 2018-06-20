package com.example.hitanshu.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdaptor extends RecyclerView.Adapter<SongAdaptor.SongHolder> {
    private ArrayList<SongInfo> song = new ArrayList<SongInfo>();
    Context context;
    public SongAdaptor(Context context,ArrayList<SongInfo> song)
    {
        this.context = context;
        this.song = song;
    }
    @NonNull
    @Override
    public SongHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View myView = LayoutInflater.from(context).inflate(R.layout.song_layout,viewGroup,false);
        return new SongHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull SongHolder songHolder, int i) {


    }

    @Override
    public int getItemCount() {
        return song.size();
    }

    public class SongHolder extends RecyclerView.ViewHolder {
        TextView songName,artistName;
        Button btn;
        public SongHolder(@NonNull View itemView) {
            super(itemView);
            songName = (TextView)itemView.findViewById(R.id.textView2);
            artistName = (TextView)itemView.findViewById(R.id.textView);
            btn = (Button)itemView.findViewById(R.id.button);
        }
    }
}
