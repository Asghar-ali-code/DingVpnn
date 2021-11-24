package com.funtash.dingVpnn.Fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funtash.dingVpnn.Activities.SettingLangActivity;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentOptionBinding;


public class OptionFragment extends Fragment {
    View view;
    FragmentOptionBinding binding;
    Dialog rateDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentOptionBinding.inflate(getLayoutInflater(),container, false);
        view= inflater.inflate(R.layout.fragment_option, container, false);
        view=binding.getRoot();
        rateDialog=new Dialog(OptionFragment.this.getActivity());
        rateDialog.setContentView(R.layout.rate_dialog);
        binding.RlLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionFragment.this.getActivity(), SettingLangActivity.class));
            }
        });
        binding.RlRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rateDialog.show();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}