package com.huongtlu.thuchanh_one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Constrain1_Activity extends AppCompatActivity implements View.OnClickListener {
    TextView txt;
    Button btn,btn_click;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrain1);
        txt=(TextView) findViewById(R.id.txt_view);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        editText=(EditText) findViewById(R.id.edit_nhap);
        btn_click=(Button) findViewById(R.id.btn_view);
        btn_click.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if(id==R.id.button) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }
        if(id==R.id.btn_view){
            String name=editText.getText().toString();
            txt.append(name + " đang học lập trình Android ");
        }
    }
}
