package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Boat3Type2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat3_type2);
    }

    public void backtoType2(View view) {
        Intent intent = new Intent(Boat3Type2.this, Activity_ListView_BoatType2.class);
        startActivity(intent);
    }
}
