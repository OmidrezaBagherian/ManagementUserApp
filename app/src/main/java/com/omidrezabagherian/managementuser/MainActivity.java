package com.omidrezabagherian.managementuser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;
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

    private void initBottomNavigation(){
        mainBinding.bottomNavigationViewMain.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.tabHome:
                        Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tabAdd:
                        Toast.makeText(MainActivity.this, "add", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}