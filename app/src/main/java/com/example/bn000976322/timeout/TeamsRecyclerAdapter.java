package com.example.bn000976322.timeout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class TeamsRecyclerAdapter extends RecyclerView.Adapter<TeamsRecyclerAdapter.TeamsViewHolder> {
    private Context context;
    private ArrayList<Teams> listTeams;

    public ArrayList<Teams> getListTeams() {
        return listTeams;
    }

    public void setListTeams(ArrayList<Teams> listTeams) {
        this.listTeams = listTeams;
    }

    public TeamsRecyclerAdapter(Context context){
        this.context = context;
    }


    @NonNull
    @Override
    public TeamsRecyclerAdapter.TeamsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.teams_item, parent, false);

        return new TeamsRecyclerAdapter.TeamsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamsRecyclerAdapter.TeamsViewHolder teamsViewholder, int position) {

        teamsViewholder.tvName.setText(getListTeams().get(position).getTeamsName());

        RequestOptions teamsOption = new RequestOptions()
                .fitCenter()
                .override(100,100);

        Glide.with(context)
                .load(getListTeams().get(position).getTeamsImage())
                .apply(teamsOption)
                .into(teamsViewholder.imgTeams);
    }

    @Override
    public int getItemCount() {
        return getListTeams().size();
    }

    public class TeamsViewHolder extends RecyclerView.ViewHolder{

        ImageView imgTeams;
        TextView tvName;

        public TeamsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgTeams = itemView.findViewById(R.id.img_teams);
            tvName  = itemView.findViewById(R.id.tv_teams);
        }
    }
}
