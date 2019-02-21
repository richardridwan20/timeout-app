package com.example.bn000976322.timeout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class DetailTeamsActivity extends AppCompatActivity {

    ImageView iv_detail_logo;
    TextView tv_detail_team,tv_detail_founded,tv_detail_coach,tv_detail_stadium, tv_detail_history;
    CarouselView cv_teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_teams);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.detail_toolbar);

        Intent i = getIntent();

        final int [] teamsPhoto = {i.getIntExtra("teamsphotoone",0), i.getIntExtra("teamsphototwo",0),
                i.getIntExtra("teamsphotothree",0), i.getIntExtra("teamsphotofour",0), i.getIntExtra("teamsphotofive",0)};

        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(teamsPhoto[position]);
            }
        };

        iv_detail_logo = findViewById(R.id.iv_detail_logo);
        tv_detail_team = findViewById(R.id.tv_detail_team);
        tv_detail_founded = findViewById(R.id.tv_detail_founded);
        tv_detail_coach = findViewById(R.id.tv_detail_coach);
        tv_detail_stadium = findViewById(R.id.tv_detail_stadium);
        tv_detail_history = findViewById(R.id.tv_detail_history);
        cv_teams = findViewById(R.id.cv_teams);

        cv_teams.setPageCount(teamsPhoto.length);
        cv_teams.setImageListener(imageListener);


        iv_detail_logo.setImageResource(i.getIntExtra("teamlogo",0));
        tv_detail_team.setText(i.getIntExtra("teamname",0));
        tv_detail_founded.setText(i.getIntExtra("teamfounded",0));
        tv_detail_coach.setText(i.getIntExtra("teamcoach",0));
        tv_detail_stadium.setText(i.getIntExtra("teamstadium",0));
        tv_detail_history.setText(i.getIntExtra("teamshistory",0));

        toolbar.setTitle(i.getIntExtra("teamname",0));
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }
}
