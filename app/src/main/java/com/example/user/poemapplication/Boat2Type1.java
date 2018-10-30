package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Boat2Type1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat2_type1);
    }
    //ปุ่มย้อนกลับไปหน้าเรือที่อยู่ในพระราชพิธี
    public void backtoType2(View view) {
        Intent back = new Intent(Boat2Type1.this, Activity_ListView_BoatType1.class);
        startActivity(back);
    }
}
