package com.funtash.dingVpnn.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentSpeedTestBinding;


public class SpeedTestFragment extends Fragment {
    View view;
    FragmentSpeedTestBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentSpeedTestBinding.inflate(
                getActivity().getLayoutInflater(), container, false);
        view= binding.getRoot();
        binding.btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.btnstart.getText().toString().toLowerCase().equals("Start")) {
                    binding.btnstart.setText("Stop");
                }
                else if(binding.btnstart.getText().toString().toLowerCase().equals("Stop"))
                {
                    binding.btnstart.setText("Start");
                }
            }
        });
        return view;
    }
}