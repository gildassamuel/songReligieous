package com.song.song.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.song.song.R;
import com.song.song.model.Store;

import java.util.List;

/**
 * Created by sarah on 08/12/15.
 */
public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<Store> stores;

    public CustomPagerAdapter(Context mContext, List<Store> stores) {
        this.mContext = mContext;
        this.stores = stores;

    }

    @Override
    public int getCount() {
        return stores.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        Store store = stores.get(position);
        TextView lyricView;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.activity_song, collection, false);
        lyricView = (TextView)layout.findViewById(R.id.song1);
        lyricView.setText(store.getLyrics());

        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

}
