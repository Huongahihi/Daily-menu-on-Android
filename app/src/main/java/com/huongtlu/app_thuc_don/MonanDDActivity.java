package com.huongtlu.app_thuc_don;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonanDDActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnda,btntminh,btnndong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monan_dd);
        btnda=findViewById(R.id.btnda);
        btntminh=findViewById(R.id.btnthongminh);
        btnndong=findViewById(R.id.btnnangdong);
        btnda.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if(id==R.id.btnda){
            Intent intent=new Intent(MonanDDActivity.this,DepdaActivity.class);
            startActivity(intent);
        }
        if (id==R.id.btnthongminh){

        }
        if(id==R.id.btnnangdong){

        }
    }
}
