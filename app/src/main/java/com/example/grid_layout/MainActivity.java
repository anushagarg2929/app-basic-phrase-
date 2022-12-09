package com.example.grid_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonTapped(View view){
        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceName(id);
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.grid_layout");
        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);

        Log.i("Button tapped", Integer.toString(view.getId()));
    }
}