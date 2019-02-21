package com.example.bn000976322.timeout;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {

    ImageView playButton;

    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View historyView = inflater.inflate(R.layout.fragment_history, container, false);
        playButton = historyView.findViewById(R.id.playImage);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),DetailHistoryActivity.class);
                startActivity(i);
            }
        });

        return historyView;

    }
}
