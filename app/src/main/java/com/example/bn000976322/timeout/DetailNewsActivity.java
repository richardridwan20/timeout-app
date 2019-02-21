package com.example.bn000976322.timeout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import me.biubiubiu.justifytext.library.JustifyTextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class DetailNewsActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView detailTitle;
    TextView detailDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.detail_toolbar);
        toolbar.setTitle("News");
        setSupportActionBar(toolbar);


        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(true);
        }

        detailImage = findViewById(R.id.detail_image);
        detailDesc = findViewById(R.id.detail_description);
        detailTitle = findViewById(R.id.detail_title);

        Intent i = getIntent();
        int image = i.getIntExtra("newsImage",0);
        int title = i.getIntExtra("newsTitle",0);
        int desc = i.getIntExtra("newsDesc",0);

        detailImage.setImageResource(image);
        detailTitle.setText(title);
        detailDesc.setText(desc);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }
}
