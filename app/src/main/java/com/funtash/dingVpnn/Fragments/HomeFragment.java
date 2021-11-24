package com.funtash.dingVpnn.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funtash.dingVpnn.Activities.Server;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    View view;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);
        view = inflater.inflate(R.layout.fragment_home, container, false);
        view = binding.getRoot();

        binding.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeFragment.this.getActivity(), Server.class));
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}