package com.example.danielaschalmer.immproject_button;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Alarmbutton = (Button) findViewById(R.id.AlarmButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.alarm);
        mp.setLooping(true);

        Alarmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mp.setLooping(true);
                if(mp.isPlaying())
                {
                    mp.pause();

                }
                else
                {

                 mp.start();
                }
            }
        });
    }
}
