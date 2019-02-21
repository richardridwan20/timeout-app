package com.example.bn000976322.timeout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HighlightsFragment extends Fragment {

    ArrayList<Highlights> highlightsList;
    RecyclerView rvHighlights;

    public HighlightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View highlightsView = inflater.inflate(R.layout.fragment_highlights, container, false);

        rvHighlights = highlightsView.findViewById(R.id.rv_highlights);
        highlightsList = new ArrayList<>();
        highlightsList.addAll(HighlightsData.getHighlightsData());


        showRecyclerData();

        ItemClickSupport.addTo(rvHighlights).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent i = new Intent(getContext(),DetailHighlightsActivity.class);
                i.putExtra("highlightsthumbnail",highlightsList.get(position).getHighlightsThumbnail());
                i.putExtra("highlightstitle",highlightsList.get(position).getHighlightsTitle());
                i.putExtra("highlightsurl",highlightsList.get(position).getHighlightsUrl());
                i.putExtra("highlightsdesc",highlightsList.get(position).getHighlightsDescription());
                startActivity(i);
            }
        });

        return highlightsView;
    }

    public void showRecyclerData(){

        rvHighlights.setLayoutManager(new LinearLayoutManager(getContext()));
        HighlightsRecycleAdapter highlightsRecycleAdapter = new HighlightsRecycleAdapter(getContext());
        highlightsRecycleAdapter.setHighlightsList(highlightsList);

        rvHighlights.setAdapter(highlightsRecycleAdapter);
        rvHighlights.setHasFixedSize(true);
    }

}
