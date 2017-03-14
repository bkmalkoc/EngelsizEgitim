package com.karbur.bitirmeprojesi.matematik;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.MatematikKategorileri;

public class SayilarEkrani extends Activity {

	ViewFlipper vf;
	Button btnSayiOgrenGeri, btnGeri, btnIleri;
	TextView txtSayilar;
	String dizi[];
	int count = 0;
	MediaPlayer mp;
	ImageView sayilaragac;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sayilar);

		
		dizi = new String[20];
		sayilaragac = (ImageView) findViewById(R.id.sayilaragac);
		btnSayiOgrenGeri = (Button) findViewById(R.id.btnSayiOgrenGeri);
		vf = (ViewFlipper) findViewById(R.id.viewFlipper1);
		txtSayilar = (TextView) findViewById(R.id.txtSayilariYazdir);
		btnIleri = (Button) findViewById(R.id.btnSayiIleri);
		btnGeri = (Button) findViewById(R.id.btnSayiGeri);
		
		final String dizi[] = { "BIR", "IKI", "UC", "DORT", "BES", "ALTI",
				"YEDI", "SEKIZ", "DOKUZ", "ON", "ONBIR", "ONIKI", "ONUC",
				"ONDORT", "ONBES", "ONALTI", "ONYEDI", "ONSEKIZ", "ONDOKUZ",
				"YIRMI"

		};

// -----------------------------------------------------------------------------
		
		txtSayilar.setText(dizi[0]);
		Depo.sesleriAlSayi(SayilarEkrani.this, 1);
		Depo.agacCiz(sayilaragac, 1);
// -----------------------------------------------------------------------------

		btnIleri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				vf.showNext();
				count++;
			

				if (count < 20) {

					txtSayilar.setText(dizi[count]);
					Depo.sesleriAlSayi(SayilarEkrani.this, count + 1);
					Depo.agacCiz(sayilaragac, count+1);

				} else {
					count = 0;
					
					txtSayilar.setText(dizi[count]);
					Depo.sesleriAlSayi(SayilarEkrani.this, count + 1);
					Depo.agacCiz(sayilaragac, count+1);

				}

			}
		});

		// -----------------------------------------------------------------------------

		btnGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				vf.showPrevious();
				count--;

				if (count >= 0) {

					txtSayilar.setText(dizi[count]);
					Depo.sesleriAlSayi(SayilarEkrani.this, count + 1);
					Depo.agacCiz(sayilaragac, count+1);

				} else {
					count = 19;
					txtSayilar.setText(dizi[count]);
					Depo.sesleriAlSayi(SayilarEkrani.this, count + 1);
					Depo.agacCiz(sayilaragac, count+1);
				}

			}
		});

		// -----------------------------------------------------------------------------

		btnSayiOgrenGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentNesnesi3 = new Intent(SayilarEkrani.this,
						MatematikKategorileri.class);

				startActivity(intentNesnesi3);

			}
		});

	}

	// -----------------------------------------------------------------------------

}
