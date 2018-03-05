package com.huongtlu.app_thuc_don;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ThucdonActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<BuaAn> arrTraicay;
    BuaAnAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thucdon);
        listView=(ListView) findViewById(R.id.lvBuaan);
        arrTraicay= new ArrayList<>();
        arrTraicay.add(new BuaAn("Dâu tây","Đâu tây Đà lat",R.drawable.buasang1));
        arrTraicay.add(new BuaAn("Táo tây","Táo tây Đà lat",R.drawable.buasang2));
        arrTraicay.add(new BuaAn("Cam tây","Cam tây Đà lat",R.drawable.buasang3));
        arrTraicay.add(new BuaAn("Thanh Long tây","Thanh Long tây Đà lat",R.drawable.buatrua1));
        arrTraicay.add(new BuaAn("xoài tây","Xoài tây Đà lat",R.drawable.buatrua2));
        adapter=new BuaAnAdapter(this,R.layout.list_mon_an,arrTraicay);
        listView.setAdapter(adapter);
    }


}
