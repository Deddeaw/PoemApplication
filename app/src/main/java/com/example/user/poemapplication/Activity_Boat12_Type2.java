package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Boat12_Type2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__boat12__type2);
    }

    public void backToType1(View view) {
        Intent intent = new Intent(Activity_Boat12_Type2.this, Activity_ListView_BoatType2.class);
        startActivity(intent);
    }
}
