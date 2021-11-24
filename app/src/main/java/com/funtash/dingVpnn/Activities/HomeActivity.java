package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.widget.TableLayout;

import com.funtash.dingVpnn.Adapter.HomeAdapter;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivityHomeBinding;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    HomeAdapter homeAdapter;
    TabLayout tableLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewPager = binding.viewPager;
        tableLayout = binding.tabLayout;
        homeAdapter = new HomeAdapter(getSupportFragmentManager());
        binding.viewPager.setAdapter(homeAdapter);
        tableLayout.setupWithViewPager(viewPager);

    }


}