package com.karbur.bitirmeprojesi.harfler;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.karbur.bitirmeprojesi.R;

public class ImageAdapter extends BaseAdapter {

	
	
	private Context resimlerinkucukGorunusu;
	
	private Integer resimler[]= {
			
			R.drawable.buyuka,
			R.drawable.buyukb,
			R.drawable.buyukc,
			R.drawable.buyukcc,
			R.drawable.buyukd,
			R.drawable.buyuke,
			R.drawable.buyukf,
			R.drawable.buyukg,
			R.drawable.buyukh,
			R.drawable.buyuki,
			R.drawable.yenii,
			R.drawable.buyukk,
			R.drawable.buyukl,
			R.drawable.buyukm,
			R.drawable.buyukn,
			R.drawable.buyuko,
			R.drawable.buyukoo,
			R.drawable.buyukp,
			R.drawable.buyukr,
			R.drawable.buyuks,
			R.drawable.buyukss,
			R.drawable.buyukt,
			R.drawable.buyuku,
			R.drawable.buyuku,
			R.drawable.buyukv,
			R.drawable.buyuky,
			R.drawable.buyukz,

	};
	
	
	public ImageAdapter(Context c) {
		resimlerinkucukGorunusu=c;
	}
	
	
	@Override
	public int getCount() {
		
		return resimler.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		
		
		
		ImageView imageView ;
		if(arg1==null){
			
			imageView = new ImageView(resimlerinkucukGorunusu);
			imageView.setLayoutParams(new GridView.LayoutParams(180,180));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(20, 20, 20, 20);
			
			
			
		}else{
			
			imageView = (ImageView) arg1;
		}
		
		imageView.setImageResource(resimler[arg0]);
		return imageView;
		
	}

}
