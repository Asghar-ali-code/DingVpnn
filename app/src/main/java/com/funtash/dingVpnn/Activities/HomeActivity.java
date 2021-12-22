package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.widget.TableLayout;

import com.funtash.dingVpnn.Adapter.HomeAdapter;
import com.funtash.dingVpnn.Fragments.HomeFragment;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivityHomeBinding;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    HomeAdapter homeAdapter;
    TabLayout tableLayout;
    ViewPager viewPager;
    int disConnect=0;
    HomeFragment homeFragmentObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent=getIntent();
        disConnect=intent.getIntExtra("disconnect",0);
        Bundle bundle=new Bundle();
        bundle.putString("disConnect", String.valueOf(disConnect));
        homeFragmentObj=new HomeFragment();
        homeFragmentObj.setArguments(bundle);
        @SuppressLint("ResourceType") FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.layout.activity_home, homeFragmentObj);

        viewPager = binding.viewPager;
        tableLayout = binding.tabLayout;
        homeAdapter = new HomeAdapter(getSupportFragmentManager());
        binding.viewPager.setAdapter(homeAdapter);
        tableLayout.setupWithViewPager(viewPager);






    }


}