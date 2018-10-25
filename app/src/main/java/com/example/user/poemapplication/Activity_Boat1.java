package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Boat1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__boat1);
    }
    // ปุ่มกลับไปหน้า Activity_ListView_BoatType1 (หน้าเรือที่อยู่ในพระราชพิธี)
    public void clickBackToListViewBoatType1(View view) {
        Intent backtolistviewboattype1 = new Intent(Activity_Boat1.this, Activity_ListView_BoatType1.class);
        startActivity(backtolistviewboattype1);
    }
}
