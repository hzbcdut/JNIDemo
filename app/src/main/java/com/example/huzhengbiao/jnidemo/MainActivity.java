package com.example.huzhengbiao.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyJniUtils utils = new MyJniUtils();
        String name = utils.getName();
        Log.d("debug", " --> name = " + name);
    }
}
