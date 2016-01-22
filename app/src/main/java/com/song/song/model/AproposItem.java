package com.song.song.model;

import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by sarah on 19/01/16.
 */
public class AproposItem implements Serializable {

    TextView deMoi;

    public TextView getDeMoi() {
        return deMoi;
    }

    public void setDeMoi(TextView deMoi) {
        this.deMoi = deMoi;
    }

    @Override
    public String toString() {
        return "AproposItem{" +
                "deMoi=" + deMoi;
    }
}
