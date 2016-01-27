package com.song.song.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by sarah on 10/22/theme.
 */
public class SongBook implements Serializable,Parcelable {
    private String name;
    private int imageId;
    private int number;
    private String lyrics;

    public SongBook(String name, int number, int imageId, String lyrics) {
        this.name = name;
        this.imageId = imageId;
        this.number= number;
        this.lyrics=lyrics;
    }

    public SongBook(){

    }

    protected SongBook(Parcel in) {
        name = in.readString();
        imageId = in.readInt();
        number = in.readInt();
        lyrics = in.readString();
    }

    public static final Creator<SongBook> CREATOR = new Creator<SongBook>() {
        @Override
        public SongBook createFromParcel(Parcel in) {
            return new SongBook(in);
        }

        @Override
        public SongBook[] newArray(int size) {
            return new SongBook[size];
        }
    };

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SongBook{" +
                "name='" + name + '\'' +
                ", imageId=" + imageId +
                ", number=" + number +
                ", lyrics='" + lyrics + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(imageId);
        dest.writeInt(number);
        dest.writeString(lyrics);
    }
}
