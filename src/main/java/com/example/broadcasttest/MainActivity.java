package com.example.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestBroadCastReceiver receiver = new TestBroadCastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.intent.action.AIRPLANE_MODE");

        registerReceiver(receiver, filter);
    }
}
