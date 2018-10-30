package com.example.user.poemapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_loadscene extends AppCompatActivity {
    // เวลาในการโหลดซีน
    private  static  int Time_Splash = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadscene);
        openmainmenu();
    }

    private void openmainmenu(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Activity_loadscene.this, Activity_Menu.class);
                startActivity(intent);
                finish();
            }
        },Time_Splash);
    }

}
