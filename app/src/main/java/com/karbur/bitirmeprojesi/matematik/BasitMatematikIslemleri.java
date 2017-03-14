package com.karbur.bitirmeprojesi.matematik;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;

public class BasitMatematikIslemleri extends Activity {

	Random sayiBir, sayiIki, islemUret;
	int dizi[] = new int[4];
	int tutulanSayi1, tutulanSayi2, islemSayisi;
	int deger, yenisonuc, sayi1, sayi2, sonuc, temp, tutulanSayi;
	ImageView ivsayi1, ivsayi2, ivsonuc, ivislem, ivGelenSayi1, ivGelenSayi2,
			ivGelenSayi3,ivSonucResmi,agac1,agac2,agacSonuc;
	Button btnSayi1, btnSayi2, btnSayi3;
	Random sayi = new Random();
	int ilk, ikinci, ucuncu;
	Timer timer;
	MediaPlayer mp;
	
	
	// -------------------------------------------------------------------------
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basitislemler);

		ivsayi1 = (ImageView) findViewById(R.id.ivsayi1);
		ivsayi2 = (ImageView) findViewById(R.id.ivsayi2);
		ivsonuc = (ImageView) findViewById(R.id.ivsonuc);
		ivislem = (ImageView) findViewById(R.id.ivIslem);
		ivGelenSayi1 = (ImageView) findViewById(R.id.imMeyveler);
		ivGelenSayi2 = (ImageView) findViewById(R.id.imageView2);
		ivGelenSayi3 = (ImageView) findViewById(R.id.imageView3);
		
		agac1 = (ImageView) findViewById(R.id.imageView4);
		agac2 = (ImageView) findViewById(R.id.imageWc);
		agacSonuc = (ImageView) findViewById(R.id.imageView6);
		
		ivSonucResmi=(ImageView) findViewById(R.id.ivSonuc);
		timer = new Timer();
		
		
		
		IslemlerinTumu();
		
		// -------------------------------------------------------------------------
		ivGelenSayi1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (ilk == sonuc) {
					
					mp = MediaPlayer.create(BasitMatematikIslemleri.this, R.raw.alkis);
					mp.setLooping(false);
					mp.start();	
					Depo.cizdir(ivsonuc, sonuc);
					Depo.agacCiz(agacSonuc,sonuc);
					ivsonuc.setVisibility(View.VISIBLE);
					agacSonuc.setVisibility(View.VISIBLE);
					beklet();

				     
				} else {
					mp = MediaPlayer.create(BasitMatematikIslemleri.this, R.raw.hatasesi);
					mp.setLooping(false);
					mp.start();
				
				}

			}
		});
		// -------------------------------------------------------------------------
		ivGelenSayi2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (ikinci == sonuc) {
					mp = MediaPlayer.create(BasitMatematikIslemleri.this, R.raw.alkis);
					mp.setLooping(false);
					mp.start();	
					Depo.cizdir(ivsonuc, sonuc);
					Depo.agacCiz(agacSonuc,sonuc);
					ivsonuc.setVisibility(View.VISIBLE);
					agacSonuc.setVisibility(View.VISIBLE);
					beklet();

					
				} else {
					mp = MediaPlayer.create(BasitMatematikIslemleri.this, R.raw.hatasesi);
					mp.setLooping(false);
					mp.start();
				}

			}
		});
		// -------------------------------------------------------------------------
		ivGelenSayi3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (ucuncu == sonuc) {
					mp = MediaPlayer.create(BasitMatematikIslemleri.this, R.raw.alkis);
					mp.setLooping(false);
					mp.start();	
					Depo.cizdir(ivsonuc, sonuc);
					Depo.agacCiz(agacSonuc,sonuc);
					ivsonuc.setVisibility(View.VISIBLE);
					agacSonuc.setVisibility(View.VISIBLE);
					beklet();

				} else {
					mp = MediaPlayer.create(BasitMatematikIslemleri.this, R.raw.hatasesi);
					mp.setLooping(false);
					mp.start();			
				}

			}
		});

		// -------------------------------------------------------------------------

	}
	
	public void beklet(){
		
		timer.schedule(new TimerTask() {

		    @Override
		    public void run() {
		      
		    	runOnUiThread(new Runnable() {

		    	    @Override
		    	    public void run() {
		    	    	
		  
						IslemlerinTumu();
						agacSonuc.setVisibility(View.INVISIBLE);
						ivsonuc.setVisibility(View.INVISIBLE);
						
		    	    }	});
		    	}
		    },4000);
	
	}
	
	// -------------------------------------------------------------------------
	
	public void different() {
		int n, flag, count = 0;
		while (count != dizi.length) {
			n = sayi.nextInt(10) + 1;
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

	}

	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------

	public void bastir() {

		tutulanSayi = sayi.nextInt(3) + 1;
		
		if (tutulanSayi == 1) {

			Depo.cizdir(ivGelenSayi1, sonuc);
			ilk = sonuc;

		} else {
			
			if (sonuc != dizi[0]) {
				Depo.cizdir(ivGelenSayi1, dizi[0]);
				ilk = dizi[0];
			} else {
				while (sonuc == dizi[0]) {
					dizi[0] = sayi.nextInt(10) + 1;
				}
				Depo.cizdir(ivGelenSayi1, dizi[0]);
				ilk = dizi[0];
			}
			
			

		}
		if (tutulanSayi == 2) {

			Depo.cizdir(ivGelenSayi2, sonuc);
			ikinci = sonuc;

		} else {
			
			
			if (sonuc != dizi[1]) {
				Depo.cizdir(ivGelenSayi2, dizi[1]);
				ikinci = dizi[1];
			} else {
				
				while (sonuc == dizi[1]) {
					dizi[1] = sayi.nextInt(10) + 1;
				}
				Depo.cizdir(ivGelenSayi2, dizi[1]);
				ikinci = dizi[1];
			}
			

		}
		if (tutulanSayi == 3) {
			Depo.cizdir(ivGelenSayi3, sonuc);
			ucuncu = sonuc;

		} else {
			
			if (sonuc != dizi[2]) {
				Depo.cizdir(ivGelenSayi3, dizi[2]);
				ucuncu = dizi[2];
			} else {
				
				while (sonuc == dizi[2]) {
					dizi[2] = sayi.nextInt(10) + 1;
				}
				Depo.cizdir(ivGelenSayi3, dizi[2]);
				ucuncu = dizi[2];
			}
		}
	}

	// -------------------------------------------------------------------------

	public int sayi1Uret() {

		sayiBir = new Random();
		tutulanSayi1 = sayiBir.nextInt(10) + 1;
		return tutulanSayi1;

	}

	// -------------------------------------------------------------------------

	public int sayi2Uret() {

		sayiIki = new Random();
		tutulanSayi2 = sayiBir.nextInt(10) + 1;
		return tutulanSayi2;
	}

	// -------------------------------------------------------------------------

	public int islemUret() {

		islemUret = new Random();
		islemSayisi = islemUret.nextInt(2) + 1;
		return islemSayisi;
	}

	public void IslemlerinTumu() {

		sayi1 = sayi1Uret();
		sayi2 = sayi2Uret();
		deger = islemUret();

		// -------------------------------------------------------------------------

		switch (deger) {
		case 1:
			Depo.cizdir(ivsayi1, sayi1);
			Depo.cizdir(ivsayi2, sayi2);
			Depo.agacCiz(agac1,sayi1);
			Depo.agacCiz(agac2,sayi2);
			ivislem.setBackgroundResource(R.drawable.toplama);
			sonuc = sayi1 + sayi2;

			break;

		default:

			ivislem.setBackgroundResource(R.drawable.cikarma);
		
			
			if (sayi1 > sayi2) {
				Depo.cizdir(ivsayi1, sayi1);
				Depo.cizdir(ivsayi2, sayi2);
				Depo.agacCiz(agac1,sayi1);
				Depo.agacCiz(agac2,sayi2);
				sonuc = sayi1 - sayi2;

			} else if(sayi1 < sayi2){
				temp = sayi1;
				sayi1 = sayi2;
				sayi2 = temp;
				Depo.cizdir(ivsayi1, sayi1);
				Depo.cizdir(ivsayi2, sayi2);
				Depo.agacCiz(agac1,sayi1);
				Depo.agacCiz(agac2,sayi2);
				sonuc = sayi1 - sayi2;

			}else{
				
				IslemlerinTumu();
				
			}
			break;
		}
		


		// -------------------------------------------------------------------------

		different();
		bastir();

		// -------------------------------------------------------------------------
	}

	
	// -------------------------------------------------------------------------
}