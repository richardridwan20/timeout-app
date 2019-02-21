package com.example.bn000976322.timeout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {

    Button btnRecruit;

    public MoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View moreView = inflater.inflate(R.layout.fragment_more, container, false);

        btnRecruit = moreView.findViewById(R.id.btn_recruit);

        btnRecruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String shareText = "Download now. http://bit.ly/timeout-application";
                i.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(i, "Recruit using :"));
            }
        });

        return moreView ;
    }
}
