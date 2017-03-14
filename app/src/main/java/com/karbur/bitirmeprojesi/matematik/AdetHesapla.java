package com.karbur.bitirmeprojesi.matematik;

import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.R;
import com.karbur.bitirmeprojesi.egitsel.MatematikKategorileri;

public class AdetHesapla extends Activity {

	Button btnSayi1, btnSayi2, btnSayi3, btnAdetHesaplaGeri;
	public int tutulanbtnSayisi = 0;
	Random sayi = new Random();
	public int dizi[] = new int[4];
	MediaPlayer mpTrue,mpWrong;
	GridView grid;
	Intent intentNesnesi;
	Animation animFadeIn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kacadetvar);

		
		btnAdetHesaplaGeri = (Button) findViewById(R.id.btnAdetHesaplaGeri);
		btnSayi1 = (Button) findViewById(R.id.btnsayi1);
		btnSayi2 = (Button) findViewById(R.id.btnSayi2);
		btnSayi3 = (Button) findViewById(R.id.btnSayi3);
		grid  = (GridView) findViewById(R.id.gridView1);
		animFadeIn=AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
		
		different();
		sayiUret();
		loadApps();

		grid.setAdapter(new AppsAdapter());

		bastir(grid);

		btnSayi1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (String.valueOf(dizi[0]).contains(btnSayi1.getText())) {
					
					mpTrue = MediaPlayer.create(AdetHesapla.this, R.raw.alkis);
					mpTrue.setLooping(false);
					mpTrue.start();
					
					different();
					sayiUret();
					loadApps();

					grid.setAdapter(new AppsAdapter());

					bastir(grid);

				} else {
					mpWrong = MediaPlayer.create(AdetHesapla.this, R.raw.hatasesi);
					mpWrong.setLooping(false);
					mpWrong.start();
					
					return;

				}

			}
		});
		
	//----------------------------------------------------------------------------
		
		btnSayi2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (String.valueOf(dizi[0]).contains(btnSayi2.getText())) {
					
					mpTrue = MediaPlayer.create(AdetHesapla.this, R.raw.alkis);
					mpTrue.setLooping(false);
					mpTrue.start();
					
					different();
					sayiUret();
					loadApps();

					grid.setAdapter(new AppsAdapter());

					bastir(grid);

				} else {
					mpWrong = MediaPlayer.create(AdetHesapla.this, R.raw.hatasesi);
					mpWrong.setLooping(false);
					mpWrong.start();

				}

			}
		});
		
		//----------------------------------------------------------------------------
		
		btnSayi3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (String.valueOf(dizi[0]).contains(btnSayi3.getText())) {
					
					mpTrue = MediaPlayer.create(AdetHesapla.this, R.raw.alkis);
					mpTrue.setLooping(false);
					mpTrue.start();
					
					different();
					sayiUret();
					loadApps();

					grid.setAdapter(new AppsAdapter());

					bastir(grid);

				} else {
					mpWrong = MediaPlayer.create(AdetHesapla.this, R.raw.hatasesi);
					mpWrong.setLooping(false);
					mpWrong.start();

				}

			}
		});

		//----------------------------------------------------------------------------
		
		btnAdetHesaplaGeri.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intentNesnesi = new Intent(AdetHesapla.this,
						MatematikKategorileri.class);
				startActivity(intentNesnesi);

			}
		});

		
		//----------------------------------------------------------------------------
	}

	public void sayiUret() {
		tutulanbtnSayisi = sayi.nextInt(3) + 1;
	}

	private List<ResolveInfo> mApps;

	private void loadApps() {
		Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
		mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);

		mApps = getPackageManager().queryIntentActivities(mainIntent, 0);

	}

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

	public void bastir(GridView grid) {

		if (tutulanbtnSayisi == 1) {
			btnSayi1.setText("" + (grid.getCount()));

		} else {
			btnSayi1.setText("" + dizi[1]);
		}
		if (tutulanbtnSayisi == 2) {
			btnSayi2.setText("" + (grid.getCount()));

		} else {
			btnSayi2.setText("" + dizi[2]);
		}
		if (tutulanbtnSayisi == 3) {
			btnSayi3.setText("" + (grid.getCount()));

		} else {
			btnSayi3.setText("" + dizi[3]);
		}
	}

	public class AppsAdapter extends BaseAdapter {

		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i = new ImageView(AdetHesapla.this);

			i.setImageResource(R.drawable.balon);
			i.startAnimation(animFadeIn);
			i.setScaleType(ImageView.ScaleType.FIT_CENTER);
			final int w = (int) (320 * getResources().getDisplayMetrics().density + 1.5f);
			i.setLayoutParams(new GridView.LayoutParams(w, w));
			return i;

		}

		public final int getRandom() {
			int rNumber = (int) (Math.random() * 20 + 1);
			return rNumber;
		}

		public final int getCount() {
			return Math.min(dizi[0], mApps.size());

		}

		public final Object getItem(int position) {
			return mApps.get(position % mApps.size());
		}

		public final long getItemId(int position) {
			return position;
		}

	}
	
}