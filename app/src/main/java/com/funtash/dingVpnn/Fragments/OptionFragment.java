package com.funtash.dingVpnn.Fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.funtash.dingVpnn.Activities.SettingLangActivity;
import com.funtash.dingVpnn.Activities.Settings;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentOptionBinding;


public class OptionFragment extends Fragment {
    View view;
    FragmentOptionBinding binding;
    Dialog rateDialog;
    ImageView dialog_cross;

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
        dialog_cross=rateDialog.findViewById(R.id.dialog_cross);
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
        dialog_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rateDialog.dismiss();
            }
        });
        binding.RlProxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionFragment.this.getActivity(), Settings.class));
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}