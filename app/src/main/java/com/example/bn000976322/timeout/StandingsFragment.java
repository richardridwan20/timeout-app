package com.example.bn000976322.timeout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class StandingsFragment extends Fragment {

    ArrayList<Standings> standingsList;
    RecyclerView rvStandings;

    public StandingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//         Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_standings, container, false);

        rvStandings = view.findViewById(R.id.rv_standings);
        standingsList = new ArrayList<>();
        standingsList.addAll(TeamsData.getStandingsData());

        showRecyclerData();

        return view;
    }

    public void showRecyclerData(){
        rvStandings.setLayoutManager(new LinearLayoutManager(getContext()));
        StandingsRecycleAdapter standingsRecycleAdapter = new StandingsRecycleAdapter(getContext());
        standingsRecycleAdapter.setListTeams(standingsList);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        rvStandings.addItemDecoration(dividerItemDecoration);

        rvStandings.setAdapter(standingsRecycleAdapter);
        rvStandings.setHasFixedSize(true);
    }

}
