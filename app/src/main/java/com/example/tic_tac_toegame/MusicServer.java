package com.example.tic_tac_toegame;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;



public class MusicServer extends Service {

    private MediaPlayer mediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null; }
    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        if (mediaPlayer == null) {
            // R.raw.mmp是资源文件，MP3格式的，res下新建raw，hb.mp3放到里面
            mediaPlayer = MediaPlayer.create(this, R.raw.touch);
            mediaPlayer.setLooping(true);
            mediaPlayer.start(); }
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop(); }
}

