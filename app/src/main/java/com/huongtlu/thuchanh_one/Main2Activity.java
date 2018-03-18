package com.huongtlu.thuchanh_one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    TextView txt1,txt2,txt3;
    EditText ed1, ed2;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1=(TextView) findViewById(R.id.text1);
        txt2=(TextView) findViewById(R.id.text2);
        txt3=(TextView) findViewById(R.id.text3);
        ed1=(EditText) findViewById(R.id.edit1);
        ed2=(EditText) findViewById(R.id.edit2);
        btn1=(Button) findViewById(R.id.but1);
        btn2=(Button) findViewById(R.id.but2);
        btn1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int id=view.getId();
        if(id==R.id.but1) {
            Intent intent = new Intent(this, Frame_Activity.class);
            startActivity(intent);
        }
    }
}
