package com.example.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.flutterwave.raveandroid.uk.UkUiContract;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);

        Toast.makeText(getApplicationContext(),"Clicked: "+ourId,Toast.LENGTH_SHORT).show();

        @SuppressLint("DiscouragedApi")
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.gridlayoutdemo");

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();
    }
}