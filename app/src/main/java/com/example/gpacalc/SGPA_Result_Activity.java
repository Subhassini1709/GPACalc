package com.example.gpacalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class SGPA_Result_Activity extends AppCompatActivity {
    TextView header,res,txt;
    float sgpa;
    String name,result,msg;
    MediaPlayer mMediaPlayer = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa_result);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null)
            actionBar.setDisplayHomeAsUpEnabled(true);
        header = findViewById(R.id.result_header);
        res = findViewById(R.id.result);
        txt = findViewById(R.id.msg);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("name");
            result = bundle.getString("result");
            header.setText(name);
            res.setText(result);
        }
        sgpa = Float.parseFloat(result);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        if(sgpa>=9) {
            msg = "How do you do it? Just how?";
            mMediaPlayer = MediaPlayer.create(this, R.raw.note1);
            mMediaPlayer.start();
        }
        if(sgpa>7.5 && sgpa<9) {
            msg = "Good one, mate!";
            mMediaPlayer = MediaPlayer.create(this, R.raw.note2);
            mMediaPlayer.start();
        }
        if(sgpa>5 && sgpa<=7.5) {
            msg = "#Mass \nRecruitment to the Rescue!";
            mMediaPlayer = MediaPlayer.create(this, R.raw.note3);
            mMediaPlayer.start();
        }
        if(sgpa<5)
        {
            msg = "Follow your Passion, brother!";
            mMediaPlayer = MediaPlayer.create(this, R.raw.note4);
            mMediaPlayer.start();
        }
        txt.setText(msg);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            mMediaPlayer.stop();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        mMediaPlayer.stop();
        this.finish();
    }
}