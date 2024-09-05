package com.example.cornerradiusimageview_viewpager;

import java.io.Serializable;

public class Img implements Serializable {

 String quotes;
 String writer;
 int images;

 int isFavorite;

    public Img(int isFavorite) {
        this.isFavorite = isFavorite;
    }

    public int getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(int isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Img() {
    }

    public Img(String quotes, String writer, int images) {
        this.quotes = quotes;
        this.writer = writer;
        this.images = images;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }


}
