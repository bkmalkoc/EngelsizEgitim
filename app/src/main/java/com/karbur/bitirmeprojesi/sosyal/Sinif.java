package com.karbur.bitirmeprojesi.sosyal;

import java.util.Timer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;

public class Sinif extends Activity {

	AnimationDrawable myAnimationDrawable;
	ImageView sinif, resim1, myAnimation;

	RelativeLayout sorulist;
	TextView text1, text2,text3,text4;

	Animation anim;
	Timer timer;
	MediaPlayer mp;
	Depo depo;
	boolean ilkAnim = true;
	int deger = 0;
	int count = 0;
	Intent gecis;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sinif);

		depo = new Depo();
		timer = new Timer();

		anim = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);

		sinif = (ImageView) findViewById(R.id.imageSinif);
		resim1 = (ImageView) findViewById(R.id.resim1);

		sorulist = (RelativeLayout) findViewById(R.id.soruliste);
		text1 = (TextView) findViewById(R.id.sestext);
		text2 = (TextView) findViewById(R.id.sestext2);
		text3 = (TextView) findViewById(R.id.sestext3);
		text4 = (TextView) findViewById(R.id.sestext4);

		myAnimation = (ImageView) findViewById(R.id.imageAnimasyon);

		if (ilkAnim == true) {
			myAnimation.setVisibility(View.VISIBLE);
			depo.animasyon(myAnimation,780, 1, 30, 40);
		}

		sinif.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				int x = (int) event.getX();
				int y = (int) event.getY();
				

				if ((757 < event.getX() && event.getX() < 875)
						&& (11 < event.getY() && event.getY() < 135)) {

					myAnimation.setVisibility(View.INVISIBLE);
					sinif.setEnabled(false);
					// sinif.setVisibility(View.INVISIBLE);
					sorulist.setVisibility(View.VISIBLE);
					text1.setOnClickListener(dinle);
					text2.setOnClickListener(dinle);
					text3.setOnClickListener(dinle);
					text4.setOnClickListener(dinle);
				}
				return false;
			}
		});
	}

	OnClickListener dinle = new OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.sestext:
				Depo.sesleriAlSayi(Sinif.this, 22);
				break;
			case R.id.sestext2:
				Depo.sesleriAlSayi(Sinif.this, 21);
				break;
				
			case R.id.sestext4:
				Depo.sesleriAlSayi(Sinif.this, 23);
				break;
				
			case R.id.sestext3:
				Depo.sesleriAlSayi(Sinif.this, 24);
				break;

			default:
				break;
			}
		}
	};
}
