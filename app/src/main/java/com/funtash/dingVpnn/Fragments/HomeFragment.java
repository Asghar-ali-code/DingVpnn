package com.funtash.dingVpnn.Fragments;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funtash.dingVpnn.Activities.Server;
import com.funtash.dingVpnn.Interface.Disconnect;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment  {

    FragmentHomeBinding binding;
    View view;
    int check=0;
    Context context;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments()!=null)
            check= Integer.parseInt(getArguments().getString("disConnect","0"));
        binding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);
        view = inflater.inflate(R.layout.fragment_home, container, false);
        view = binding.getRoot();

         if (check==1)
             disconnect();

        binding.relativeLayout.setOnClickListener(view -> startActivity(new Intent(HomeFragment.this.getActivity(), Server.class)));
        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check==0){
                    connect();

                }else
                if (check==1){
                    disconnect_fragment disconnect_fragment=new disconnect_fragment();
                    disconnect_fragment.show(getFragmentManager(),disconnect_fragment.getTag());

                }
            }
        });



        // Inflate the layout for this fragment
        return view;
    }
    public  void disconnect(){
        binding.btnStart.setText("Start");
        binding.btnStart.setTextColor(Color.parseColor("#FFFFFF"));
        binding.tvNotConnected.setTextColor(Color.parseColor("#FFFFFF"));
        binding.tvTime.setVisibility(View.INVISIBLE);
        check=0;



    }
    public  void  connect(){

        binding.btnStart.setText("Stop");
        binding.btnStart.setTextColor(Color.parseColor("#db4e2d"));
        binding.tvNotConnected.setTextColor(Color.parseColor("#db4e2d"));
        binding.tvNotConnected.setText("Connected");
        binding.tvTime.setVisibility(View.VISIBLE);
        binding.ivdownload.setVisibility(View.VISIBLE);
        binding.ivupload.setVisibility(View.VISIBLE);
        binding.tvuploadspeed.setVisibility(View.VISIBLE);
        binding.tvUnlimitedSpeed.setVisibility(View.VISIBLE);
        binding.downloadParent.setVisibility(View.VISIBLE);
        binding.RlUpload.setVisibility(View.VISIBLE);
        binding.btnBrowser.setTextColor(Color.parseColor("#FFFFFF"));
        binding.tvUnlimitedSpeed.setTextColor(Color.parseColor("#FFFFFF"));
        check=1;
    }

}