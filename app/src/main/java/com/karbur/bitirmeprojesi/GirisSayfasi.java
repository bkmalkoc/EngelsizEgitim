package com.karbur.bitirmeprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GirisSayfasi extends Activity {

	Button btnKayitOl;
	EditText  etKayitKullaniciAdi,
			etKayitSifre, etKayitSifreTekrar;

	String sifre, tekrarSifre;
	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ilkgiris);
		
	
		btnKayitOl = (Button) findViewById(R.id.btnKaydet);
		etKayitKullaniciAdi = (EditText) findViewById(R.id.etKayitKullaniciAdi);
		etKayitSifre = (EditText) findViewById(R.id.etKayitSifre);
		etKayitSifreTekrar = (EditText) findViewById(R.id.etKayitSifreTekrar);
	

		btnKayitOl.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				sifre = etKayitSifre.getText().toString();
				tekrarSifre = etKayitSifreTekrar.getText().toString();

				if (sifre.equals(tekrarSifre)) {

				
					SplashEkrani.session.createLoginSession(etKayitKullaniciAdi.getText().toString(), 
							etKayitSifre.getText().toString(),"", true);
					
					intent = new Intent(GirisSayfasi.this, AnaEkran.class);
					startActivity(intent);
					finish();

				}else{
					
					Toast.makeText(GirisSayfasi.this, "Sifreler Bos veya Uyumsuz Olamaz",
							Toast.LENGTH_SHORT).show();
					temizle();
				}
			}
		});
	
		
	}

	
	public void temizle(){
		
		etKayitSifre.setText(null);
		etKayitSifreTekrar.setText(null);
		
	}
	
	
	
}