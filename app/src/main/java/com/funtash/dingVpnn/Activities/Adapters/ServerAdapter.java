package com.funtash.dingVpnn.Activities.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.funtash.dingVpnn.Activities.MainActivity;
import com.funtash.dingVpnn.Activities.Models.ServerModel;
import com.funtash.dingVpnn.Activities.Settings;
import com.funtash.dingVpnn.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ServerAdapter extends RecyclerView.Adapter<ServerAdapter.ViewHolder> {
    Context context;
    ArrayList<ServerModel> list;

    public ServerAdapter(Context context, ArrayList<ServerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ServerAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.servers_sample, parent, false);
        return new ServerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ServerAdapter.ViewHolder holder, int position) {
        ServerModel model=list.get(position);
        Glide.with(context).load(model.getFlagUrl()).into(holder.countryImage);
        holder.countryName.setText(model.getCountry());
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                context.startActivity(new Intent(context, MainActivity.class));

            }
        });


    }

    @Override
    public int getItemCount() {
        if(list.size()!=0)
        {
            return list.size();
        }
        return 0;
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView countryImage;
        TextView countryName;
        CheckBox checkBox;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            countryImage=itemView.findViewById(R.id.iv_country);
            countryName=itemView.findViewById(R.id.tvcountryName);
            checkBox=itemView.findViewById(R.id.iv_checked);
        }
    }
}
