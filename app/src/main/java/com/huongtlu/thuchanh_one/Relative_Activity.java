package com.huongtlu.thuchanh_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Relative_Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        t1=(TextView) findViewById(R.id.txt1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if(id==R.id.btn1){
            t1.setTextSize(18);
        }
        if(id==R.id.btn2){
            t1.setTextSize(60);
        }

    }
}
