package com.omidrezabagherian.managementuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omidrezabagherian.managementuser.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(mainBinding.getRoot());
    }
}