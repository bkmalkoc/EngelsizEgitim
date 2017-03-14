package com.karbur.bitirmeprojesi.renkler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.RenklerKatalogu;

public class RenkleriOgrenelim extends Activity {

	Button btnYesil, btnSari, btnKirmizi, btnMavi, btnSiyah, btnBeyaz,
			btnTuruncu, btnLarcivert, btnPembe, btnGri,btnGeri;
	ImageView resimler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.renkleriogrenelim);

		// -----------------------------------------------------------------------

		btnYesil = (Button) findViewById(R.id.btnYesil);
		btnSari = (Button) findViewById(R.id.btnSari);
		btnSiyah = (Button) findViewById(R.id.btnSiyah);
		btnBeyaz = (Button) findViewById(R.id.btnBeyaz);
		btnGri = (Button) findViewById(R.id.btnGri);
		btnPembe = (Button) findViewById(R.id.btnPembe);
		btnTuruncu = (Button) findViewById(R.id.btnTuruncu);
		btnKirmizi = (Button) findViewById(R.id.btnKirmizi);
		btnMavi = (Button) findViewById(R.id.btnMavi);
		btnLarcivert = (Button) findViewById(R.id.btnLarcivert);
		btnGeri = (Button) findViewById(R.id.resimOgrenGeri);
		resimler = (ImageView) findViewById(R.id.ivsayi1);
		
		btnGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentNesnesi2 = new Intent(
						RenkleriOgrenelim.this,
						RenklerKatalogu.class);
				startActivity(intentNesnesi2);

			}
		});
			
		// -----------------------------------------------------------------------
		btnYesil.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkayesil);
			}
		});

		// -----------------------------------------------------------------------
		btnSari.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkasari);
			}
		});

		// -----------------------------------------------------------------------
		btnBeyaz.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkabeyaz);
			}
		});

		// -----------------------------------------------------------------------
		btnSiyah.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkasiyah);
			}
		});

		// -----------------------------------------------------------------------

		btnTuruncu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkaturuncu);
			}
		});

		// -----------------------------------------------------------------------
		btnGri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkagri);
			}
		});

		// -----------------------------------------------------------------------

		btnMavi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkamavi);
			}
		});

		// -----------------------------------------------------------------------
		btnPembe.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkapembe);
			}
		});

		// -----------------------------------------------------------------------

		btnKirmizi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkakirmizi);
			}
		});

		// -----------------------------------------------------------------------
		btnLarcivert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				resimler.setImageResource(R.drawable.arkalacivert);
			}
		});
	}

}
