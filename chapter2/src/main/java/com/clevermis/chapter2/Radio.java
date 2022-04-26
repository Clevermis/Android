package com.clevermis.chapter2;

/**
 * @program: text
 * @description:
 * @author: Clevermis
 * @create: 2022-04-26 15:48
 **/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView resultTextView;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.resultTextView = (TextView) findViewById(R.id.textView);
        this.radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        this.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio0)
                    resultTextView.setText("您的性别是：男");
                else
                    resultTextView.setText("您的性别是：女");
            }
        });
    }
}