package com.song.song.appcontroller;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by sarah on 20/01/16.
 */
public class AppController extends Application {

    public  static final  String myAppId = "mguJKhzhaLLfwBR40DEQmmLERI4ZQzUKDU0b0yH0";
    public static final String YmyClientKey = "g48Vs9NLoje8nQccg010d2LK8oUHGGYX9B1qKoWu";

    @Override
    public void onCreate() {
        super.onCreate();

          Parse.enableLocalDatastore(this);
        Parse.initialize(this, "mguJKhzhaLLfwBR40DEQmmLERI4ZQzUKDU0b0yH0", "g48Vs9NLoje8nQccg010d2LK8oUHGGYX9B1qKoWu");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
