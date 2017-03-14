package com.karbur.bitirmeprojesi.egitsel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.karbur.bitirmeprojesi.EgitselAnaEkran;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.harfler.BuyukHarfler;
import com.karbur.bitirmeprojesi.harfler.HarfleriTaniyalim;
import com.karbur.bitirmeprojesi.harfler.KucukHarfler;
import com.karbur.bitirmeprojesi.harfler.SesliTest;

public class Harfler extends Activity {

	Button buttonGeri, harfbtnbuyuk, harfbtnkucuk, btnharfkucukgiris,
			bntHarfleriTanima,btnHarfSeslendirme;
	Intent intentNesnesi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.harflerkatalog);
		btnHarfSeslendirme=(Button) findViewById(R.id.btnSesHarf);
		buttonGeri = (Button) findViewById(R.id.btnharfgeri);
		harfbtnbuyuk = (Button) findViewById(R.id.btnharfbuyukgiris);
		harfbtnkucuk = (Button) findViewById(R.id.btnharfkucukgiris);
		bntHarfleriTanima = (Button) findViewById(R.id.btnharflerTanima);
		buttonGeri.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(Harfler.this,
						EgitselAnaEkran.class);

				startActivity(intentNesnesi);
			}
		});

		harfbtnbuyuk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(Harfler.this,
						BuyukHarfler.class);

				startActivity(intentNesnesi);
			}
		});

		harfbtnkucuk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(Harfler.this,
						KucukHarfler.class);

				startActivity(intentNesnesi);
			}
		});

		bntHarfleriTanima.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(Harfler.this,
						HarfleriTaniyalim.class);

				startActivity(intentNesnesi);
			}
		});
		
		btnHarfSeslendirme.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				 intentNesnesi = new Intent(Harfler.this,
						SesliTest.class);

				startActivity(intentNesnesi);
			}
		});

	}
}
