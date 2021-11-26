package com.funtash.dingVpnn.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentDisconnectFragmentBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class disconnect_fragment extends BottomSheetDialogFragment {
    FragmentDisconnectFragmentBinding binding;

    public disconnect_fragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDisconnectFragmentBinding.inflate(getLayoutInflater());
        binding.btnsisconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        binding.btnnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return binding.getRoot();
    }
}