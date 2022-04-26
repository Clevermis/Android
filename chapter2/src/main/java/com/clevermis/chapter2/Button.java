package com.clevermis.chapter2;

/**
 * @program: text
 * @description:
 * @author: Clevermis
 * @create: 2022-04-26 15:12
 **/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numTextView = (TextView)findViewById(R.id.textViewNum);
        Button addBtn= (Button) findViewById(R.id.add);
        Button subBtn= (Button) findViewById(R.id.sub);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                numTextView.setText(num);
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num--;
                numTextView.setText(num);
            }
        });

    }
}
