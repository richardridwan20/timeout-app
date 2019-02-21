package com.example.bn000976322.timeout;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HighlightsRecycleAdapter extends RecyclerView.Adapter<HighlightsRecycleAdapter.HighlightsViewHolder> {

    private Context context;
    private ArrayList<Highlights> highlightsList;

    public ArrayList<Highlights> getHighlightsList() {
        return highlightsList;
    }

    public void setHighlightsList(ArrayList<Highlights> highlightsList) {
        this.highlightsList = highlightsList;
    }

    public HighlightsRecycleAdapter(Context context){
        this.context = context;
    }


    @NonNull
    @Override
    public HighlightsRecycleAdapter.HighlightsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.highlights_item, parent, false);

        return new HighlightsRecycleAdapter.HighlightsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HighlightsRecycleAdapter.HighlightsViewHolder highlightsViewHolder, int position) {
        highlightsViewHolder.highlightsTitle.setText(getHighlightsList().get(position).getHighlightsTitle());

        RequestOptions highlightsOption = new RequestOptions()
                .fitCenter()
                .override(500,500);

        Glide.with(context)
                .load(getHighlightsList().get(position).getHighlightsThumbnail())
                .apply(highlightsOption)
                .into(highlightsViewHolder.highlightsThumbnail);
    }

    @Override
    public int getItemCount() {
        return getHighlightsList().size();
    }

    public class HighlightsViewHolder extends RecyclerView.ViewHolder{

        ImageView highlightsThumbnail;
        TextView highlightsTitle;


        public HighlightsViewHolder(@NonNull View itemView) {
            super(itemView);
            highlightsThumbnail = itemView.findViewById(R.id.highlights_thumbnail);
            highlightsTitle = itemView.findViewById(R.id.highlights_title);
        }
    }
}
