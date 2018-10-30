package com.example.user.poemapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_TypeBoat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__type_boat);
    }
    // ปุ่มย้อนกลับไปหน้า เมนู
    public void clickBackToMenu(View view) {
        Intent backtomenu = new Intent(Activity_TypeBoat.this, Activity_Menu.class);
        startActivity(backtomenu);
    }
    // ปุ่มไปหน้า activity_list_view_boat_type1 (หน้าเรือที่อยู่ในพระราชพิธี)
    public void clickToListViewBoatType1(View view) {
        Intent gotolistviewboattype1 = new Intent(Activity_TypeBoat.this, Activity_ListView_BoatType1.class);
        startActivity(gotolistviewboattype1);
    }
    // ปุ่มไปหน้า activity_list_view__boat_type2 (หน้าเรือที่อยู่ในกาพย์เห่เรือ)
    public void clickToListViewBoatType2(View view) {
        Intent gotolistviewboattype2 = new Intent(Activity_TypeBoat.this, Activity_ListView_BoatType2.class);
        startActivity(gotolistviewboattype2);
    }
    // ปุ่มไปหน้าค้นหา Search
    public void clickToSearch(View view) {
        Intent gotosearch = new Intent(Activity_TypeBoat.this, MainActivity.class);
        startActivity(gotosearch);
    }
}
