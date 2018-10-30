package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Boat3Type1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat3_type1);
    }
    // ปุ่มย้อนกลับไปหน้า เรือในพระราชพิธี
    public void backtoType2(View view) {
        Intent intent = new Intent(Boat3Type1.this, Activity_ListView_BoatType1.class);
        startActivity(intent);
    }
}
