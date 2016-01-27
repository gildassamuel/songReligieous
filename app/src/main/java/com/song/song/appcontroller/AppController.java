package com.song.song.appcontroller;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.SaveCallback;

/**
 * Created by sarah on 20/01/16.
 */
public class AppController extends Application {

    public  static final  String myAppId = "nOgla9ueJWiW1oxj4j2B9lge0720SQUbjf6lnIxs";
    public static final String YmyClientKey = "tLvANaMwKYCK9I6mJGWnfIUjave3YpRhSrD6sUlL";
    private Context context;
    private static AppController mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        Parse.enableLocalDatastore(context);
        Parse.initialize(context, "nOgla9ueJWiW1oxj4j2B9lge0720SQUbjf6lnIxs", "tLvANaMwKYCK9I6mJGWnfIUjave3YpRhSrD6sUlL");
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.saveInBackground();
        ParsePush.subscribeInBackground("", new SaveCallback() {

            @Override
            public void done(com.parse.ParseException arg0) {
                // TODO Auto-generated method stub
                if (arg0 == null) {
                    Log.d("com.parse.push", "successfully    subscribed to the broadcast channel.");
                } else {
                    Log.e("com.parse.push", "failed to subscribe for push", arg0);
                }
            }
        });

        ParseObject songbook = new ParseObject("Songbook");

    }
}
