package com.karbur.bitirmeprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.karbur.bitirmeprojesi.egitsel.Harfler;
import com.karbur.bitirmeprojesi.egitsel.MatematikKategorileri;
import com.karbur.bitirmeprojesi.egitsel.RenklerKatalogu;
import com.karbur.bitirmeprojesi.egitsel.SaatlerAnaEkran;
import com.karbur.bitirmeprojesi.memorygame.Manager;

public class EgitselAnaEkran extends Activity {
	Button btnMatematik,btnHarf,btnSaat,btnRenk,btnHarfOyun,btnGeri;
 Intent intentNesnesi2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.egitselanaekran);
		
		btnMatematik = (Button) findViewById(R.id.btnMatematik);
		btnHarf = (Button) findViewById(R.id.btnAlfabe);
		btnRenk = (Button) findViewById(R.id.btnRenk);
		btnSaat=(Button) findViewById(R.id.button6);
		btnHarfOyun =(Button) findViewById(R.id.buttonOyun);
		btnGeri=(Button) findViewById(R.id.btnEgitsenAnaEkranGeri);

//----------------------------------------------------------------	
		
		btnGeri.setOnClickListener(new OnClickListener() {
				
					@Override
					public void onClick(View v) {
							intentNesnesi2 = new Intent(
								EgitselAnaEkran.this,
								AnaEkran.class);
						startActivity(intentNesnesi2);

					}
				});

//----------------------------------------------------------------	
		
		btnMatematik.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
					intentNesnesi2 = new Intent(
						EgitselAnaEkran.this,
						MatematikKategorileri.class);
				startActivity(intentNesnesi2);

			}
		});

//----------------------------------------------------------------
		btnHarf.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi2 = new Intent(
						EgitselAnaEkran.this,
						Harfler.class);
				startActivity(intentNesnesi2);

			}
		});
//------------------------------------------------------------------------
		btnSaat.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi2 = new Intent(
						EgitselAnaEkran.this,
						SaatlerAnaEkran.class);
				startActivity(intentNesnesi2);

			}
		});
//------------------------------------------------------------------------
		btnRenk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi2 = new Intent(
						EgitselAnaEkran.this,
						RenklerKatalogu.class);
				startActivity(intentNesnesi2);

			}
		});

//----------------------------------------------------------------		
		btnHarfOyun.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi2 = new Intent(
						EgitselAnaEkran.this,
						Manager.class);
				startActivity(intentNesnesi2);

			}
		});
		
//----------------------------------------------------------------
	}
	

}
