package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__menu);
    }
    // ปุ่มไปหน้าประวัติความเป็นมา
    public void clickToHistory(View view) {
        Intent intent = new Intent(Activity_Menu.this, Activity_History.class);
        startActivity(intent);
    }
    // ปุ่มไปหน้า บทประพันธ์
    public void clickToPoem(View view) {
        Intent gotopoem = new Intent(Activity_Menu.this, Activity_Poem.class);
        startActivity(gotopoem);
    }
    // ปุ่มไปหน้า ประเภทของเรือ
    public void clickToTypeBoat(View view) {
        Intent gototypeboat = new Intent(Activity_Menu.this, Activity_TypeBoat.class);
        startActivity(gototypeboat);
    }
    // ปุ่มไปหน้า ภาพเรือแบบ VR
    public void clickToVr(View view) {
        Intent gotovr = new Intent(Activity_Menu.this, Activity_MenuVr.class);
        startActivity(gotovr);
    }
}
