package com.huongtlu.app_thuc_don;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DepdaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lstda;
    public static ArrayList<BuaAn> arrTraicay;
    BuaAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depda);
        lstda=findViewById(R.id.listdepda);
        arrTraicay = new ArrayList<>();
        arrTraicay.add(new BuaAn("depda1", "Cháo trà xanh", R.drawable.depda1));
        arrTraicay.add(new BuaAn("depda2", "Cháo trai bổ dưỡng", R.drawable.depda2));
        arrTraicay.add(new BuaAn("Thông minh đẳng cấp", "Mỳ tôm Nhật thật", R.drawable.thongminh1));
        arrTraicay.add(new BuaAn("Đệ nhất gia đình", "Đậu, thịt, đỗ, kho", R.drawable.thongminh2));
        adapter = new BuaAnAdapter(this, R.layout.list_mon_an, arrTraicay);
        lstda.setAdapter(adapter);
        //Bắt sự kiện click
        lstda.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=new Intent(this,ViewMonanddActivity.class);
        startActivity(intent);
    }
}
