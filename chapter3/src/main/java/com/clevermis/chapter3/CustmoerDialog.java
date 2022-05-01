package com.clevermis.chapter3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * @program: test2
 * @description:
 * @author: Clevermis
 * @create: 2022-05-01 19:38
 **/
public class CustmoerDialog extends MainActivity {
    private TextView title,message;
    private Button ok,cancel;
    private String strTitle,strMessage,strOk,steCancel;

    public CustmoerDialog(MainActivity mainActivity) {
        super();
    }

    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public void setStrOk(String strOk) {
        this.strOk = strOk;
    }

    public void setSteCancel(String steCancel) {
        this.steCancel = steCancel;
    }


    @Override
    protected void onCreate(Bundle savadInstanceState) {

        super.onCreate(savadInstanceState);
        setContentView(R.layout.customer_dialog);
        title = (TextView) findViewById(R.id.title);
        message = (TextView) findViewById(R.id.message);
        ok = (Button) findViewById(R.id.ok);
        cancel = (Button) findViewById(R.id.cancel);
    }
    @Override
    public void  show(){
        super.show();
        title.setText(strTitle);
        message.setText(strMessage);
        ok.setText(strOk);
        cancel.setText(steCancel);
    }




}
