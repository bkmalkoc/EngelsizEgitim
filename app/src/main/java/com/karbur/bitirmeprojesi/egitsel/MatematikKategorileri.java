package com.karbur.bitirmeprojesi.egitsel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.karbur.bitirmeprojesi.EgitselAnaEkran;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.matematik.AdetHesapla;
import com.karbur.bitirmeprojesi.matematik.BasitMatematikIslemleri;
import com.karbur.bitirmeprojesi.matematik.EnbuyukSayiBul;
import com.karbur.bitirmeprojesi.matematik.SayilarEkrani;
import com.karbur.bitirmeprojesi.matematik.SayilariSeslendirme;


public class MatematikKategorileri extends Activity {

	 Button btnMatematikSayiSayma, btnMatematikSayiSiralama,
			btnMatematikKategoriGeri, btnMatematikBasitIslemler,
			btnMatematikAdetHesapla, btnSayilariSeslendir;
	Intent intentNesnesi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matematikkategori);
		
		
		btnMatematikSayiSayma = (Button) findViewById(R.id.btnSayiOgren);
		btnMatematikSayiSiralama = (Button) findViewById(R.id.btnSayiSiralama);
		btnMatematikKategoriGeri = (Button) findViewById(R.id.btnMatematikKategoriGeri);
		btnMatematikBasitIslemler = (Button) findViewById(R.id.btnSayiIslemleri);
		btnMatematikAdetHesapla = (Button) findViewById(R.id.btnBalonSayisiBulma);
		btnSayilariSeslendir = (Button) findViewById(R.id.btnSayilariSoyleyelim);

//------------------------------------------------------------------------
		btnMatematikSayiSayma.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi= new Intent(MatematikKategorileri.this,
						SayilarEkrani.class);

				startActivity(intentNesnesi);

			}
		});
//------------------------------------------------------------------------
		btnMatematikSayiSiralama.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				intentNesnesi = new Intent(MatematikKategorileri.this,
						EnbuyukSayiBul.class);

				startActivity(intentNesnesi);
			}
		});
		
//------------------------------------------------------------------------

		OnClickListener dinleyici = new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(MatematikKategorileri.this,
						EgitselAnaEkran.class);

				startActivity(intentNesnesi);

			}
		};

		btnMatematikKategoriGeri.setOnClickListener(dinleyici);
//------------------------------------------------------------------------
		btnMatematikBasitIslemler.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi= new Intent(MatematikKategorileri.this,
						BasitMatematikIslemleri.class);

				startActivity(intentNesnesi);

			}
		});
//------------------------------------------------------------------------
		btnMatematikAdetHesapla.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(MatematikKategorileri.this,
						AdetHesapla.class);

				startActivity(intentNesnesi);

			}
		});
//------------------------------------------------------------------------
		btnSayilariSeslendir.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				intentNesnesi = new Intent(MatematikKategorileri.this,
						SayilariSeslendirme.class);
				startActivity(intentNesnesi);

			}
		});

	}
}
