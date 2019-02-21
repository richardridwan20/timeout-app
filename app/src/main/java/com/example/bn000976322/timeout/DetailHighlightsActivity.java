package com.example.bn000976322.timeout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

public class DetailHighlightsActivity extends AppCompatActivity implements YouTubePlayer.OnInitializedListener{

    private final String API_KEY = "AIzaSyBWj9YSa0tMHuGjr-czFFNHkL-XLzOiyZo";

    TextView highlightsURL, highlightsTitle, highlightsDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_highlights);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.highlights_toolbar);
        toolbar.setTitle("Highlights");
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(true);
        }

        highlightsURL = findViewById(R.id.highlights_url);
        highlightsTitle = findViewById(R.id.highlights_title);
        highlightsDescription = findViewById(R.id.highlights_description);

        YouTubePlayerFragment youTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager().findFragmentById(R.id.youtube_fragment);
        youTubePlayerFragment.initialize(API_KEY, this);
        youTubePlayerFragment.setRetainInstance(true);

        Intent i = getIntent();
        int url = i.getIntExtra("highlightsurl", 0 );
        int title = i.getIntExtra("highlightstitle", 0 );
        int desc = i.getIntExtra("highlightsdesc", 0 );

        highlightsURL.setText(url);
        highlightsTitle.setText(title);
        highlightsDescription.setText(desc);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b){
            youTubePlayer.loadVideo(highlightsURL.getText().toString());
            youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(DetailHighlightsActivity.this, youTubeInitializationResult.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

}

