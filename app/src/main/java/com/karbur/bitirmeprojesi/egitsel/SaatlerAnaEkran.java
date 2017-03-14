package com.karbur.bitirmeprojesi.egitsel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.saatler.SaatlerOgrenelim;
import com.karbur.bitirmeprojesi.saatler.SaatlerTest;

public class SaatlerAnaEkran extends Activity {
	Button btnSaatler, btnSaatlerTest;
	Intent intentNesnesi;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saatleranaekran);
		
		
		btnSaatler = (Button) findViewById(R.id.btnSaatler);
		btnSaatlerTest = (Button) findViewById(R.id.btnSaatTest);

		btnSaatler.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi= new Intent(SaatlerAnaEkran.this,
						SaatlerOgrenelim.class);

				startActivity(intentNesnesi);

			}
		});
		
		btnSaatlerTest.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi= new Intent(SaatlerAnaEkran.this,
						SaatlerTest.class);

				startActivity(intentNesnesi);

			}
		});
	}
}