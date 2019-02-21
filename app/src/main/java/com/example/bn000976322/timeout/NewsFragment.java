package com.example.bn000976322.timeout;


import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment{

    RecyclerView rv_news;
    ArrayList<News> newsList;
    NewsRecycleAdapter newsRecycleAdapter;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        newsList = new ArrayList<>();
        insertData();
        rv_news = view.findViewById(R.id.rv_news);
        rv_news.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_news.setHasFixedSize(true);
        newsRecycleAdapter = new NewsRecycleAdapter(getContext(),newsList);
        rv_news.setAdapter(newsRecycleAdapter);

        ItemClickSupport.addTo(rv_news).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent i = new Intent(getContext(),DetailNewsActivity.class);
                i.putExtra("newsImage",newsList.get(position).getNewsImage());
                i.putExtra("newsTitle",newsList.get(position).getNewsTitle());
                i.putExtra("newsDesc",newsList.get(position).getNewsDescription());
                startActivity(i);
            }
        });

        return view;
    }

    public void insertData(){
        newsList.add(new News(R.drawable.news_1, R.string.news_title_one, R.string.upload_title_one, R.string.description_one));
        newsList.add(new News(R.drawable.news_2, R.string.news_title_two, R.string.upload_title_two, R.string.description_two));
        newsList.add(new News(R.drawable.news_3, R.string.news_title_three, R.string.upload_title_three, R.string.description_three));
        newsList.add(new News(R.drawable.news_4, R.string.news_title_four, R.string.upload_title_four, R.string.description_four));
        newsList.add(new News(R.drawable.news_5, R.string.news_title_five, R.string.upload_title_five, R.string.description_five));
    }


}
