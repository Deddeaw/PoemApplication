package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_ListView_BoatType1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list_view__boat_type1);
    }
    // ปุ่มย้อนกลับไปหน้า ประเภทของเรือ
    public void clickBackToTypeBoat(View view) {
        Intent backtotypeboat = new Intent(Activity_ListView_BoatType1.this, Activity_TypeBoat.class);
        startActivity(backtotypeboat);
    }
    // 1.เรือพระที่นั่งนาราณย์ทรงสุบรรณ
    public void clickBoat1(View view) {
        Intent boat1 = new Intent(Activity_ListView_BoatType1.this, Boat1Type1.class);
        startActivity(boat1);
    }
    // 2.เรือพระที่นั่งอเนกชาติภุชงค์
    public void clickBoat2(View view) {
        Intent boat2 = new Intent(Activity_ListView_BoatType1.this, Boat2Type1.class);
        startActivity(boat2);
    }
    // 3.เรือสุรวายุภักษ์
    public void clickBoat3(View view) {
        Intent boat3 = new Intent(Activity_ListView_BoatType1.this, Boat3Type1.class);
        startActivity(boat3);
    }
    // 4. เรือกระบี่ปราบเมืองมาร
    public void clickBoat4(View view) {
        Intent boat4 = new Intent(Activity_ListView_BoatType1.this, Activity_Boat4_Type1.class);
        startActivity(boat4);
    }
    // 5. เรือเสือคำรณสินธุ์
    public void clickBoat5(View view) {
        Intent boat5 = new Intent(Activity_ListView_BoatType1.this, Activity_Boat5_type1.class);
        startActivity(boat5);
    }
}
