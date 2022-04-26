package com.clevermis.chapter2;
/**
 * @program: Android
 * @description: qqq
 * @author: Clevermis
 * @create: 2022-04-23 14:07
 **/
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(30);
        constraintLayout.addView(textView,layoutParams);
        setContentView(constraintLayout);
    }
}
