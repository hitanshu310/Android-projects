package com.example.hitanshu.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<SongInfo> arr = new ArrayList<SongInfo>();
private RecyclerView recy;
private SeekBar seek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = (RecyclerView)findViewById(R.id.RecylerView);
        seek = (SeekBar)findViewById(R.id.seekBar);
    }
}
