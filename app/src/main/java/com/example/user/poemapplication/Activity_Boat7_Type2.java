package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Boat7_Type2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__boat7__type2);
    }
    // กลับไปหน้าเรือในพระราชพิธี
    public void backToType1(View view) {
        Intent intent = new Intent(Activity_Boat7_Type2.this, Activity_ListView_BoatType2.class);
        startActivity(intent);
    }
}
