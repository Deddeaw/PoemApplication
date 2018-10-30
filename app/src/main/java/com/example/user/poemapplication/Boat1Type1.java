package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Boat1Type1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat1_type1);
    }
    // ปุ่มย้อนกลับไปหน้า เมนูเรือที่อยู่ในพระราชพิธี
    public void backtoType1(View view) {
        Intent intent = new Intent(Boat1Type1.this, Activity_ListView_BoatType1.class);
        startActivity(intent);
    }
}
