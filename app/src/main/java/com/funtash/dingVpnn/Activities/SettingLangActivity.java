package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.funtash.dingVpnn.databinding.ActivitySettingLangBinding;

public class SettingLangActivity extends AppCompatActivity {
    ActivitySettingLangBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySettingLangBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}