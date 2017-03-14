package com.karbur.bitirmeprojesi.egitsel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.karbur.bitirmeprojesi.EgitselAnaEkran;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.renkler.RenklerTest;
import com.karbur.bitirmeprojesi.renkler.RenkleriOgrenelim;

public class RenklerKatalogu extends Activity {
	Button btnRenkleriOgrenelim,btnRenklerTest,btnRenklerGeri;
	Intent intentNesnesi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.renklerkatalogu);
		
		btnRenkleriOgrenelim=(Button) findViewById(R.id.renkleriOgrenelimGiris);
		btnRenklerTest=(Button) findViewById(R.id.renklertest);
		btnRenklerGeri=(Button) findViewById(R.id.btnResimKataloguGeri);
		
		//--------------------------------------------------------------------------
		
		btnRenkleriOgrenelim.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(
						RenklerKatalogu.this,
						RenkleriOgrenelim.class);
				startActivity(intentNesnesi);
				
			}
		});
		
		//--------------------------------------------------------------------------
	btnRenklerTest.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(
						RenklerKatalogu.this,
						RenklerTest.class);
				startActivity(intentNesnesi);
				
			}
		});
	//--------------------------------------------------------------------------
	
	btnRenklerGeri.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			intentNesnesi = new Intent(
					RenklerKatalogu.this,
					EgitselAnaEkran.class);
			startActivity(intentNesnesi);
			
		}
	});
	}

}
