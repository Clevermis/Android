package com.clevermis.chapter2;

/**
 * @program: text
 * @description:
 * @author: Clevermis
 * @create: 2022-04-26 16:56
 **/

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button normalToastBtn = (Button) findViewById(R.id.toastBtn1);
        Button customToastBtn = (Button) findViewById(R.id.toastBtn2);
        normalToastBtn.setOnClickListener(this);
        customToastBtn.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toastBtn1:
                Toast.makeText(MainActivity.this,"普通toast控件",Toast.LENGTH_LONG).show();
            case R.id.toastBtn2:
                LayoutInflater inflater = getLayoutInflater();
                View toastView = inflater.inflate(R.layout.toast_customer,null);
                ImageView img = (ImageView) toastView.findViewById(R.id.img);
                img.setImageResource(R.drawable.a);
                TextView tv_msg = (TextView) toastView.findViewById(R.id.tv_msg);
                tv_msg.setText("用户自定义 toast");
                Toast toast = new Toast(MainActivity.this);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(toastView);
                toast.show();
                break;

        }
    }
}

