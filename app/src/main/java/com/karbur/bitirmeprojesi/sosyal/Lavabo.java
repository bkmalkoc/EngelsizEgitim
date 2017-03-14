package com.karbur.bitirmeprojesi.sosyal;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;

public class Lavabo extends Activity {

	AnimationDrawable myAnimationDrawable;
	ImageView wc, resim1, resim2, myAnimation;
	Animation anim;
	Timer timer;
	MediaPlayer mp;
	Depo depo;
	boolean ilkAnim = true;
	int deger = 0;
	Intent gecis;

	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.lavabo);

		depo = new Depo();
		timer = new Timer();

		anim = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);

		wc = (ImageView) findViewById(R.id.imageWc);
		resim1 = (ImageView) findViewById(R.id.resim1);
		resim2 = (ImageView) findViewById(R.id.resim2);
		myAnimation = (ImageView) findViewById(R.id.imageAnimasyon);


		if (ilkAnim == true) {
			myAnimation.setVisibility(View.VISIBLE);
			depo.animasyon(myAnimation, 220, 180, 30, 40);
		}

		wc.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if ((140 < event.getRawX() && event.getRawX() < 300)
						&& (270 < event.getRawY() && event.getRawY() < 550)
						&& deger == 0) {

					myAnimation.setVisibility(View.INVISIBLE);
					resim1.setImageResource(R.drawable.sifonbas);
					resim1.setVisibility(View.VISIBLE);
					wc.setEnabled(false);
					resim1.startAnimation(anim);
					resim2.setImageResource(R.drawable.tuvaletsuakit);
					beklet(resim1, resim2);
					wc.setVisibility(View.INVISIBLE);
					depo.animasyon(myAnimation, 525, 90, 30, 40);
					deger = 1;
				}

				if ((500 < event.getRawX() && event.getRawX() < 590)
						&& (150 < event.getRawY() && event.getRawY() < 245)
						&& deger == 1) {
					myAnimation.setVisibility(View.INVISIBLE);
					wc.setVisibility(View.INVISIBLE);
					wc.setEnabled(false);
					resim1.setImageResource(R.drawable.elyikama2);
					resim1.setVisibility(View.VISIBLE);
					resim1.startAnimation(anim);
					resim2.setImageResource(R.drawable.elyikama5);
					beklet(resim1, resim2);
					depo.animasyon(myAnimation, 700, 100, 30, 40);
					deger = 2;
				}

				if ((675 < event.getRawX()&& event.getRawX() < 760)
						&& (175 < event.getRawY() && event.getRawY()< 280)
						&& deger == 2) {
					myAnimation.setVisibility(View.INVISIBLE);
					wc.setVisibility(View.INVISIBLE);
					wc.setEnabled(false);
					resim1.setImageResource(R.drawable.elkurula);
					resim1.setVisibility(View.VISIBLE);
					resim1.startAnimation(anim);
					resim2.setImageResource(R.drawable.havlucop);
					beklet(resim1, resim2);
					deger = 3;
				}
				return false;
			}
		});

	}

	// --------------------------------------------------------------------------------------

	public void beklet(final ImageView resim1, final ImageView resim2) {

		timer.schedule(new TimerTask() {

			@Override
			public void run() {

				runOnUiThread(new Runnable() {

					@Override
					public void run() {

						resim1.setVisibility(View.INVISIBLE);
						resim2.setVisibility(View.VISIBLE);
						resim2.startAnimation(anim);
						beklet2(resim2, wc);
					}
				});
			}
		}, 3000);

	}

	public void beklet2(final ImageView resim1, final ImageView resim2) {

		timer.schedule(new TimerTask() {

			@Override
			public void run() {

				runOnUiThread(new Runnable() {

					@Override
					public void run() {

						if (deger != 3) {
							resim1.setVisibility(View.INVISIBLE);
							resim2.setVisibility(View.VISIBLE);
							resim2.setEnabled(true);
							myAnimation.setVisibility(View.VISIBLE);


						} else {
							gecis = new Intent(Lavabo.this, Koridor.class);
							startActivity(gecis);
						}


					}
				});
			}
		}, 3000);

	}

}
