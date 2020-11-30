package com.example.allanimationstesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button blink,bounce,fadein,fadeout,flip,move,squential,slidup,slidedown,together,zoomin,zoomout,rotation;
    TextView tblink,tbounce,tfadein,tfadeout,tflip,tmove,tsquential,tslidup,tslidedown,ttogether,tzoomin,tzoomout,trotation;
    Animation animrotation,animblink,animbounce,animfadein,animfadeout,animflip,animmove,animsquential,animslidup,animslidedown,animtogether,animzoomin,animzoomout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blink = findViewById(R.id.btn_blink);
        bounce = findViewById(R.id.btn_bonce);
        fadein = findViewById(R.id.btn_fadein);
        fadeout = findViewById(R.id.btn_fadeout);
        flip = findViewById(R.id.btn_flip);
        move = findViewById(R.id.btn_move);
        squential = findViewById(R.id.btn_sequential);
        slidedown = findViewById(R.id.btn_slidedown);
        slidup = findViewById(R.id.btn_slideUp);
        together = findViewById(R.id.btn_togather);
        zoomin = findViewById(R.id.btn_zoomin);
        zoomout = findViewById(R.id.btn_zoomout);
        rotation = findViewById(R.id.btn_rotation);

        trotation = findViewById(R.id.rotation);
        tblink = findViewById(R.id.blink);
        tbounce = findViewById(R.id.bounce);
        tfadein = findViewById(R.id.fadeoin);
        tfadeout = findViewById(R.id.fadeout);
        tflip = findViewById(R.id.flip);
        tmove = findViewById(R.id.move);
        tsquential = findViewById(R.id.sequential);
        tslidedown = findViewById(R.id.slidedown);
        tslidup = findViewById(R.id.slideup);
        ttogether = findViewById(R.id.together);
        tzoomin = findViewById(R.id.zoomin);
        tzoomout = findViewById(R.id.zoomout);
        //=============squential
        animsquential = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
        squential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tsquential.startAnimation(animsquential);
            }
        });
        //===============together
        animtogether = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.together);
        together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ttogether.startAnimation(animtogether);
            }
        });
        //========blink
        animblink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tblink.startAnimation(animblink);
            }
        });
        //=======bounce
        animbounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbounce.startAnimation(animbounce);
            }
        });
        //===============fade in
        animfadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tfadein.startAnimation(animfadein);
            }
        });
        //============ fade out
        animfadeout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { tfadeout.startAnimation(animsquential);}
        });
        //==============flip
        animflip = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.flip);
        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tflip.startAnimation(animflip);

            }
        });
        //===================move
        animmove = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmove.startAnimation(animmove);

            }
        });
        //===========slid up
        animslidup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        slidup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tslidup.startAnimation(animslidup);

            }
        });
        //==============slid down
        animslidedown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        slidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tslidedown.startAnimation(animslidedown);
            }
        });
        //==============zoom in
        animzoomin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tzoomin.startAnimation(animzoomin);
            }
        });
        //==========zoom out
        animzoomout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tzoomout.startAnimation(animzoomout);
            }
        });
//==========rotation
        animrotation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {trotation.startAnimation(animrotation);
            }
        });

    }
}