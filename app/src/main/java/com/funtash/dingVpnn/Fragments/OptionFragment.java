package com.funtash.dingVpnn.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentOptionBinding;


public class OptionFragment extends Fragment {
    View view;
    FragmentOptionBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentOptionBinding.inflate(getLayoutInflater(), container, false);
        view=binding.getRoot();
        // Inflate the layout for this fragment
        return view;
    }
}