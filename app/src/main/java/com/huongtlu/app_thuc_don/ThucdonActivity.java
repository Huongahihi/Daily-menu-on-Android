package com.huongtlu.app_thuc_don;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
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
        arrTraicay.add(new BuaAn("[Bữa sáng] Tỏa nắng","Cháo trà xanh",R.drawable.buasang1));
        arrTraicay.add(new BuaAn("[Bữa sáng] Trúc mai","Cháo trai bổ dưỡng",R.drawable.buasang2));
        arrTraicay.add(new BuaAn("[Bữa sáng] Trúc đa hương","Mỳ tôm Nhật thật",R.drawable.buasang3));
        arrTraicay.add(new BuaAn("[Bữa trưa] Ngũ tảo","Đậu, thịt, đỗ, kho",R.drawable.buatrua1));
        arrTraicay.add(new BuaAn("[Bưa trưa] Hương vị","Đậu, xương, đu đủ, thịt, tàu",R.drawable.buatrua2));
        arrTraicay.add(new BuaAn("[Bưa trưa] Đậm đà","Cá, măng, đỗ, đậu, thịt",R.drawable.buatrua3));
        arrTraicay.add(new BuaAn("[Bưa tối] Thư xa","Dừa, khoai, cà chua, thịt, tàu",R.drawable.buatoi1));
        arrTraicay.add(new BuaAn("[Bưa tối] Bình ăn","Suplor, tôm, măng, thịt, cá",R.drawable.buatoi2));
        arrTraicay.add(new BuaAn("[Bưa tối] Ngô tĩnh","Dưa, măng, cá, thịt, trứng",R.drawable.buatoi3));
        adapter=new BuaAnAdapter(this,R.layout.list_mon_an,arrTraicay);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuyeah,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                break;
            case R.id.update:
                Intent intent=new Intent(ThucdonActivity.this,Update_Activity.class);
                startActivity(intent);
                break;
            case R.id.love:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
