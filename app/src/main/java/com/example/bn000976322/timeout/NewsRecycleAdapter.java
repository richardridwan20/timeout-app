package com.example.bn000976322.timeout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class NewsRecycleAdapter extends RecyclerView.Adapter<NewsRecycleAdapter.NewsViewHolder> {

    Context context;
    ArrayList<News> newsList;

    public NewsRecycleAdapter(Context context, ArrayList<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsRecycleAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View newsView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_item,viewGroup,false);
        return new NewsRecycleAdapter.NewsViewHolder(newsView);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {

        newsViewHolder.newsTitle.setText(newsList.get(i).getNewsTitle());
        newsViewHolder.newsUpload.setText(newsList.get(i).getNewsUpload());

        RequestOptions newsImageSize = new RequestOptions()
                .fitCenter()
                .override(500,500);


        Glide.with(context)
                .load(newsList.get(i).getNewsImage())
                .apply(newsImageSize)
                .into(newsViewHolder.newsImg);

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView newsImg;
        TextView newsTitle,newsUpload;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            newsImg = itemView.findViewById(R.id.news_img);
            newsTitle = itemView.findViewById(R.id.news_title);
            newsUpload = itemView.findViewById(R.id.news_upload);
        }
    }
}
