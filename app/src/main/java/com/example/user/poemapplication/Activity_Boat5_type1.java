package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Boat5_type1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__boat5_type1);
    }
    // กลับไปหน้าเรือที่อยู่ในพระราชพิธี
    public void backtoType2(View view) {
        Intent intent = new Intent(Activity_Boat5_type1.this, Activity_ListView_BoatType1.class);
        startActivity(intent);
    }
}
