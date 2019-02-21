package com.example.bn000976322.timeout;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ScrollView;

public class DetailHistoryActivity extends AppCompatActivity {

    ScrollView mScrollView;
    Handler scrollHandler;
    Runnable scrolling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_history);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.history_toolbar);
        toolbar.setTitle("History");
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(true);
        }

        mScrollView = findViewById(R.id.mScrollView);
        scrollHandler = new Handler();

        scrolling = new Runnable() {
            @Override
            public void run() {
                mScrollView.smoothScrollBy(0,1);
                scrollHandler.postDelayed(this,25);
            }
        };

        scrolling.run();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
