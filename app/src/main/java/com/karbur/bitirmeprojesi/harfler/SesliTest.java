package com.karbur.bitirmeprojesi.harfler;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.Harfler;

public class SesliTest extends Activity {
	int dizi[] = new int[4];
	Random sayi = new Random();
	Random tutulanHarf = new Random();
	Button btnGeri, btnSesTekrar;
	int tutulanDeger, tutulanSayi, ilk, ikinci, ucuncu, dorduncu;
	ImageView i1, i2, i3, i4, i5, i6;
	MediaPlayer mp;
	Timer zamanlayici;
	public Animation animFadeIn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seslitest);

		btnGeri = (Button) findViewById(R.id.btnSesliTestGeri);
		i1 = (ImageView) findViewById(R.id.sesSayi1);
		i2 = (ImageView) findViewById(R.id.sesSayi2);
		i3 = (ImageView) findViewById(R.id.sesSayi3);
		i4 = (ImageView) findViewById(R.id.sesSayi4);
		i5 = (ImageView) findViewById(R.id.imMeyveler);
		i6 = (ImageView) findViewById(R.id.imMeyvelerYazi);
		btnSesTekrar = (Button) findViewById(R.id.btnSesTekrar);
		zamanlayici = new Timer();
		// ---------------------------------------------------------------------------------

		different();
		bastir();
		// ---------------------------------------------------------------------------------
		i1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (tutulanDeger == ilk) {

					mp = MediaPlayer.create(SesliTest.this, R.raw.alkis);
					mp.setLooping(false);
					mp.start();
					Depo.meyveCizdir(i5, i6, tutulanDeger);
					i5.setVisibility(View.VISIBLE);
					i6.setVisibility(View.VISIBLE);

					i2.setVisibility(View.INVISIBLE);
					i3.setVisibility(View.INVISIBLE);
					i4.setVisibility(View.INVISIBLE);

					beklet();

				} else {

					mp = MediaPlayer.create(SesliTest.this, R.raw.hatasesi);
					mp.setLooping(false);
					mp.start();
				}
			}
		});
		// ---------------------------------------------------------------------------------
		i2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (tutulanDeger == ikinci) {

					mp = MediaPlayer.create(SesliTest.this, R.raw.alkis);
					mp.setLooping(false);
					mp.start();

					Depo.meyveCizdir(i5, i6, tutulanDeger);
					i5.setVisibility(View.VISIBLE);
					i6.setVisibility(View.VISIBLE);

					i1.setVisibility(View.INVISIBLE);
					i3.setVisibility(View.INVISIBLE);
					i4.setVisibility(View.INVISIBLE);

					beklet();

				} else {

					mp = MediaPlayer.create(SesliTest.this, R.raw.hatasesi);
					mp.setLooping(false);
					mp.start();
				}
			}
		});
		// ---------------------------------------------------------------------------------
		i3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (tutulanDeger == ucuncu) {
					mp = MediaPlayer.create(SesliTest.this, R.raw.alkis);
					mp.setLooping(false);
					mp.start();

					Depo.meyveCizdir(i5, i6, tutulanDeger);
					i5.setVisibility(View.VISIBLE);
					i6.setVisibility(View.VISIBLE);

					i2.setVisibility(View.INVISIBLE);
					i1.setVisibility(View.INVISIBLE);
					i4.setVisibility(View.INVISIBLE);

					beklet();

				} else {

					mp = MediaPlayer.create(SesliTest.this, R.raw.hatasesi);
					mp.setLooping(false);
					mp.start();
				}
			}
		});
		// ---------------------------------------------------------------------------------
		i4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (tutulanDeger == dorduncu) {

					mp = MediaPlayer.create(SesliTest.this, R.raw.alkis);
					mp.setLooping(false);
					mp.start();
					Depo.meyveCizdir(i5, i6, tutulanDeger);
					i5.setVisibility(View.VISIBLE);
					i6.setVisibility(View.VISIBLE);

					i2.setVisibility(View.INVISIBLE);
					i3.setVisibility(View.INVISIBLE);
					i1.setVisibility(View.INVISIBLE);

					beklet();
				} else {

					mp = MediaPlayer.create(SesliTest.this, R.raw.hatasesi);
					mp.setLooping(false);
					mp.start();
				}
			}
		});

		// ---------------------------------------------------------------------------------

		btnGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intentNesnesi = new Intent(SesliTest.this, Harfler.class);

				startActivity(intentNesnesi);
			}
		});

		// ---------------------------------------------------------------------------------

		btnSesTekrar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Depo.sesleriAl(SesliTest.this, tutulanDeger);

			}
		});
		// ---------------------------------------------------------------------------------
	}

	public void different() {
		int n, flag, count = 0;
		while (count != dizi.length) {
			n = sayi.nextInt(29) + 1;
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

	// ---------------------------------------------------------------------------------

	public void bastir() {

		tutulanDeger = tutulanHarf.nextInt(29) + 1;
		tutulanSayi = sayi.nextInt(4) + 1;

		Depo.sesleriAl(SesliTest.this, tutulanDeger);

		if (tutulanSayi == 1) {

			Depo.harfCizdir(i1, tutulanDeger);
			ilk = tutulanDeger;

		} else {

			if (tutulanDeger != dizi[0]) {
				Depo.harfCizdir(i1, dizi[0]);
				ilk = dizi[0];
			} else {
				while (tutulanDeger == dizi[0]) {
					dizi[0] = sayi.nextInt(29) + 1;
				}
				Depo.harfCizdir(i1, dizi[0]);
				ilk = dizi[0];
			}
		}

		if (tutulanSayi == 2) {

			Depo.harfCizdir(i2, tutulanDeger);
			ikinci = tutulanDeger;

		} else {

			if (tutulanDeger != dizi[1]) {
				Depo.harfCizdir(i2, dizi[1]);
				ikinci = dizi[1];
			} else {
				while (tutulanDeger == dizi[1]) {
					dizi[1] = sayi.nextInt(29) + 1;
				}
				Depo.harfCizdir(i2, dizi[1]);
				ikinci = dizi[1];
			}
		}

		if (tutulanSayi == 3) {

			Depo.harfCizdir(i3, tutulanDeger);
			ucuncu = tutulanDeger;

		} else {

			if (tutulanDeger != dizi[2]) {
				Depo.harfCizdir(i3, dizi[2]);
				ucuncu = dizi[2];
			} else {
				while (tutulanDeger == dizi[2]) {
					dizi[2] = sayi.nextInt(29) + 1;
				}
				Depo.harfCizdir(i3, dizi[2]);
				ucuncu = dizi[2];
			}
		}

		if (tutulanSayi == 4) {

			Depo.harfCizdir(i4, tutulanDeger);
			dorduncu = tutulanDeger;

		} else {

			if (tutulanDeger != dizi[3]) {
				Depo.harfCizdir(i4, dizi[3]);
				dorduncu = dizi[3];
			} else {
				while (tutulanDeger == dizi[3]) {
					dizi[3] = sayi.nextInt(29) + 1;
				}
				Depo.harfCizdir(i4, dizi[3]);
				dorduncu = dizi[3];
			}
		}

	}

	// ---------------------------------------------------------------------------------

	public void beklet() {

		zamanlayici.schedule(new TimerTask() {

			@Override
			public void run() {

				runOnUiThread(new Runnable() {

					@Override
					public void run() {

						different();

						bastir();
						i5.setVisibility(View.INVISIBLE);
						i6.setVisibility(View.INVISIBLE);

						i2.setVisibility(View.VISIBLE);
						i3.setVisibility(View.VISIBLE);
						i1.setVisibility(View.VISIBLE);
						i4.setVisibility(View.VISIBLE);

					}
				});
			}
		}, 3000);

	}

}
