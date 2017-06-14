package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.android.musicplayerapp.R;

public class Lifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.v("Lifecycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Lifecycle", "onDestroy");
    }
}