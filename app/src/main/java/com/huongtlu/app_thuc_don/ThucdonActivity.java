package com.huongtlu.app_thuc_don;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class ThucdonActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    public static ArrayList<BuaAn> arrTraicay;
    BuaAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thucdon);
        listView = (ListView) findViewById(R.id.lvBuaan);

        arrTraicay = new ArrayList<>();
        arrTraicay.add(new BuaAn("buasang1", "Cháo trà xanh", R.drawable.buasang1));
        arrTraicay.add(new BuaAn("buasang2", "Cháo trai bổ dưỡng", R.drawable.buasang2));
        arrTraicay.add(new BuaAn("buasang3", "Mỳ tôm Nhật thật", R.drawable.buasang3));
        arrTraicay.add(new BuaAn("buatrua1", "Đậu, thịt, đỗ, kho", R.drawable.buatrua1));
        arrTraicay.add(new BuaAn("buatrua2", "Đậu, xương, đu đủ, thịt, tàu", R.drawable.buatrua2));
        arrTraicay.add(new BuaAn("buatrua3", "Cá, măng, đỗ, đậu, thịt", R.drawable.buatrua3));
        arrTraicay.add(new BuaAn("buatoi1", "Dừa, khoai, cà chua, thịt, tàu", R.drawable.buatoi1));
        arrTraicay.add(new BuaAn("buatoi2", "Suplor, tôm, măng, thịt, cá", R.drawable.buatoi2));
        arrTraicay.add(new BuaAn("buatoi3", "Dưa, măng, cá, thịt, trứng", R.drawable.buatoi3));
        adapter = new BuaAnAdapter(this, R.layout.list_mon_an, arrTraicay);
        listView.setAdapter(adapter);
        //Bắt sự kiện click
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuyeah, menu);
        SearchView searchView;
        searchView=(SearchView) findViewById(R.id.txtSearch);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.filter(s.trim());
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                break;
            case R.id.update:
                Intent intent = new Intent(ThucdonActivity.this, Update_Activity.class);
                startActivity(intent);
                break;
            case R.id.love:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=new Intent(this,ViewThucdonActivity.class);
        startActivity(intent);
    }
}
