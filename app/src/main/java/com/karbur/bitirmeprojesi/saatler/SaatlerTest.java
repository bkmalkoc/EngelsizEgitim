package com.karbur.bitirmeprojesi.saatler;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.SaatlerAnaEkran;


public class SaatlerTest extends Activity {
	Button btnSaatTestGeri, saatdeger1, saatdeger2, saatdeger3, saatdeger4;
	ImageView ivSaatler;
	int butondegerleri;
	public int dizi[] = new int[5];
	Random sayi = new Random();
	int deger = 0;
	String yeniIsim;
	String saatIsmi;
	MediaPlayer mpTrue, mpWrong;
	Timer timer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saattest);
		btnSaatTestGeri = (Button) findViewById(R.id.btnSaatTestGeri);
		saatdeger1 = (Button) findViewById(R.id.btnsaat1);
		saatdeger2 = (Button) findViewById(R.id.btnsaat2);
		saatdeger3 = (Button) findViewById(R.id.btnsaat3);
		saatdeger4 = (Button) findViewById(R.id.btnsaat4);
		ivSaatler = (ImageView) findViewById(R.id.ivsaattest);
		timer = new Timer();
		
		different();
		randomResim();
		SaatinIsminiYazdir();

		btnSaatTestGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentNesnesi2 = new Intent(SaatlerTest.this,
						SaatlerAnaEkran.class);
				startActivity(intentNesnesi2);

			}
		});
		
		saatdeger1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (saatIsmi.contains(saatdeger1.getText())) {
					beklet();
					dogruSes();
					
					

				} else {
					yanlisSes();
				}

			}
		});

		saatdeger2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (saatIsmi.contains(saatdeger2.getText())) {
					beklet();
					dogruSes();
					

				} else {
					yanlisSes();
				}

			}
		});

		saatdeger3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (saatIsmi.contains(saatdeger3.getText())) {
					beklet();
					dogruSes();
					
				} else {
					yanlisSes();
				}

			}
		});

		saatdeger4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (saatIsmi.contains(saatdeger4.getText())) {
					beklet();
					dogruSes();
					

				} else {
					yanlisSes();
				}

			}
		});

	}

	public void different() {
		int n, flag, count = 0;
		while (count != dizi.length) {
			n = sayi.nextInt(12) + 1;
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

	public void randomResim() {
		deger = sayi.nextInt(12) + 1;

		if (deger == 1) {

			ivSaatler.setImageResource(R.drawable.saat1);
			saatIsmi = "SAAT BIR";
		} else if (deger == 2) {
			ivSaatler.setImageResource(R.drawable.saat2);
			saatIsmi = "SAAT IKI";
		} else if (deger == 3) {
			ivSaatler.setImageResource(R.drawable.saat3);
			saatIsmi = "SAAT UC";
		} else if (deger == 4) {
			ivSaatler.setImageResource(R.drawable.saat4);
			saatIsmi = "SAAT DORT";
		} else if (deger == 5) {
			ivSaatler.setImageResource(R.drawable.saat5);
			saatIsmi = "SAAT BES";
		} else if (deger == 6) {
			ivSaatler.setImageResource(R.drawable.saat6);
			saatIsmi = "SAAT ALTI";
		} else if (deger == 7) {
			ivSaatler.setImageResource(R.drawable.saat7);
			saatIsmi = "SAAT YEDI";
		} else if (deger == 8) {
			ivSaatler.setImageResource(R.drawable.saat8);
			saatIsmi = "SAAT SEKIZ";
		} else if (deger == 9) {
			ivSaatler.setImageResource(R.drawable.saat9);
			saatIsmi = "SAAT DOKUZ";
		} else if (deger == 10) {
			ivSaatler.setImageResource(R.drawable.saat10);
			saatIsmi = "SAAT ON";
		} else if (deger == 11) {
			ivSaatler.setImageResource(R.drawable.saat11);
			saatIsmi = "SAAT ONBIR";
		} else if (deger == 12) {
			ivSaatler.setImageResource(R.drawable.saat12);
			saatIsmi = "SAAT ONIKI";
		}
		
		Depo.sesleriAlSayi(SaatlerTest.this, deger);
		
	}
	

	public void SaatinIsminiYazdir() {

		butondegerleri = sayi.nextInt(4) + 1;

		if (butondegerleri == 1) {
			saatdeger1.setText(saatIsmi);
		} else {
			if (deger != dizi[0]) {
				saatdeger1.setText(ismeCevir(dizi[0]));
			} else {
				while (deger == dizi[0]) {
					dizi[0] = sayi.nextInt(12) + 1;
				}
				saatdeger1.setText(ismeCevir(dizi[0]));
			}
		}

		if (butondegerleri == 2) {
			saatdeger2.setText(saatIsmi);
		} else {

			if (deger != dizi[1]) {
				saatdeger2.setText(ismeCevir(dizi[1]));
			} else {
				while (deger == dizi[1]) {
					dizi[1] = sayi.nextInt(12) + 1;
				}
				saatdeger2.setText(ismeCevir(dizi[1]));
			}

		}
		if (butondegerleri == 3) {
			saatdeger3.setText(saatIsmi);
		} else {

			if (deger != dizi[2]) {
				saatdeger3.setText(ismeCevir(dizi[2]));
			} else {
				while (deger == dizi[2]) {
					dizi[2] = sayi.nextInt(12) + 1;
				}
				saatdeger3.setText(ismeCevir(dizi[2]));
			}
		}
		if (butondegerleri == 4) {
			saatdeger4.setText(saatIsmi);
		} else {

			if (deger != dizi[3]) {
				saatdeger4.setText(ismeCevir(dizi[3]));
			} else {

				while (deger == dizi[3]) {
					dizi[3] = sayi.nextInt(12) + 1;
				}
				saatdeger4.setText(ismeCevir(dizi[3]));
			}
		}

	}

	public String ismeCevir(int a) {

		if (a == 1) {
			yeniIsim = "SAAT BIR";

		} else if (a == 2) {

			yeniIsim = "SAAT IKI";
		} else if (a == 3) {

			yeniIsim = "SAAT UC";
		} else if (a == 4) {

			yeniIsim = "SAAT DORT";
		} else if (a == 5) {

			yeniIsim = "SAAT BES";
		} else if (a == 6) {

			yeniIsim = "SAAT ALTI";
		} else if (a == 7) {

			yeniIsim = "SAAT YEDI";
		} else if (a == 8) {

			yeniIsim = "SAAT SEKIZ";
		} else if (a == 9) {

			yeniIsim = "SAAT DOKUZ";
		} else if (a == 10) {

			yeniIsim = "SAAT ON";
		} else if (a == 11) {

			yeniIsim = "SAAT ONBIR";
		} else if (a == 12) {

			yeniIsim = "SAAT ONIKI";
		}
		return yeniIsim;
	}
	
	public void dogruSes() {
		mpTrue = MediaPlayer.create(SaatlerTest.this, R.raw.alkis);
		mpTrue.setLooping(false);
		mpTrue.start();

	}

	// -------------------------------------------------------------------

	public void yanlisSes() {
		mpWrong = MediaPlayer.create(SaatlerTest.this, R.raw.hatasesi);
		mpWrong.setLooping(false);
		mpWrong.start();
	}

public void beklet(){
		
		timer.schedule(new TimerTask() {

		    @Override
		    public void run() {
		      
		    	runOnUiThread(new Runnable() {

		    	    @Override
		    	    public void run() {
		    	    	different();
		    			randomResim();
						SaatinIsminiYazdir();
		  
		    	    }	});
		    	}
		    },2000);
	
	}
	
}
