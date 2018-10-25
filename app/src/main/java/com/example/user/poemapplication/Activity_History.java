package com.example.user.poemapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__history);
    }
    // ปุ่มกลับไปหน้าเมนู
    public void clickBackToMenu(View view) {
        Intent intent = new Intent(Activity_History.this, Activity_Menu.class);
        startActivity(intent);
    }
}
