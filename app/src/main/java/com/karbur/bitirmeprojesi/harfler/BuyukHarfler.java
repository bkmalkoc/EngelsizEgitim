package com.karbur.bitirmeprojesi.harfler;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.Harfler;

public class BuyukHarfler extends Activity {

	ViewFlipper vf;
	Button buttonHarflerGeri, buttonIleri, buttonGeri;
	MediaPlayer mp;
	int count=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buyukharfekran);

		vf = (ViewFlipper) findViewById(R.id.viewFlipper1);
		buttonHarflerGeri = (Button) findViewById(R.id.btnHarfGeri);
		buttonIleri = (Button) findViewById(R.id.buttonIleri);
		buttonGeri = (Button) findViewById(R.id.buttonGeri);

		buttonHarflerGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentNesnesi = new Intent(BuyukHarfler.this,
						Harfler.class);

				startActivity(intentNesnesi);
			}
		});
		
		Depo.sesleriAl(BuyukHarfler.this,1);

		buttonIleri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				vf.showNext();
				count++;
				if (count >= 0) {

					Depo.sesleriAl(BuyukHarfler.this,count + 1);

				} else {
					count = 29;
					Depo.sesleriAl(BuyukHarfler.this,count + 1);
				}

			}
		});

		buttonGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				vf.showPrevious();
				count--;

				if (count >= 0) {
					Depo.sesleriAl(BuyukHarfler.this,count + 1);

				} else {
					count = 28;
					Depo.sesleriAl(BuyukHarfler.this,count + 1);
				}
			}
		});

	}
	
	
	//------------------------------------------------------------------

}
