package com.live.tech.cinematic.sdk.android_sdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.appsghor.common.AppLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppLog.print("Test Print");
    }
}