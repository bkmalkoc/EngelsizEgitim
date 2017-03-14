package com.karbur.bitirmeprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashEkrani extends Activity {

	public static SessionManager session;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hosgeldiniz);
		session= new SessionManager(SplashEkrani.this);
		
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				
				if(session.isThereUser()){
	                Intent intent = new Intent(SplashEkrani.this, KullaniciGirisi.class);
	                startActivity(intent);
	                finish();
            	}else{
            		Intent intent = new Intent(SplashEkrani.this, GirisSayfasi.class);
  	                startActivity(intent);
  	                finish();
            	}
				
				
			}
		}, 2000);
		
	}
	
	
}
