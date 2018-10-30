package com.example.user.poemapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Activity_Video extends AppCompatActivity {

    VideoView videoView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__video);

        final VideoView myVideoV = (VideoView)findViewById(R.id.videoView);
        myVideoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.videopoem));
        myVideoV.setMediaController(new MediaController(this));
        myVideoV.requestFocus();
        //  myVideoV.start();
        myVideoV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myVideoV.isPressed())
                {
                    myVideoV.start();
                } else {
                    myVideoV.pause();
                }
            }
        });
    }
    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        videoView1.start();
    }
    // ปุ่มย้อนกลับไปหน้า บทประพันธ์
    public void backToPoem(View view) {
        Intent intent = new Intent(Activity_Video.this, Activity_Poem.class);
        startActivity(intent);
    }
}
