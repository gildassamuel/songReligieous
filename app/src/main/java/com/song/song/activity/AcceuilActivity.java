package com.song.song.activity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.song.song.R;

public class AcceuilActivity extends AppCompatActivity {


   ImageView imageId;
   TextView title;
   TextView passage;
   TextView edition;
   Button btnEntrez;
   Button btnQuittez;
   Button btnAPropos;
   private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        edition =(TextView)findViewById(R.id.textView5);

        imageId = (ImageView) findViewById(R.id.imageView2);
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);
        imageId.startAnimation(hyperspaceJumpAnimation);

        title = (TextView) findViewById(R.id.textView);

        passage = (TextView) findViewById(R.id.textView3);
        Animation animationTranslateIn = AnimationUtils.loadAnimation(this, R.anim.slide);
        passage.startAnimation(animationTranslateIn);

        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.anim.text_view);
        set.setTarget(title);
        set.start();

        btnEntrez = (Button) findViewById(R.id.button1);
        btnQuittez = (Button) findViewById(R.id.button2);
        btnAPropos = (Button) findViewById(R.id.button3);

        context = this;

        btnAPropos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context, AproposActivity.class);
                context.startActivity(intent1);
            }
        });

        btnEntrez.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Soyez béni", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);

            }

        });



        btnQuittez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Toast.makeText(getApplicationContext(), "Soyez béni", Toast.LENGTH_LONG).show();
                {
                    Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                    homeIntent.addCategory(Intent.CATEGORY_HOME);
                    homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(homeIntent);

                }
            }

        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_acceuil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
