package com.example.animation29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAlpha,imgScale,imgRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = findViewById(R.id.imageviewAlpha);
        imgScale = findViewById(R.id.imageviewScale);
        imgRotate = findViewById(R.id.imageviewRotate);

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
//        final Animation animationScale = AnimationUtils.loadAnimation(this,R.anim.anim_image_scale);
//
//        imgScale.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                v.startAnimation(animationScale);
//            }
//        });
        // 3 : lam thu animation cho clock
        // y < 50 : toa do nam tren va nguoc lai
        // x < 50 : toa do nam ben tay trai va nguoc lai
        final Animation animationScale = AnimationUtils.loadAnimation(this,R.anim.anim_image_rotate);

        imgRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationScale);
            }
        });
    }
}
