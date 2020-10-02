package com.kalpeshrajpurohit.carpooling;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN=5000;

    //variables for animations
    Animation topanim,bottomanim;
    ImageView image;
    TextView logo,srimca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //animations
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        //hooks
        image =findViewById(R.id.image);
        logo =findViewById(R.id.logo);
        srimca =findViewById(R.id.srimca);

        image.setAnimation(topanim);
        logo.setAnimation(bottomanim);
        srimca.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Loginactivity.class);
                Pair[] pairs =new Pair[2];
                pairs[0] = new Pair<View,String>(image,"image");
                pairs[1] = new Pair<View,String>(logo,"logo");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent,options.toBundle());
                }


            }
        },SPLASH_SCREEN);



    }
}