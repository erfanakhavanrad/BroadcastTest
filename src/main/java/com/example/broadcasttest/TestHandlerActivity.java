package com.example.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class TestHandlerActivity extends AppCompatActivity {
    Boolean userClickedOnBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);

    }

    @Override
    public void onBackPressed() {

        if (userClickedOnBack == true){
            super.onBackPressed();
        }else {
            userClickedOnBack = true;
            Toast.makeText(this, "Press back again.", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    userClickedOnBack = false;
                }
            }, 2000);
        }
    }
}
