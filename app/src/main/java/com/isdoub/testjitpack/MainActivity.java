package com.isdoub.testjitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.isdoub.doubilibrary.DoubiUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, DoubiUtil.sayHello(),Toast.LENGTH_SHORT).show();
    }
}
