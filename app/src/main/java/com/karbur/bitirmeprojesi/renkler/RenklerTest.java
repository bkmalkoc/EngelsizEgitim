package com.karbur.bitirmeprojesi.renkler;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.RenklerKatalogu;

public class RenklerTest extends Activity {

	Button btnIlkDeger, btnIkinciDeger, btnUcuncuDeger, btnDorduncuDeger,
			btnGeri;
	ImageView renklerimiz;
	int deger = 0;
	int butondegerleri;
	int sayi2 = 0;
	Random sayi = new Random();
	String renkIsmi;
	public int dizi[] = new int[5];
	String yeniIsim;
	MediaPlayer mpTrue, mpWrong;
	public final static int kirmizi = 1;
	public final static int sari = 2;
	public final static int yesil = 3;
	public final static int mavi = 4;
	public final static int turuncu = 5;
	public final static int siyah = 6;
	public final static int beyaz = 7;
	public final static int gri = 8;
	public final static int lacivert = 9;
	public final static int pembe = 10;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.renktest);

		btnIlkDeger = (Button) findViewById(R.id.btnIlkDeger);
		btnIkinciDeger = (Button) findViewById(R.id.btnIkinciDeger);
		btnUcuncuDeger = (Button) findViewById(R.id.btnUcuncuDeger);
		btnDorduncuDeger = (Button) findViewById(R.id.btnDorduncuDeger);
		btnGeri = (Button) findViewById(R.id.btnResimTestGeri);
		renklerimiz = (ImageView) findViewById(R.id.ivsayi1);

		different();
		randomResim();
		RenginIsminiYazdir();

		btnGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentNesnesi2 = new Intent(RenklerTest.this,
						RenklerKatalogu.class);
				startActivity(intentNesnesi2);

			}
		});

		// -------------------------------------------------------------------

		btnIlkDeger.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (renkIsmi.contains(btnIlkDeger.getText())) {

					dogruSes();
					different();
					randomResim();
					RenginIsminiYazdir();

				} else {
					yanlisSes();
				}

			}
		});

		// -------------------------------------------------------------------

		btnIkinciDeger.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (renkIsmi.contains(btnIkinciDeger.getText())) {

					dogruSes();
					different();
					randomResim();
					RenginIsminiYazdir();
				} else {
					yanlisSes();
				}

			}
		});

		// -------------------------------------------------------------------

		btnUcuncuDeger.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (renkIsmi.contains(btnUcuncuDeger.getText())) {

					dogruSes();
					different();
					randomResim();
					RenginIsminiYazdir();

				} else {
					yanlisSes();
				}

			}
		});

		// -------------------------------------------------------------------

		btnDorduncuDeger.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (renkIsmi.contains(btnDorduncuDeger.getText())) {
					dogruSes();

					different();
					randomResim();
					RenginIsminiYazdir();
				} else {
					yanlisSes();
				}

			}
		});

		// -------------------------------------------------------------------

	}

	// -------------------------------------------------------------------

	public void different() {
		int n, flag, count = 0;
		while (count != dizi.length) {
			n = sayi.nextInt(10) + 1;
			flag = 0;
			for (int i = 0; i < count; i++) {
				if (n == dizi[i])
					flag = 1;
			}
			if (flag == 0) {
				dizi[count] = n;
				count++;
			}
		}
	}

	// -------------------------------------------------------------------

	public void randomResim() {
		deger = sayi.nextInt(10) + 1;

		if (deger == 1) {

			renklerimiz.setImageResource(R.drawable.arkakirmizi2);
			renkIsmi = "KIRMIZI";
		} else if (deger == 2) {
			renklerimiz.setImageResource(R.drawable.arkasari2);
			renkIsmi = "SARI";
		} else if (deger == 3) {
			renklerimiz.setImageResource(R.drawable.arkayesil2);
			renkIsmi = "YESIL";
		} else if (deger == 4) {
			renklerimiz.setImageResource(R.drawable.arkamavi2);
			renkIsmi = "MAVI";
		} else if (deger == 5) {
			renklerimiz.setImageResource(R.drawable.arkaturuncu2);
			renkIsmi = "TURUNCU";
		} else if (deger == 6) {
			renklerimiz.setImageResource(R.drawable.arkasiyah2);
			renkIsmi = "SIYAH";
		} else if (deger == 7) {
			renklerimiz.setImageResource(R.drawable.arkabeyaz2);
			renkIsmi = "BEYAZ";
		} else if (deger == 8) {
			renklerimiz.setImageResource(R.drawable.arkagri2);
			renkIsmi = "GRI";
		} else if (deger == 9) {
			renklerimiz.setImageResource(R.drawable.arkalacivert2);
			renkIsmi = "LACIVERT";
		} else if (deger == 10) {
			renklerimiz.setImageResource(R.drawable.arkapembe2);
			renkIsmi = "PEMBE";
		}

	}

	// -------------------------------------------------------------------

	public void RenginIsminiYazdir() {

		butondegerleri = sayi.nextInt(4) + 1;

		if (butondegerleri == 1) {
			btnIlkDeger.setText(renkIsmi);
		} else {
			if (deger != dizi[0]) {
				btnIlkDeger.setText(ismeCevir(dizi[0]));
			} else {
				while (deger == dizi[0]) {
					dizi[0] = sayi.nextInt(10) + 1;
				}
				btnIlkDeger.setText(ismeCevir(dizi[0]));
			}
		}

		if (butondegerleri == 2) {
			btnIkinciDeger.setText(renkIsmi);
		} else {

			if (deger != dizi[1]) {
				btnIkinciDeger.setText(ismeCevir(dizi[1]));
			} else {
				while (deger == dizi[1]) {
					dizi[1] = sayi.nextInt(10) + 1;
				}
				btnIkinciDeger.setText(ismeCevir(dizi[1]));
			}

		}
		if (butondegerleri == 3) {
			btnUcuncuDeger.setText(renkIsmi);
		} else {

			if (deger != dizi[2]) {
				btnUcuncuDeger.setText(ismeCevir(dizi[2]));
			} else {
				while (deger == dizi[2]) {
					dizi[2] = sayi.nextInt(10) + 1;
				}
				btnUcuncuDeger.setText(ismeCevir(dizi[2]));
			}
		}
		if (butondegerleri == 4) {
			btnDorduncuDeger.setText(renkIsmi);
		} else {

			if (deger != dizi[3]) {
				btnDorduncuDeger.setText(ismeCevir(dizi[3]));
			} else {

				while (deger == dizi[3]) {
					dizi[3] = sayi.nextInt(10) + 1;
				}
				btnDorduncuDeger.setText(ismeCevir(dizi[3]));
			}
		}

	}

	// -------------------------------------------------------------------

	public String ismeCevir(int a) {

		if (a == 1) {
			yeniIsim = "KIRMIZI";

		} else if (a == 2) {

			yeniIsim = "SARI";
		} else if (a == 3) {

			yeniIsim = "YESIL";
		} else if (a == 4) {

			yeniIsim = "MAVI";
		} else if (a == 5) {

			yeniIsim = "TURUNCU";
		} else if (a == 6) {

			yeniIsim = "SIYAH";
		} else if (a == 7) {

			yeniIsim = "BEYAZ";
		} else if (a == 8) {

			yeniIsim = "GRI";
		} else if (a == 9) {

			yeniIsim = "LACIVERT";
		} else if (a == 10) {

			yeniIsim = "PEMBE";
		}
		return yeniIsim;
	}

	// -------------------------------------------------------------------

	public void dogruSes() {
		mpTrue = MediaPlayer.create(RenklerTest.this, R.raw.alkis);
		mpTrue.setLooping(false);
		mpTrue.start();

	}

	// -------------------------------------------------------------------

	public void yanlisSes() {
		mpWrong = MediaPlayer.create(RenklerTest.this, R.raw.hatasesi);
		mpWrong.setLooping(false);
		mpWrong.start();
	}
}