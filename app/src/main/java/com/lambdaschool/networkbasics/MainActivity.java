package com.lambdaschool.networkbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (new Thread(new Runnable() {
            @Override
            public void run() {
                SwApiDao.getAllPlanets();
            }
        })).start();
    }
}
