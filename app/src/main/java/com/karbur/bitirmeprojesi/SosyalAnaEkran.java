package com.karbur.bitirmeprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.karbur.bitirmeprojesi.sosyal.Koridor;
import com.karbur.bitirmeprojesi.sosyal.Market;

public class SosyalAnaEkran extends Activity {

	Intent gecis;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sosyalanaekran);
		
		Button butonMarket = (Button) findViewById(R.id.btnMarket);
		Button butonSokak = (Button) findViewById(R.id.btnSokak);
		Button butonOkul = (Button) findViewById(R.id.btnOkul);
		Button btnGeri = (Button) findViewById(R.id.btnSosyalEkranGeri);
		
		btnGeri.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				gecis = new Intent(SosyalAnaEkran.this,AnaEkran.class);
				startActivity(gecis);
				
			}
		});
		
		butonMarket.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				gecis = new Intent(SosyalAnaEkran.this,Market.class);
				startActivity(gecis);
				
			}
		});

		butonSokak.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
//				gecis = new Intent(SosyalAnaEkran.this,Sokak.class);
//				startActivity(gecis);
			}
		});
		
		butonOkul.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				gecis = new Intent(SosyalAnaEkran.this,Koridor.class);
				startActivity(gecis);
				
			}
		});
	}
}
