package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_ListView_BoatType2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list_view__boat_type2);
    }
    // ปุ่มกลับไปหน้า ActivityTypeBoat (หน้าประเภทเรือ)
    public void clickBacktoTypeBoat(View view) {
        Intent backtotypeboat = new Intent(Activity_ListView_BoatType2.this, Activity_TypeBoat.class);
        startActivity(backtotypeboat);
    }
}
