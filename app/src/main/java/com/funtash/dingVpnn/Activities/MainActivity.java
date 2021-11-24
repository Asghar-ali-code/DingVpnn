package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
 ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Handler handler=new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
            finish();

        },2000);


    }
}