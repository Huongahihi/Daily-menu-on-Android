package com.huongtlu.app_thuc_don;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ViewMonanddActivity extends AppCompatActivity {
    ViewPager viewPager;
    BuaAnDetail_Adapter adapter;
    ArrayList<BuaAn> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_monandd);
        viewPager=(ViewPager) findViewById(R.id.pager2);
        adapter=new BuaAnDetail_Adapter(this,DepdaActivity.arrTraicay);
        viewPager.setAdapter(adapter);
    }
}
