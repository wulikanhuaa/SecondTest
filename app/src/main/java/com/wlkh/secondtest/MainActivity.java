package com.wlkh.secondtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 1_0_2 这是一个修复分支
 * 开发分支修改了这个文件
 */
public class MainActivity extends AppCompatActivity {

    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
