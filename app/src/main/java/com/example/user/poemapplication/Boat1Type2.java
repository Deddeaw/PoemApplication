package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Boat1Type2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat1_type2);
    }
    // ปุ่มย้อนกลับไปหน้ากายพ์เห่เรือ
    public void backtoType1(View view) {
        Intent boat1 = new Intent(Boat1Type2.this, Activity_ListView_BoatType2.class);
        startActivity(boat1);
    }


}
