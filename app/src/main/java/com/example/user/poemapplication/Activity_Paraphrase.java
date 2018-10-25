package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Paraphrase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__paraphrase);
    }
    // ปุ่มกลับไปหน้า บทประพันธ์
    public void clickBackToPoem(View view) {
        Intent intent = new Intent(Activity_Paraphrase.this, Activity_Poem.class);
        startActivity(intent);
    }
}
