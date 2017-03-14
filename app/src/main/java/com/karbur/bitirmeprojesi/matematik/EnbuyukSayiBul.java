package com.karbur.bitirmeprojesi.matematik;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.MatematikKategorileri;

public class EnbuyukSayiBul extends Activity {

	ViewFlipper vf;
	int dizi[] = new int[4];
	Button btnMatematik, btnsiralamasayi1, btnsiralamasayi2, btnsiralamasayi3,
			btnsiralamasayi4, btnSayilarEkraniGeri;
	Random sayi1;
	MediaPlayer mpTrue, mpWrong;
	ImageView im1,im2,im3,im4,im5,im6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.siralama);
		
// -----------------------------------------------------------------------------
		
		btnSayilarEkraniGeri = (Button) findViewById(R.id.btnSiralmaGeri);
		im1=(ImageView) findViewById(R.id.sayi1);
		im2=(ImageView) findViewById(R.id.sayi2);
		im3=(ImageView) findViewById(R.id.sayi3);
		im4=(ImageView) findViewById(R.id.agac1);
		im5=(ImageView) findViewById(R.id.agac2);
		im6=(ImageView) findViewById(R.id.agac3);
		
// -----------------------------------------------------------------------------
		sirala();

// -----------------------------------------------------------------------------
		btnSayilarEkraniGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentNesnesi = new Intent(EnbuyukSayiBul.this,
						MatematikKategorileri.class);
				startActivity(intentNesnesi);

			}
		});
			

	}
// -----------------------------------------------------------------------------
	public void sirala() {

		sayi1 = new Random();
		int n, flag, count = 0;

		while (count != dizi.length) {
			n = sayi1.nextInt(21);
			flag = 0;
			for (int i = 0; i < count; i++) {
				if (n == dizi[i])
					flag = 1;
			}
			if (flag == 0) {
				dizi[count] = n;
				count++;
			}
		}
		
		
		Depo.cizdir(im1, dizi[0]);
		Depo.cizdir(im2, dizi[1]);
		Depo.cizdir(im3, dizi[2]);
		Depo.agacCiz(im6, dizi[0]);
		Depo.agacCiz(im4, dizi[1]);
		Depo.agacCiz(im5, dizi[2]);

		im1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				int yeni = buyuguSec(dizi[0], dizi[1], dizi[2]);

				denetle(dizi[0], yeni);
			}
		});

		im2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				int yeni = buyuguSec(dizi[0], dizi[1], dizi[2]);

				denetle(dizi[1], yeni);

			}
		});
		im3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				int yeni = buyuguSec(dizi[0], dizi[1], dizi[2]);

				denetle(dizi[2], yeni);
			}
		});


	}
	
// -----------------------------------------------------------------------------

	public int buyuguSec(int sayi1, int sayi2, int sayi3) {
		int max;
		Integer dizim[] = { sayi1, sayi2, sayi3 };

		max = dizim[0];

		for (int i = 1; i < dizim.length; i++) {

			if (max < dizim[i]) {

				max = dizim[i];

			}

		}

		return max;

	}
	
// -----------------------------------------------------------------------------

	public void denetle(int gelensayi, int max) {

		if (gelensayi == max) {
			
			mpTrue = MediaPlayer.create(EnbuyukSayiBul.this, R.raw.alkis);
			mpTrue.setLooping(false);
			mpTrue.start();
			sirala();
			
		} else {

			mpWrong = MediaPlayer.create(this, R.raw.hatasesi);
			mpWrong.setLooping(false);
			mpWrong.start();

		}

	}

// -----------------------------------------------------------------------------
	
}
