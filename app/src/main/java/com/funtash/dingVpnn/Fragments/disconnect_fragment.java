package com.funtash.dingVpnn.Fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.funtash.dingVpnn.Activities.HomeActivity;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentDisconnectFragmentBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class disconnect_fragment extends BottomSheetDialogFragment {
    FragmentDisconnectFragmentBinding binding;
   int check=0;
   Context context;








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

                Intent intent=new Intent(view.getContext(), HomeActivity.class);
                intent.putExtra("disconnect",1);
                startActivity(intent);




            }
        });
        binding.btnnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dismiss();

            }
        });
        return binding.getRoot();
    }


}