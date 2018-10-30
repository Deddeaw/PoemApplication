package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ActionBar actionBar = getSupportActionBar();
        TextView mDetailTv = findViewById(R.id.txtView7);
        TextView mDetailBoat = findViewById(R.id.txtView8);

        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");
        String mDetailB = intent.getStringExtra("detailBoat");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview
        mDetailTv.setText(mContent);
        mDetailBoat.setText(mDetailB);



    }
    // กลับไปหน้าค้นหา
    public void backtoSearch(View view) {
        Intent backtosearch = new Intent(NewActivity.this, MainActivity.class);
        startActivity(backtosearch);
    }
}
