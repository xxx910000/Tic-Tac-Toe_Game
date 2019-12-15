package com.example.tic_tac_toegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        //背景音乐函数
        Intent intent = new Intent(this,MusicServer.class);
        startService(intent);
        manu();
    }

    private void manu() {
    }

    //背景音乐函数，关闭。
    protected void onStop(){
        Intent intent = new Intent(this,MusicServer.class);
        stopService(intent);
        super.onStop(); }



}






