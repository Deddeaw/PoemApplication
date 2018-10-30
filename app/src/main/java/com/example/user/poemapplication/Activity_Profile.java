package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__profile);
    }

    public void backtoMenu(View view) {
        Intent intent = new Intent(Activity_Profile.this, Activity_Menu.class);
        startActivity(intent);
    }
}
