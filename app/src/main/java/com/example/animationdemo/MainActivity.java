package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    View img;
    AnimationDrawable frameAnimation;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        img = findViewById(R.id.imageView);
/*        img.setBackgroundResource(R.drawable.animation_list);

        frameAnimation = (AnimationDrawable) img.getBackground();

       frameAnimation.start();
        //frameAnimation.stop();
*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.myanimation);
                img.startAnimation(animation);
            }
        });

    }
}