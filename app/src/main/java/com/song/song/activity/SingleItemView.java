package com.song.song.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.song.song.R;

/**
 * Created by sarah on 26/01/16.
 */
public class SingleItemView extends Activity {

    TextView txtname;
    String name;
    TextView number;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from singleitemview.xml
        setContentView(R.layout.data_rowlist);

        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();

        // Get the name
        name = i.getStringExtra("name");

        // Locate the TextView in singleitemview.xml
        txtname = (TextView) findViewById(R.id.textViewName);

        // Load the text into the TextView
        txtname.setText(name);

        number = (TextView)findViewById(R.id.textViewNumber);


    }
}
