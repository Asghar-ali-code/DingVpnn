package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivitySettingLangBinding;

public class SettingLangActivity extends AppCompatActivity {
    ActivitySettingLangBinding binding;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySettingLangBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dialog=new Dialog(this);
        dialog.setContentView(R.layout.select_language_dialog);
        binding.RlLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
    }
}