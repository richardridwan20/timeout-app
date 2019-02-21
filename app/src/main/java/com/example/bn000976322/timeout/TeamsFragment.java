package com.example.bn000976322.timeout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeamsFragment extends Fragment {

    ArrayList<Teams> teamsList;
    RecyclerView rvTeams;



    public TeamsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//         Inflate the layout for this fragment

        View view  = inflater.inflate(R.layout.fragment_teams, container, false);

        rvTeams = view.findViewById(R.id.rv_teams);
        teamsList = new ArrayList<>();
        teamsList.addAll(TeamsData.getTeamsData());

        showRecyclerData();


        return view;
    }

    public void showRecyclerData(){
        rvTeams.setLayoutManager(new LinearLayoutManager(getContext()));
        TeamsRecyclerAdapter teamsRecyclerAdapter = new TeamsRecyclerAdapter(getContext());
        teamsRecyclerAdapter.setListTeams(teamsList);

        rvTeams.setAdapter(teamsRecyclerAdapter);
        rvTeams.setHasFixedSize(true);

        ItemClickSupport.addTo(rvTeams).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent i = new Intent(getContext(),DetailTeamsActivity.class);
                i.putExtra("teamlogo",teamsList.get(position).getTeamsImage());
                i.putExtra("teamname",teamsList.get(position).getTeamsName());
                i.putExtra("teamfounded",teamsList.get(position).getTeamsFoundedDate());
                i.putExtra("teamcoach",teamsList.get(position).getTeamsHeadCoach());
                i.putExtra("teamstadium",teamsList.get(position).getTeamsStadium());
                i.putExtra("teamshistory",teamsList.get(position).getTeamsHistory());
                i.putExtra("teamsphotoone",teamsList.get(position).getTeamsPhotoOne());
                i.putExtra("teamsphototwo",teamsList.get(position).getTeamsPhotoTwo());
                i.putExtra("teamsphotothree",teamsList.get(position).getTeamsPhotoThree());
                i.putExtra("teamsphotofour",teamsList.get(position).getTeamsPhotoFour());
                i.putExtra("teamsphotofive",teamsList.get(position).getTeamsPhotoFive());
                startActivity(i);
            }
        });
    }

}
