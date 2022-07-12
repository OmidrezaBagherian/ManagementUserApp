package com.omidrezabagherian.managementuser.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.omidrezabagherian.managementuser.R;
import com.omidrezabagherian.managementuser.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        initBottomNavigation();

        setContentView(mainBinding.getRoot());
    }

    @SuppressLint("NonConstantResourceId")
    private void initBottomNavigation(){
        mainBinding.bottomNavigationViewMain.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.tabHome:
                    Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tabAdd:
                    Toast.makeText(MainActivity.this, "add", Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        });
    }
}