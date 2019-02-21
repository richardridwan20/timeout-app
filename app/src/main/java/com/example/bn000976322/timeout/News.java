package com.example.bn000976322.timeout;

public class News {

    int newsTitle;
    int newsUpload;
    int newsDescription;
    int newsImage;

    public News(int newsImage, int newsTitle, int newsUpload, int newsDescription) {
        this.newsImage = newsImage;
        this.newsTitle = newsTitle;
        this.newsUpload = newsUpload;
        this.newsDescription = newsDescription;
    }

    public int getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(int newsImage) {
        this.newsImage = newsImage;
    }

    public int getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(int newsTitle) {
        this.newsTitle = newsTitle;
    }

    public int getNewsUpload() {
        return newsUpload;
    }

    public void setNewsUpload(int newsUpload) {
        this.newsUpload = newsUpload;
    }

    public int getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(int newsDescription) {
        this.newsDescription = newsDescription;
    }
}


