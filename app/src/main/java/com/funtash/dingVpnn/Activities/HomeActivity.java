package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TextPaint paint = binding.TvTop.getPaint();
        float width = paint.measureText("Di, ng");

        Shader textShader = new LinearGradient(0, 0, width, binding.TvTop.getTextSize(),
                new int[]{
                        Color.parseColor("#db4e2d"),
                        Color.parseColor("#f73607"),
                }, null, Shader.TileMode.CLAMP);
       binding.TvTop.getPaint().setShader(textShader);
    }
}