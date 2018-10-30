package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Boat2Type2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat2_type2);
    }

    public void backtoType2(View view) {
        Intent intent = new Intent(Boat2Type2.this, Activity_ListView_BoatType2.class);
        startActivity(intent);
    }
}
