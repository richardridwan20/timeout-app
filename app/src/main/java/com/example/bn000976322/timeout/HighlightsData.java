package com.example.bn000976322.timeout;

import java.util.ArrayList;

public class HighlightsData {


    public static int[][] highlightsData = new int[][]{
            {R.string.title_one, R.drawable.thumbnail_one, R.string.url_one, R.string.video_description_one},
            {R.string.title_two, R.drawable.thumbnail_two, R.string.url_two, R.string.video_description_two},
            {R.string.title_three, R.drawable.thumbnail_three, R.string.url_three, R.string.video_description_three},
            {R.string.title_four, R.drawable.thumbnail_four, R.string.url_four, R.string.video_description_four},
            {R.string.title_five, R.drawable.thumbnail_five, R.string.url_five, R.string.video_description_five}
    };

    public static ArrayList<Highlights> getHighlightsData(){

        Highlights highlights = null;
        ArrayList<Highlights> highlightsList = new ArrayList<>();
        for (int i = 0; i<highlightsData.length ;  i++){
            highlights = new Highlights();
            highlights.setHighlightsTitle(highlightsData[i][0]);
            highlights.setHighlightsThumbnail(highlightsData[i][1]);
            highlights.setHighlightsUrl(highlightsData[i][2]);
            highlights.setHighlightsDescription(highlightsData[i][3]);


            highlightsList.add(highlights);
        }

        return highlightsList;
    }

}
