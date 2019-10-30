package com.example.animation29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAlpha,imgScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = findViewById(R.id.imageviewAlpha);
        imgScale = findViewById(R.id.imageviewScale);

        // 1 - alpha cho chuyen man hinh : intent
//        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_image_alpha);
//
//        imgAlpha.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                v.startAnimation(animation);
//
//            }
//        });

        // x < 50 => chay sang tay phai va nguoc lai
        // y < 50 => chay xuong duoi va nguoc lai
        final Animation animationScale = AnimationUtils.loadAnimation(this,R.anim.anim_image_scale);

        imgScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationScale);
            }
        });
    }
}
