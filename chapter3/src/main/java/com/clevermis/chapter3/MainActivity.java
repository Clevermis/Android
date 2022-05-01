package com.clevermis.chapter3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity {

    String sex[] = {"男","女"};
    int sexIndex = 0;
    String sports[] = {"跑步","跳远","足球","游泳"};
    boolean selected[] = {false,false,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button normalDlgBtn = (Button) findViewById(R.id.normalDlgBtn);
        Button singleDlgBtn = (Button) findViewById(R.id.singleDlgBtn);
        Button multiDlgBtn = (Button) findViewById(R.id.multiplyDlgBtn);
        Button customerDlgBtn = (Button) findViewById(R.id.customDlgBtn);

//        normalDlgBtn.setOnClickListener((View.OnClickListener) this);
//        singleDlgBtn.setOnClickListener(this);
//        multiDlgBtn.setOnClickListener(this);
//        customerDlgBtn.setOnClickListener(this);
//
        normalDlgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==R.id.normalDlgBtn){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("普通对话框")
                            .setIcon(R.mipmap.ic_launcher)
                            .setMessage("是否退出程序?")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Toast.makeText(MainActivity.this,"您单击了普通对话框的确认按钮",Toast.LENGTH_LONG).show();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            Toast.makeText(MainActivity.this,"您单击了普通对话框的取消按钮",Toast.LENGTH_LONG).show();
                        }
                    })
                            .show();
                }

            }
        });


        singleDlgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==R.id.singleDlgBtn){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("性别")
                            .setIcon(R.mipmap.ic_launcher)
                            .setSingleChoiceItems(sex, 0, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    sexIndex = which;
                                }
                            })
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Toast.makeText(MainActivity.this,"您的性别是："+sex[which],Toast.LENGTH_LONG).show();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Toast.makeText(MainActivity.this,"您单击了单选对话框的取消按钮",Toast.LENGTH_LONG).show();
                                }
                            }).show();


                }

            }
        });



        multiDlgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==R.id.multiplyDlgBtn){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setIcon(R.mipmap.ic_launcher)
                            .setTitle("运动项目")
                            .setMultiChoiceItems(sports, selected, new DialogInterface.OnMultiChoiceClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                                    selected[which] = isChecked;
                                }
                            })
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    StringBuilder sb = new StringBuilder();
                                    for (int ind = 0;ind<selected.length;++ind){
                                        if(selected[ind]){
                                            sb.append(sports[ind]).append("");
                                        }
                                    }
                                    Toast.makeText(MainActivity.this,sb.toString(),Toast.LENGTH_LONG).show();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this,"您单击了取消按钮",Toast.LENGTH_LONG).show();
                                }
                            })
                            .show();

                }
            }
        });


        customerDlgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==R.id.customDlgBtn){
                    CustmoerDialog dlg = new CustmoerDialog(MainActivity.this);
                    dlg.setTitle("标题");
                    dlg.setStrMessage("提示信息。。。");
                    dlg.setStrOk("确认");
                    dlg.setSteCancel("取消");
                    dlg.show();
                }
            }
        });
    }

    public void show() {
    }
}