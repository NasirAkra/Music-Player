package com.example.musicplayer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play,stop,pause;
        play=findViewById(R.id.Play);
        stop=findViewById(R.id.stop);
        pause=findViewById(R.id.pause);

        MediaPlayer mediaPlayer=new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        String path="android.resource://"+getPackageName()+"/raw/nasir";
//        String onlinepath ="https://wscubetechapps.com/android-course/android_11.mp3";
        Uri audio= Uri.parse(path);
//        Uri audioonline= Uri.parse(onlinepath);
        try {
            mediaPlayer.setDataSource(this,audio);
//            mediaPlayer.setDataSource(this, audioonline);
            mediaPlayer.prepare();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        play.setOnClickListener(v -> mediaPlayer.start());
        pause.setOnClickListener(v -> mediaPlayer.pause());
        stop.setOnClickListener(v -> {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);

        });
//        mediaPlayer.seekTo();
//        mediaPlayer.getDuration();
//        mediaPlayer.getCurrentPosition();
//       mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//
//            }
//        });

    }
}