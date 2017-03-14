package com.karbur.bitirmeprojesi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class AnaEkran extends Activity {

	Button btnEgitselGiris, btnSosyalGiris;
	Intent intent;
	ImageView profilResmi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anaekran);

		btnEgitselGiris = (Button) findViewById(R.id.btnEgitselGiris);
		btnSosyalGiris = (Button) findViewById(R.id.btnSosyalEgitim);
		profilResmi = (ImageView) findViewById(R.id.imgProfilResmi);
		
		try {

			profilResmi.setVisibility(View.VISIBLE);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize =8;
            final Bitmap bitmap = BitmapFactory.decodeFile(SplashEkrani.session.getUrl(),options);
        
            
            
            profilResmi.setImageBitmap(bitmap);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
		
		
		btnEgitselGiris.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				intent = new Intent(AnaEkran.this, EgitselAnaEkran.class);
				startActivity(intent);

			}
		});

		btnSosyalGiris.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				intent = new Intent(AnaEkran.this, SosyalAnaEkran.class);
				startActivity(intent);

			}
		});

		profilResmi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				intent = new Intent(AnaEkran.this, Fotograf.class);
				startActivity(intent);
				finish();
			}
		});

	}

}
