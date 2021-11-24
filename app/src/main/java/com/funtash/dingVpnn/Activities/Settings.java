package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivitySettingsBinding;

public class Settings extends AppCompatActivity {
    ActivitySettingsBinding binding;
    Dialog passwordDialog,usernamedialog,domainDialog,portDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        passwordDialog=new Dialog(this);
        usernamedialog=new Dialog(this);
        domainDialog=new Dialog(this);
        portDialog=new Dialog(this);
        passwordDialog.setContentView(R.layout.password_dialog);
        usernamedialog.setContentView(R.layout.username_dialog);
        domainDialog.setContentView(R.layout.domain_dialog);
        portDialog.setContentView(R.layout.port_dialog);
        binding.llPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passwordDialog.show();
            }
        });
        binding.llDomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                domainDialog.show();
            }
        });
        binding.llUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernamedialog.show();
            }
        });
        binding.llPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                portDialog.show();
            }
        });
    }
}