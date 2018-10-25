package com.example.user.poemapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_Poem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__poem);
    }
    // ปุ่มกลับไปหน้า เมนู
    public void clickBackToMenu(View view) {
        Intent backtomenu = new Intent(Activity_Poem.this, Activity_Menu.class);
        startActivity(backtomenu);
    }
    // ปุ่มไปหน้าถอดความ
    public void clickToPrp(View view) {
        Intent gotoprp = new Intent(Activity_Poem.this, Activity_Paraphrase.class);
        startActivity(gotoprp);
    }
    // ปุ่มไปหน้าฟังบทประพันธ์
    public void clickToLis(View view) {
        Intent gotolispoem = new Intent(Intent.ACTION_VIEW);
        gotolispoem.setData(Uri.parse("https://www.youtube.com/watch?v=5lnIHlw7Bwk&t=9s"));
        startActivity(gotolispoem);
    }
}
