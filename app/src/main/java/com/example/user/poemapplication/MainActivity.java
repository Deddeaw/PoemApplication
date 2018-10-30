package com.example.user.poemapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ค้นหาชื่อเรือ...!!");

        title = new String[]{"เรือพระที่นั่งนารายณ์ทรงสุบรรณ", "เรือพระที่นั่งอเนกชาติภุชงค์", "เรืออสุรวายุภักษ์", "เรือกระบี่ปราบเมืองมาร", "เรือเสือคำรณสินธุ์"
                , "เรือสมรรถไชย", "เรือพระที่นั่งสุพรรณหงส์", "เรือไกรสรมุข", "เรือเอกไชยเหินหาว", "เรือครุฑเหินเห็จ"
                , "เรือสิงห์", "เรือม้า", "เรือพระที่นั่งอนันตนาคราช(เรือวาสุกรี)", "เรือคชสีห์", "เรือราชสีห์"
                , "เรือมังกร", "เรือเลียงผา", "เรือนกอินทรี"};
        description = new String[]{"ประวัติของเรือ เรือพระที่นั่งนารายณ์ทรงสุบรรณ... ", "ประวัติของเรือ เรือพระที่นั่งอเนกชาติภุชงค์...", "ประวัติของเรือ เรืออสุรวายุภักษ์...", "ประวัติของเรือ เรือกระบี่ปราบเมืองมาร...", "ประวัติของเรือ เรือเสือคำรณสินธุ์...",
                "ประวัติของเรือ เรือสมรรถไชย... ", "ประวัติของเรือ เรือพระที่นั่งสุพรรณหงส์...", "ประวัติของเรือ เรือไกรสรมุข...", "ประวัติของเรือ เรือเอกไชยเหินหาว...", "ประวัติของเรือ เรือครุฑเหินเห็จ...",
                "ประวัติของเรือ เรือสิงห์... ", "ประวัติของเรือ เรือม้า...", "ประวัติของเรือ เรือพระที่นั่งอนันตนาคราช(เรือวาสุกรี)...", "ประวัติของเรือ เรือคชสีห์...", "ประวัติของเรือ เรือราชสีห์...",
                "ประวัติของเรือ เรือมังกร... ", "ประวัติของเรือ เรือเลียงผา...", "ประวัติของเรือ เรือนกอินทรี..."};
        icon = new int[]{R.drawable.boat1type2, R.drawable.boat2type2, R.drawable.boat3type2, R.drawable.boat4type2, R.drawable.boat5type2,
                R.drawable.boat1type1 ,R.drawable.boat3type1 ,R.drawable.boat2type1
                ,R.drawable.boat4type1 ,R.drawable.boat5type1,
                R.drawable.boat6type1 ,R.drawable.boat7type1 ,R.drawable.boat8type1
                ,R.drawable.boat9type1 ,R.drawable.boat10type1,
                R.drawable.boat11type1 ,R.drawable.boat12type1 ,
                R.drawable.boat13type1 };

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //ปุ่มกลับไปหน้าเมนู
    public void backToMain(View view) {
        Intent backtomain = new Intent(MainActivity.this, Activity_TypeBoat.class);
        startActivity(backtomain);
    }
}