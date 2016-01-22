package com.song.song.model;

import java.io.Serializable;

/**
 * Created by sarah on 14/01/16.
 */
public class AcceuilItem implements Serializable {

    private int imageId;
    private String title;
    private String text;
    private  String passage;

    public AcceuilItem(int imageId, String title, String text, String passage){

        this.imageId = imageId;
        this.passage = passage;
        this.text = text;
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPassage() {
        return passage;
    }

    public void setPassage(String passage) {
        this.passage = passage;
    }

    @Override
    public String toString() {
        return "AcceuilItem{" +
                "imageId=" + imageId +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", passage='" + passage + '\'' +
                '}';
    }
}
