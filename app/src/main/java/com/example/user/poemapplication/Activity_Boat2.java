package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Boat2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__boat2);
    }
    // ปุ่มย้อนกลับไปหน้า Activity_list_view_boat_type2 (หน้าประเภทเรือที่อยู่ในกาพย์เห่เรือ)
    public void clickBacktoListViewBoatType2(View view) {
        Intent gobacktolistviewboattype2 = new Intent(Activity_Boat2.this, Activity_ListView_BoatType2.class);
        startActivity(gobacktolistviewboattype2);
    }
}
