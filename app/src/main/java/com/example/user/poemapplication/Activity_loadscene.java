package com.example.user.poemapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_loadscene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadscene);
    }
    // ปุ่มกดไปหน้าเมนู
    public void clicktoMenu(View view) {
        Intent intent = new Intent(Activity_loadscene.this, Activity_Menu.class);
        startActivity(intent);
    }
}
