package com.huongtlu.thuchanh_one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Frame_Activity extends AppCompatActivity implements View.OnClickListener {
    TextView txtn;
    ImageButton img;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        txtn=(TextView) findViewById(R.id.textView2);
        img=(ImageButton) findViewById(R.id.img_button);
        img.setOnClickListener(this);
        next=(Button) findViewById(R.id.btn_next);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if(id==R.id.img_button){
            img.setVisibility(View.INVISIBLE);
            txtn.setVisibility(View.VISIBLE);
            txtn.setTextSize(50);
        }
        if(id==R.id.btn_next){
            Intent intent=new Intent(this, Relative_Activity.class);
            startActivity(intent);
        }
    }
}
