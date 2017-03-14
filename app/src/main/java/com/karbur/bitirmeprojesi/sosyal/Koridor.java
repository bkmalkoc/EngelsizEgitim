package com.karbur.bitirmeprojesi.sosyal;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.memorygame.ButtonListener;

public class Koridor extends Activity {

    ImageView koridorResmi;
    ImageView wcButton, sinifButton;
    Intent gecis;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.koridor);

        wcButton = (ImageView) findViewById(R.id.wcButton);
        sinifButton = (ImageView) findViewById(R.id.sinifButton);
//        koridorResmi = (ImageView) findViewById(R.id.imageKoridor);

        wcButton.setOnClickListener(goToWC);
        sinifButton.setOnClickListener(goToSinif);
//        koridorResmi.setOnTouchListener(new OnTouchListener() {
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if ((380 < event.getRawX() && event.getRawX() < 600)
//                        && (200 < event.getRawY() && event.getRawY() < 630)) {
//
//                    gecis = new Intent(Koridor.this, Lavabo.class);
//                    startActivity(gecis);
//
//                } else if ((860 < event.getX() && event.getX() < 1080)
//                        && (200 < event.getY() && event.getY() < 630)) {
//                    gecis = new Intent(Koridor.this, Sinif.class);
//                    startActivity(gecis);
//                }
//
//                return false;
//            }
//        });
    }

    ImageView.OnClickListener goToWC = new ImageView.OnClickListener(){
        @Override
        public void onClick(View v) {
            gecis = new Intent(Koridor.this, Lavabo.class);
            startActivity(gecis);
        }
    };

    ImageView.OnClickListener goToSinif = new ImageView.OnClickListener(){
        @Override
        public void onClick(View v) {
            gecis = new Intent(Koridor.this, Sinif.class);
            startActivity(gecis);
        }
    };

}
