package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_ListView_BoatType2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list_view__boat_type2);
    }
    // ปุ่มกลับไปหน้า ActivityTypeBoat (หน้าประเภทเรือ)
    public void clickBacktoTypeBoat(View view) {
        Intent backtotypeboat = new Intent(Activity_ListView_BoatType2.this, Activity_TypeBoat.class);
        startActivity(backtotypeboat);
    }
    // 1. เรือสมรรถไชย
    public void clickBoat1(View view) {
        Intent boat1 = new Intent(Activity_ListView_BoatType2.this, Boat1Type2.class);
        startActivity(boat1);
    }
    //2. เรือสุพรรณหงส์
    public void clickBoat2(View view) {
        Intent boat2 = new Intent(Activity_ListView_BoatType2.this, Boat2Type2.class);
        startActivity(boat2);
    }
    // 3. เรือไกรสรมุข
    public void clickBoat3(View view) {
        Intent boat3 = new Intent(Activity_ListView_BoatType2.this,Boat3Type2.class);
        startActivity(boat3);
    }
    // 4. เรือเอกไชยเหินหาว
    public void clickBoat4(View view) {
        Intent boat4 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat4_Type2.class);
        startActivity(boat4);
    }
    // 5. เรือครุฑเหินเห็จ
    public void clickBoat5(View view) {
        Intent boat5 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat5_Type2.class);
        startActivity(boat5);
    }
    // 6. เรือสิงห์
    public void clickBoat6(View view) {
        Intent boat6 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat6_Type2.class);
        startActivity(boat6);
    }
    // 7. เรือม้า
    public void clickBoat7(View view) {
        Intent boat7 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat7_Type2.class);
        startActivity(boat7);
    }
    // 8. เรือวาสุกรี(เรือพระที่นั่งอนันตนคราช)
    public void clickBoat8(View view) {
        Intent boat8 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat8_Type2.class);
        startActivity(boat8);
    }
    // 9. เรือคชสีห์
    public void clickBoat9(View view) {
        Intent boat9 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat9_Type2.class);
        startActivity(boat9);
    }
    // 10.เรือราชสีห์
    public void clickBoat10(View view) {
        Intent boat10 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat10_Type2.class);
        startActivity(boat10);
    }
    // 11.เรือมังกร
    public void clickBoat11(View view) {
        Intent boat11 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat11_Type2.class);
        startActivity(boat11);
    }
    // 12. เรือเลียงผา
    public void clickBoat12(View view) {
        Intent boat12 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat12_Type2.class);
        startActivity(boat12);
    }
    // 13. เรือนกอินทรี
    public void clickBoat13(View view) {
        Intent boat13 = new Intent(Activity_ListView_BoatType2.this, Activity_Boat13_Type2.class);
        startActivity(boat13);
    }
}
