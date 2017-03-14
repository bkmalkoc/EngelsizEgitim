//package com.karbur.bitirmeprojesi.sosyal;
//
//import java.util.Timer;
//import java.util.TimerTask;
//
//import android.os.Bundle;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.View.OnTouchListener;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//import android.widget.RelativeLayout;
//import android.widget.Toast;
//import android.widget.ToggleButton;
//
//import com.google.android.youtube.player.YouTubeBaseActivity;
//import com.google.android.youtube.player.YouTubeInitializationResult;
//import com.google.android.youtube.player.YouTubePlayer;
//import com.google.android.youtube.player.YouTubePlayer.Provider;
//import com.google.android.youtube.player.YouTubePlayerView;
//import com.karbur.bitirmeprojesi.Depo;
//import com.karbur.bitirmeprojesi.R;
//
//public class Sokak extends YouTubeBaseActivity implements
//YouTubePlayer.OnInitializedListener {
//
//	RelativeLayout lySokak;
//	ImageView genel, sag, sol, sonuc, animasyon;
//	Animation anim;
//	Timer timer;
//	Depo depo;
//	int sayac = 0, count = 0;
//	YouTubePlayerView yvideo;
//	static private final String VIDEO = "MvumCeg8jBA";
//	ToggleButton tgglSokak;
//	int kontrol=0;
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.sokak);
//
//		depo = new Depo();
//		timer = new Timer();
//		tgglSokak=(ToggleButton) findViewById(R.id.tggleBtnSokak);
//		yvideo=(YouTubePlayerView) findViewById(R.id.youtube_sokak);
//		genel = (ImageView) findViewById(R.id.caddeGenel);
//		sag = (ImageView) findViewById(R.id.caddeSag);
//		sol = (ImageView) findViewById(R.id.CaddeSol);
//		sonuc = (ImageView) findViewById(R.id.onay);
//		animasyon = (ImageView) findViewById(R.id.anim);
//		lySokak=(RelativeLayout) findViewById(R.id.lySokak);
//
//		anim = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
//
//		animasyon.setVisibility(View.VISIBLE);
//		depo.animasyon(animasyon, 630,320, 230, 240);
//		genel.setEnabled(true);
//
//		tgglSokak.setOnClickListener(dinle);
//
//		genel.setOnTouchListener(new OnTouchListener() {
//
//			@Override
//			public boolean onTouch(View v, MotionEvent event) {
//
//
//
//				if ((625 < event.getRawX() && event.getRawX() < 685)
//						&& (370< event.getRawY() && event.getRawY() < 450)) {
//
//
//
//					animasyon.setVisibility(View.INVISIBLE);
//					sol.setImageResource(R.drawable.caddesol);
//					sol.setVisibility(View.VISIBLE);
//					Depo.sesleriAlSayi(Sokak.this, 35);
//					genel.setEnabled(false);
//					sol.startAnimation(anim);
//					sag.setImageResource(R.drawable.caddesaggecme);
//					beklet(sol, sag);
//					tgglSokak.setVisibility(View.INVISIBLE);
//					genel.setVisibility(View.INVISIBLE);
//
//				}
//				return false;
//			}
//		});
//
//	}
//
//	public void beklet(final ImageView resim1, final ImageView resim2) {
//
//		timer.schedule(new TimerTask() {
//
//			@Override
//			public void run() {
//
//				runOnUiThread(new Runnable() {
//
//					@Override
//					public void run() {
//
//						resim1.setVisibility(View.INVISIBLE);
//						resim2.setVisibility(View.VISIBLE);
//						resim2.startAnimation(anim);
//
//						if (sayac == 0) {
//							Depo.sesleriAlSayi(Sokak.this, 36);
//							animasyon.setVisibility(View.VISIBLE);
//							depo.animasyon(animasyon, 750, 240, 230, 240);
//							sonuc.setImageResource(R.drawable.gecme);
//							beklet2(resim2, sonuc);
//							tgglSokak.setVisibility(View.INVISIBLE);
//							sayac =1;
//						} else {
//							animasyon.setVisibility(View.INVISIBLE);
//							sol.setImageResource(R.drawable.caddesol);
//							tgglSokak.setVisibility(View.INVISIBLE);
//							beklet2(resim2, sol);
//						}
//
//					}
//
//				});
//			}
//		}, 3000);
//
//	}
//
//	private void beklet2(final ImageView resim1, final ImageView resim2) {
//		timer.schedule(new TimerTask() {
//
//			@Override
//			public void run() {
//
//				runOnUiThread(new Runnable() {
//
//					@Override
//					public void run() {
//
//						if(kontrol==0){
//							Depo.sesleriAlSayi(Sokak.this, 37);
//							kontrol=1;
//						}
//
//						resim1.setVisibility(View.INVISIBLE);
//						resim2.setVisibility(View.VISIBLE);
//						resim2.startAnimation(anim);
//						animasyon.setVisibility(View.INVISIBLE);
//						secimler(resim2);
//						tgglSokak.setVisibility(View.INVISIBLE);
//					}
//
//				});
//			}
//		}, 3000);
//
//	}
//
//	public void secimler(final ImageView resim1) {
//
//		timer.schedule(new TimerTask() {
//
//			@Override
//			public void run() {
//
//				runOnUiThread(new Runnable() {
//
//					@Override
//					public void run() {
//
//						if (count == 0) {
//							resim1.setVisibility(View.INVISIBLE);
//							genel.setImageResource(R.drawable.caddgec);
//							genel.setVisibility(View.VISIBLE);
//							genel.setEnabled(true);
//							tgglSokak.setVisibility(View.VISIBLE);
//							animasyon.setVisibility(View.VISIBLE);
//							depo.animasyon(animasyon, 630, 320, 230, 240);
//
//							genel.setOnTouchListener(dinleyici);
//							count = 1;
//						} else {
//							resim1.setVisibility(View.INVISIBLE);
//							sonuc.setImageResource(R.drawable.gec);
//							sonuc.setVisibility(View.VISIBLE);
//
//							genel.setEnabled(false);
//
//						}
//
//					}
//
//				});
//			}
//		}, 3000);
//
//	}
//
//	OnTouchListener dinleyici = new OnTouchListener() {
//
//		@Override
//		public boolean onTouch(View v, MotionEvent event) {
//
//			if ((625 < event.getRawX() && event.getRawX() < 685)
//					&& (370< event.getRawY() && event.getRawY() < 450)) {
//
//				animasyon.setVisibility(View.INVISIBLE);
//				sol.setImageResource(R.drawable.caddesol);
//				Depo.sesleriAlSayi(Sokak.this, 38);
//				sol.setVisibility(View.VISIBLE);
//				genel.setEnabled(false);
//				sol.startAnimation(anim);
//				tgglSokak.setVisibility(View.INVISIBLE);
//				sag.setImageResource(R.drawable.caddesaggec);
//				beklet(sol, sag);
//				genel.setVisibility(View.INVISIBLE);
//			}
//
//			return false;
//		}
//	};
//
//	@Override
//	public void onInitializationFailure(Provider arg0,
//			YouTubeInitializationResult arg1) {
//		Toast.makeText(this, "Ba�lant� Hatas�! " + arg1.toString(), Toast.LENGTH_LONG)
//		.show();
//
//
//	}
//
//	@Override
//	public void onInitializationSuccess(Provider arg0, YouTubePlayer arg1,
//			boolean arg2) {
//		arg1.loadVideo(VIDEO);
//
//	}
//
//	OnClickListener dinle = new OnClickListener() {
//
//		@Override
//		public void onClick(View v) {
//			if (tgglSokak.isChecked()) {
//
//				yvideo.setVisibility(View.VISIBLE);
//				yvideo.initialize("AIzaSyCakmpjva1KgAJVURAo4d_h24qINJgA7d8", Sokak.this);
//				tgglSokak.setBackgroundResource(R.drawable.videopause);
//				genel.setVisibility(View.INVISIBLE);
//				genel.setEnabled(false);
//				lySokak.setBackgroundResource(R.drawable.videoarka);
//
//			} else {
//
//				yvideo.setVisibility(View.INVISIBLE);
//				tgglSokak.setBackgroundResource(R.drawable.videoplay);
//				genel.setVisibility(View.VISIBLE);
//				genel.setEnabled(true);
//			}
//
//		}
//	};
//
//}
