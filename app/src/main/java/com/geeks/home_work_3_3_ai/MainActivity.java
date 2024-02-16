package com.geeks.home_work_3_3_ai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();
        // SecondFragment secondFragment = new SecondFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, mainFragment).commit();
    }

}