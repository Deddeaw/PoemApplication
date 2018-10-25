package com.example.user.poemapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_MenuVr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__menu_vr);
    }
    // 1. เรือพระที่นั่งนารายณ์ทรงสุบรรณ
    public void clickView1(View view) {
        Intent vrView1 = new Intent(Intent.ACTION_VIEW);
        vrView1.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254655148728417/?type=3&theater"));
        startActivity(vrView1);
    }
    //2.เรือพระที่นั่งอเนกชาติภุชงค์
    public void clickView2(View view) {
        Intent vrView2 = new Intent(Intent.ACTION_VIEW);
        vrView2.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254656982061567/?type=3&theater"));
        startActivity(vrView2);
    }
    // 3.เรือสุรวายุภักษ์
    public void clickView3(View view) {
        Intent vrView3 = new Intent(Intent.ACTION_VIEW);
        vrView3.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254658618728070/?type=3&theater"));
        startActivity(vrView3);
    }
    // 4.เรือกระบี่ปราบเมืองมาร
    public void clickView4(View view) {
        Intent vrView4 = new Intent(Intent.ACTION_VIEW);
        vrView4.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254659615394637/?type=3&theater"));
        startActivity(vrView4);
    }
    // 5.เรือเสือคำรณสินธ์ุ
    public void clickView5(View view) {
        Intent vrView5 = new Intent(Intent.ACTION_VIEW);
        vrView5.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254667262060539/?type=3&theater"));
        startActivity(vrView5);
    }
    // เรือในกาพย์เห่เรือ
    // 1.เรือพระที่นั่งสุพรรณหงส์
    public void clickView6(View view) {
        Intent vrView6 = new Intent(Intent.ACTION_VIEW);
        vrView6.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254669045393694/?type=3&theater"));
        startActivity(vrView6);
    }
    // 2.เรือเอกไชยเหินหาว
    public void clickView7(View view) {
        Intent vrView7 = new Intent(Intent.ACTION_VIEW);
        vrView7.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254670202060245/?type=3&theater"));
        startActivity(vrView7);
    }
    // 3.เรือครุฑเหินเห็จ
    public void clickView8(View view) {
        Intent vrView8 = new Intent(Intent.ACTION_VIEW);
        vrView8.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254676672059598/?type=3&theater"));
        startActivity(vrView8);
    }
    // 4.เรือพระที่นั่งอนันตนาคราช
    public void clickView9(View view) {
        Intent vrView9 = new Intent(Intent.ACTION_VIEW);
        vrView9.setData(Uri.parse("https://www.facebook.com/241783883348877/photos/a.243972973129968/254677968726135/?type=3&theater"));
        startActivity(vrView9);
    }
    // ปุ่มย้อนกลับไปหน้า เมนู
    public void clickBackToMenu(View view) {
        Intent backtomenu = new Intent(Activity_MenuVr.this, Activity_Menu.class);
        startActivity(backtomenu);
    }
}
