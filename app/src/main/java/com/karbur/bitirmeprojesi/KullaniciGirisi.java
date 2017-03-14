package com.karbur.bitirmeprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KullaniciGirisi extends Activity {

    EditText etGirisKullaniciAdi, etGirisSifre;
    Button btnGirisYap;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanicigiris);


        btnGirisYap = (Button) findViewById(R.id.btnGiris);
        etGirisKullaniciAdi = (EditText) findViewById(R.id.etGirisKullaniciAdi);
        etGirisSifre = (EditText) findViewById(R.id.etGirisSifre);


        btnGirisYap.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String sifremiz = etGirisSifre.getText().toString();
                String gelenSifre = SplashEkrani.session.getPassword();

                if (sifremiz.equals(gelenSifre)) {

                    intent = new Intent(KullaniciGirisi.this, AnaEkran.class);
                    startActivity(intent);
                    finish();
                } else {

                    Toast.makeText(KullaniciGirisi.this, "Kullanici Adi veya Parola Hatasi !  ",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}

