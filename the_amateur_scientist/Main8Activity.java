package com.tas.pesu.the_amateur_scientist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Timer timer;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent Int = new Intent(Main8Activity.this, MainActivity.class);
                startActivity(Int);
                finish();

            }
        },800);
    }
}
