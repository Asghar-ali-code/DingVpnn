package com.funtash.dingVpnn.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.funtash.dingVpnn.Activities.Adapters.ServerAdapter;
import com.funtash.dingVpnn.Activities.Models.ServerModel;
import com.funtash.dingVpnn.R;
import com.funtash.dingVpnn.databinding.ActivityServerBinding;

import java.util.ArrayList;

public class Server extends AppCompatActivity {
    ActivityServerBinding binding;
    ServerAdapter adapter;
    ServerModel model;
    ArrayList<ServerModel> list=new ArrayList<>();
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityServerBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        layoutManager=new LinearLayoutManager(this);
        binding.serverRecycler.setLayoutManager(layoutManager);
       model=new ServerModel();
       list.add(new ServerModel("","Uganda","6%"));
       list.add(new ServerModel("","pakistan","7%"));
       adapter=new ServerAdapter(this,list);
       binding.serverRecycler.setAdapter(adapter);
       adapter.notifyDataSetChanged();


    }
}