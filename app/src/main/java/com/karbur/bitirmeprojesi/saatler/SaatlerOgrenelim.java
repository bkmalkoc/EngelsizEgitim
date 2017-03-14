package com.karbur.bitirmeprojesi.saatler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.EgitselAnaEkran;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.SaatlerAnaEkran;

public class SaatlerOgrenelim extends Activity {

    ImageView clock;
    ImageView hour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saatlergoster);

        Button saat_1 = (Button) findViewById(R.id.btnSesHarf);
        Button saat_2 = (Button) findViewById(R.id.btnsaat1);
        Button saat_3 = (Button) findViewById(R.id.btnsaat2);
        Button saat_4 = (Button) findViewById(R.id.btnsaat3);
        Button saat_5 = (Button) findViewById(R.id.btnsaat4);
        Button saat_6 = (Button) findViewById(R.id.button6);
        Button saat_7 = (Button) findViewById(R.id.button7);
        Button saat_8 = (Button) findViewById(R.id.button8);
        Button saat_9 = (Button) findViewById(R.id.button9);
        Button saat_10 = (Button) findViewById(R.id.button10);
        Button saat_11 = (Button) findViewById(R.id.button11);
        Button saat_12 = (Button) findViewById(R.id.button12);
        Button saatGeri = (Button) findViewById(R.id.btnSaatGeri);

        clock = (ImageView) findViewById(R.id.clock_hand);
        hour = (ImageView) findViewById(R.id.hour_hand);


        saatGeri.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intentNesnesi2 = new Intent(
                        SaatlerOgrenelim.this,
                        SaatlerAnaEkran.class);
                startActivity(intentNesnesi2);
            }
        });


        saat_1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(1);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 1);
            }
        });

        saat_2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(2);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 2);
            }
        });

        saat_3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(3);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 3);
            }
        });

        saat_4.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(4);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 4);
            }
        });

        saat_5.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(5);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 5);
            }
        });

        saat_6.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(6);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 6);
            }
        });

        saat_7.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(7);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 7);
            }
        });

        saat_8.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(8);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 8);
            }
        });

        saat_9.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(9);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 9);
            }
        });

        saat_10.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(10);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 10);
            }
        });

        saat_11.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(11);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 11);
            }
        });

        saat_12.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                clockCevir();
                hourCevir(12);
                Depo.sesleriAlSayi(SaatlerOgrenelim.this, 12);
            }
        });
    }

    public void clockCevir() {
        Animation clockTurn = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                R.anim.clock_turn_full);
        clock.startAnimation(clockTurn);
    }

    public void hourCevir(int a) {
        switch (a) {
            case 1:
                Animation hourTurn = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_1);
                hour.startAnimation(hourTurn);
                break;
            case 2:
                Animation hourTurn2 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_2);
                hour.startAnimation(hourTurn2);
                break;
            case 3:
                Animation hourTurn3 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_3);
                hour.startAnimation(hourTurn3);
                break;
            case 4:
                Animation hourTurn4 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_4);
                hour.startAnimation(hourTurn4);
                break;
            case 5:
                Animation hourTurn5 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_5);
                hour.startAnimation(hourTurn5);
                break;
            case 6:
                Animation hourTurn6 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_6);
                hour.startAnimation(hourTurn6);
                break;
            case 7:
                Animation hourTurn7 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_7);
                hour.startAnimation(hourTurn7);
                break;
            case 8:
                Animation hourTurn8 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_8);
                hour.startAnimation(hourTurn8);
                break;
            case 9:
                Animation hourTurn9 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_9);
                hour.startAnimation(hourTurn9);
                break;
            case 10:
                Animation hourTurn10 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_10);
                hour.startAnimation(hourTurn10);
                break;
            case 11:
                Animation hourTurn11 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_11);
                hour.startAnimation(hourTurn11);
                break;
            case 12:
                Animation hourTurn12 = AnimationUtils.loadAnimation(SaatlerOgrenelim.this,
                        R.anim.hour_turn_12);
                hour.startAnimation(hourTurn12);
                break;
            default:
                break;
        }
    }
}
