package com.huongtlu.app_thuc_don;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ViewThucdonActivity extends AppCompatActivity {
    ViewPager viewPager;
    BuaAnDetail_Adapter adapter;
    ArrayList<BuaAn> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewthucdon);

        viewPager=(ViewPager) findViewById(R.id.pager);
        adapter=new BuaAnDetail_Adapter(this,ThucdonActivity.arrTraicay);
        viewPager.setAdapter(adapter);
    }
}
