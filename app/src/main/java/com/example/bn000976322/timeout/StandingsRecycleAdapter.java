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

public class StandingsRecycleAdapter extends RecyclerView.Adapter<StandingsRecycleAdapter.StandingsViewHolder>{

    private Context context;
    private ArrayList<Standings> listStandings;

    public ArrayList<Standings> getListStandings() {
        return listStandings;
    }

    public void setListTeams(ArrayList<Standings> listStandings) {
        this.listStandings = listStandings;
    }

    public StandingsRecycleAdapter(Context context){
        this.context = context;
    }


    @NonNull
    @Override
    public StandingsRecycleAdapter.StandingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.standings_item, parent, false);

        return new StandingsRecycleAdapter.StandingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StandingsRecycleAdapter.StandingsViewHolder standingsViewHolder, int position) {
        standingsViewHolder.tvStandingsRank.setText(getListStandings().get(position).getTeamRank());
        standingsViewHolder.tvStandingsName.setText(getListStandings().get(position).getTeamName());
        standingsViewHolder.tvStandingsWin.setText(getListStandings().get(position).getTeamWin());
        standingsViewHolder.tvStandingsLoss.setText(getListStandings().get(position).getTeamLoss());

        RequestOptions standingsOption = new RequestOptions()
                .fitCenter()
                .override(30,30);

        Glide.with(context)
                .load(getListStandings().get(position).getTeamLogo())
                .apply(standingsOption)
                .into(standingsViewHolder.tvStandingsImage);
    }

    @Override
    public int getItemCount() {
        return getListStandings().size();
    }

    public class StandingsViewHolder extends RecyclerView.ViewHolder{

        ImageView tvStandingsImage;
        TextView tvStandingsRank, tvStandingsName, tvStandingsWin, tvStandingsLoss;

        public StandingsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStandingsImage = itemView.findViewById(R.id.iv_standings_logo);
            tvStandingsName = itemView.findViewById(R.id.tv_standings_name);
            tvStandingsRank = itemView.findViewById(R.id.tv_standings_rank);
            tvStandingsWin = itemView.findViewById(R.id.tv_standings_win);
            tvStandingsLoss = itemView.findViewById(R.id.tv_standings_loss);
        }
    }
}
