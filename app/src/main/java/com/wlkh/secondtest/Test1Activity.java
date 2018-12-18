package com.wlkh.secondtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 分支中修改了
 */
public class Test1Activity extends AppCompatActivity {

    TextView tv_branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        tv_branch = findViewById(R.id.tv_branch);
        tv_branch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Test1Activity.this, "被点击了", Toast.LENGTH_LONG).show();
            }
        });
    }
}
