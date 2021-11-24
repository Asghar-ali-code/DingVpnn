package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivitySettingsBinding;

public class Settings extends AppCompatActivity {
    ActivitySettingsBinding binding;
    Dialog passwordDialog,rateDialog,domainDialog,portDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        passwordDialog=new Dialog(this);
        rateDialog=new Dialog(this);
        domainDialog=new Dialog(this);
        portDialog=new Dialog(this);
        passwordDialog.setContentView(R.layout.password_dialog);
        rateDialog.setContentView(R.layout.rate_dialog);
        domainDialog.setContentView(R.layout.domain_dialog);
        portDialog.setContentView(R.layout.port_dialog);
    }
}