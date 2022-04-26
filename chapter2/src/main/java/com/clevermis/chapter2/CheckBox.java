package com.clevermis.chapter2;

/**
 * @program: text
 * @description:
 * @author: Clevermis
 * @create: 2022-04-26 16:32
 **/
package com.clevermis.text;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.RadioGroup.OnCheckedChangeListener;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private TextView resultTextView;
    private String hobbys = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = (TextView) findViewById(R.id.resultTxtView);
        CheckBox appleCheckButton = (CheckBox) findViewById(R.id.apple);
        appleCheckButton.setOnCheckedChangeListener(this);
        CheckBox bananaCheckButton = (CheckBox) findViewById(R.id.banana);
        bananaCheckButton.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String selectTxt = compoundButton.getText().toString();
        if(b)
        {
            if(!this.hobbys.contains(selectTxt)){
                this.hobbys+=selectTxt;
                this.resultTextView.setText(hobbys);
            }
        }else{
            if(this.hobbys.contains(selectTxt)){
                this.hobbys.replace(selectTxt,"");
                this.resultTextView.setText(hobbys);
            }
        }
    }
}

