package com.example.hitanshu.recyclerviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<SongInfo> songData;
        RecyclerView recy;
        ArrayList<SongInfo> songList = new ArrayList<SongInfo>();
        String artistName[] = {"Ed Sheeran","Avicii","Coldplay","Maroon 5","Sam Smith","Ed Sheeran","Avicii","Coldplay","Maroon 5","Sam Smith"};
        String songName[] = {"Shape Of You","levels","Fix You","Maps","Too good at goodbyes","Shape Of You","levels","Fix You","Maps","Too good at goodbyes"};
        for(int i = 0; i < 10; i++)
        {
            SongInfo s = new SongInfo();
            s.setArtistName(artistName[i]);
            s.setSongName(songName[i]);
            songList.add(s);
        }
        recy = (RecyclerView)findViewById(R.id.recyle);
        SongAdapter sAdapt = new SongAdapter(this,songList);
        RecyclerView.LayoutManager songLayoutManager = new LinearLayoutManager(getApplicationContext());
        recy.setLayoutManager(songLayoutManager);
        recy.setItemAnimator(new DefaultItemAnimator());
        recy.setAdapter(sAdapt);
    }
}
