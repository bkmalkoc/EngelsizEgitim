package com.karbur.bitirmeprojesi;

import java.util.Timer;

import com.karbur.bitirmeprojesi.R;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.widget.ImageView;

public class Depo {

	static MediaPlayer mp;
	AnimationDrawable myAnimationDrawable;
	Timer timer= new Timer();
	ImageView resim1;

	// --------------------------------------------------------------------------------------------------
	public static void agacCiz(ImageView agac, int a) {

		if (a == 1) {

			agac.setBackgroundResource(R.drawable.agac1);

		} else if (a == 2) {

			agac.setBackgroundResource(R.drawable.agac2);

		} else if (a == 3) {

			agac.setBackgroundResource(R.drawable.agac3);

		} else if (a == 4) {

			agac.setBackgroundResource(R.drawable.agac4);

		} else if (a == 5) {

			agac.setBackgroundResource(R.drawable.agac5);

		} else if (a == 6) {

			agac.setBackgroundResource(R.drawable.agac6);

		} else if (a == 7) {

			agac.setBackgroundResource(R.drawable.agac7);

		} else if (a == 8) {

			agac.setBackgroundResource(R.drawable.agac8);

		} else if (a == 9) {

			agac.setBackgroundResource(R.drawable.agac9);

		} else if (a == 10) {

			agac.setBackgroundResource(R.drawable.agac10);

		} else if (a == 11) {

			agac.setBackgroundResource(R.drawable.agac11);

		} else if (a == 12) {

			agac.setBackgroundResource(R.drawable.agac12);

		} else if (a == 13) {

			agac.setBackgroundResource(R.drawable.agac13);

		} else if (a == 14) {

			agac.setBackgroundResource(R.drawable.agac14);

		} else if (a == 15) {

			agac.setBackgroundResource(R.drawable.agac15);

		} else if (a == 16) {

			agac.setBackgroundResource(R.drawable.agac16);

		} else if (a == 17) {

			agac.setBackgroundResource(R.drawable.agac17);

		} else if (a == 18) {

			agac.setBackgroundResource(R.drawable.agac18);

		} else if (a == 19) {

			agac.setBackgroundResource(R.drawable.agac19);

		} else if (a == 20) {
			agac.setBackgroundResource(R.drawable.agac20);
		}
	}

	// --------------------------------------------------------------------------------------------------

	public static void cizdir(ImageView resim, int a) {

		if (a == 1) {
			resim.setBackgroundResource(R.drawable.islem1);

		} else if (a == 2) {
			resim.setBackgroundResource(R.drawable.islem2);

		} else if (a == 3) {
			resim.setBackgroundResource(R.drawable.islem3);

		} else if (a == 4) {
			resim.setBackgroundResource(R.drawable.islem4);

		} else if (a == 5) {
			resim.setBackgroundResource(R.drawable.islem5);

		} else if (a == 6) {
			resim.setBackgroundResource(R.drawable.islem6);

		} else if (a == 7) {
			resim.setBackgroundResource(R.drawable.islem7);

		} else if (a == 8) {
			resim.setBackgroundResource(R.drawable.islem8);

		} else if (a == 9) {
			resim.setBackgroundResource(R.drawable.islem9);

		} else if (a == 10) {
			resim.setBackgroundResource(R.drawable.islem10);

		} else if (a == 11) {
			resim.setBackgroundResource(R.drawable.islem11);

		} else if (a == 12) {
			resim.setBackgroundResource(R.drawable.islem12);

		} else if (a == 13) {
			resim.setBackgroundResource(R.drawable.islem13);

		} else if (a == 14) {
			resim.setBackgroundResource(R.drawable.islem14);

		} else if (a == 15) {
			resim.setBackgroundResource(R.drawable.islem15);

		} else if (a == 16) {
			resim.setBackgroundResource(R.drawable.islem16);

		} else if (a == 17) {
			resim.setBackgroundResource(R.drawable.islem17);

		} else if (a == 18) {
			resim.setBackgroundResource(R.drawable.islem18);

		} else if (a == 19) {
			resim.setBackgroundResource(R.drawable.islem19);

		} else if (a == 20) {
			resim.setBackgroundResource(R.drawable.islem20);

		}
	}

	// --------------------------------------------------------------------------------------------------

	public static void sesleriAl(Context c, int a) {

		switch (a) {

		case 1:
			mp = MediaPlayer.create(c, R.raw.a);
			mp.setLooping(false);
			mp.start();
			break;
		case 2:
			mp = MediaPlayer.create(c, R.raw.b);
			mp.setLooping(false);
			mp.start();
			break;
		case 3:
			mp = MediaPlayer.create(c, R.raw.c);
			mp.setLooping(false);
			mp.start();
			break;
		case 4:
			mp = MediaPlayer.create(c, R.raw.cc);
			mp.setLooping(false);
			mp.start();
			break;
		case 5:
			mp = MediaPlayer.create(c, R.raw.d);
			mp.setLooping(false);
			mp.start();
			break;
		case 6:
			mp = MediaPlayer.create(c, R.raw.e);
			mp.setLooping(false);
			mp.start();
			break;
		case 7:
			mp = MediaPlayer.create(c, R.raw.f);
			mp.setLooping(false);
			mp.start();
			break;
		case 8:
			mp = MediaPlayer.create(c, R.raw.g);
			mp.setLooping(false);
			mp.start();
			break;
		case 9:
			mp = MediaPlayer.create(c, R.raw.gg);
			mp.setLooping(false);
			mp.start();
			break;
		case 10:
			mp = MediaPlayer.create(c, R.raw.h);
			mp.setLooping(false);
			mp.start();
			break;
		case 11:
			mp = MediaPlayer.create(c, R.raw.i);
			mp.setLooping(false);
			mp.start();
			break;
		case 12:
			mp = MediaPlayer.create(c, R.raw.ii);
			mp.setLooping(false);
			mp.start();
			break;
		case 13:
			mp = MediaPlayer.create(c, R.raw.j);
			mp.setLooping(false);
			mp.start();
			break;
		case 14:
			mp = MediaPlayer.create(c, R.raw.k);
			mp.setLooping(false);
			mp.start();
			break;
		case 15:
			mp = MediaPlayer.create(c, R.raw.l);
			mp.setLooping(false);
			mp.start();
			break;
		case 16:
			mp = MediaPlayer.create(c, R.raw.m);
			mp.setLooping(false);
			mp.start();
			break;
		case 17:
			mp = MediaPlayer.create(c, R.raw.n);
			mp.setLooping(false);
			mp.start();
			break;
		case 18:
			mp = MediaPlayer.create(c, R.raw.o);
			mp.setLooping(false);
			mp.start();
			break;
		case 19:
			mp = MediaPlayer.create(c, R.raw.oo);
			mp.setLooping(false);
			mp.start();
			break;
		case 20:
			mp = MediaPlayer.create(c, R.raw.p);
			mp.setLooping(false);
			mp.start();
			break;
		case 21:
			mp = MediaPlayer.create(c, R.raw.r);
			mp.setLooping(false);
			mp.start();
			break;
		case 22:
			mp = MediaPlayer.create(c, R.raw.s);
			mp.setLooping(false);
			mp.start();
			break;
		case 23:
			mp = MediaPlayer.create(c, R.raw.ss);
			mp.setLooping(false);
			mp.start();
			break;
		case 24:
			mp = MediaPlayer.create(c, R.raw.t);
			mp.setLooping(false);
			mp.start();
			break;
		case 25:
			mp = MediaPlayer.create(c, R.raw.u);
			mp.setLooping(false);
			mp.start();
			break;
		case 26:
			mp = MediaPlayer.create(c, R.raw.uu);
			mp.setLooping(false);
			mp.start();
			break;
		case 27:
			mp = MediaPlayer.create(c, R.raw.v);
			mp.setLooping(false);
			mp.start();
			break;
		case 28:
			mp = MediaPlayer.create(c, R.raw.y);
			mp.setLooping(false);
			mp.start();
			break;
		case 29:
			mp = MediaPlayer.create(c, R.raw.z);
			mp.setLooping(false);
			mp.start();
			break;
		default:
			break;
		}
	}

	// --------------------------------------------------------------------------------------------------

	public static void harfCizdir(ImageView resim, int a) {

		if (a == 1) {
			resim.setBackgroundResource(R.drawable.buyuka);

		} else if (a == 2) {
			resim.setBackgroundResource(R.drawable.buyukb);

		} else if (a == 3) {
			resim.setBackgroundResource(R.drawable.buyukc);

		} else if (a == 4) {
			resim.setBackgroundResource(R.drawable.buyukcc);

		} else if (a == 5) {
			resim.setBackgroundResource(R.drawable.buyukd);

		} else if (a == 6) {
			resim.setBackgroundResource(R.drawable.buyuke);

		} else if (a == 7) {
			resim.setBackgroundResource(R.drawable.buyukf);

		} else if (a == 8) {
			resim.setBackgroundResource(R.drawable.buyukg);

		} else if (a == 9) {
			resim.setBackgroundResource(R.drawable.buyukgg);

		} else if (a == 10) {
			resim.setBackgroundResource(R.drawable.buyukh);

		} else if (a == 11) {
			resim.setBackgroundResource(R.drawable.buyukii);

		} else if (a == 12) {
			resim.setBackgroundResource(R.drawable.buyuki);

		} else if (a == 13) {
			resim.setBackgroundResource(R.drawable.buyukj);

		} else if (a == 14) {
			resim.setBackgroundResource(R.drawable.buyukk);

		} else if (a == 15) {
			resim.setBackgroundResource(R.drawable.buyukl);

		} else if (a == 16) {
			resim.setBackgroundResource(R.drawable.buyukm);

		} else if (a == 17) {
			resim.setBackgroundResource(R.drawable.buyukn);

		} else if (a == 18) {
			resim.setBackgroundResource(R.drawable.buyuko);

		} else if (a == 19) {
			resim.setBackgroundResource(R.drawable.buyukoo);

		} else if (a == 20) {
			resim.setBackgroundResource(R.drawable.buyukp);
		} else if (a == 21) {
			resim.setBackgroundResource(R.drawable.buyukr);

		} else if (a == 22) {
			resim.setBackgroundResource(R.drawable.buyuks);

		} else if (a == 23) {
			resim.setBackgroundResource(R.drawable.buyukss);

		} else if (a == 24) {
			resim.setBackgroundResource(R.drawable.buyukt);

		} else if (a == 25) {
			resim.setBackgroundResource(R.drawable.buyuku);

		} else if (a == 26) {
			resim.setBackgroundResource(R.drawable.buyukuu);
		} else if (a == 27) {
			resim.setBackgroundResource(R.drawable.buyukv);

		} else if (a == 28) {
			resim.setBackgroundResource(R.drawable.buyuky);

		} else if (a == 29) {
			resim.setBackgroundResource(R.drawable.buyukz);
		}
	}


	
	public static void kucukharfCizdir(ImageView resim, int a) {

		if (a == 1) {
			resim.setBackgroundResource(R.drawable.kucuka);

		} else if (a == 2) {
			resim.setBackgroundResource(R.drawable.kucukb);

		} else if (a == 3) {
			resim.setBackgroundResource(R.drawable.kucukc);

		} else if (a == 4) {
			resim.setBackgroundResource(R.drawable.kucukc);

		} else if (a == 5) {
			resim.setBackgroundResource(R.drawable.kucukd);

		} else if (a == 6) {
			resim.setBackgroundResource(R.drawable.kucuke);

		} else if (a == 7) {
			resim.setBackgroundResource(R.drawable.kucukf);

		} else if (a == 8) {
			resim.setBackgroundResource(R.drawable.kucukg);

		} else if (a == 9) {
			resim.setBackgroundResource(R.drawable.kucukgg);

		} else if (a == 10) {
			resim.setBackgroundResource(R.drawable.kucukh);

		} else if (a == 11) {
			resim.setBackgroundResource(R.drawable.kucukii);

		} else if (a == 12) {
			resim.setBackgroundResource(R.drawable.kucuki);

		} else if (a == 13) {
			resim.setBackgroundResource(R.drawable.kucukj);

		} else if (a == 14) {
			resim.setBackgroundResource(R.drawable.kucukk);

		} else if (a == 15) {
			resim.setBackgroundResource(R.drawable.kucukl);

		} else if (a == 16) {
			resim.setBackgroundResource(R.drawable.kucukm);

		} else if (a == 17) {
			resim.setBackgroundResource(R.drawable.kucukn);

		} else if (a == 18) {
			resim.setBackgroundResource(R.drawable.kucuko);

		} else if (a == 19) {
			resim.setBackgroundResource(R.drawable.kucukoo);

		} else if (a == 20) {
			resim.setBackgroundResource(R.drawable.kucukp);
		} else if (a == 21) {
			resim.setBackgroundResource(R.drawable.kucukr);

		} else if (a == 22) {
			resim.setBackgroundResource(R.drawable.kucuks);

		} else if (a == 23) {
			resim.setBackgroundResource(R.drawable.kucukss);

		} else if (a == 24) {
			resim.setBackgroundResource(R.drawable.kucukt);

		} else if (a == 25) {
			resim.setBackgroundResource(R.drawable.kucuku);

		} else if (a == 26) {
			resim.setBackgroundResource(R.drawable.kucukuu);
		} else if (a == 27) {
			resim.setBackgroundResource(R.drawable.kucukv);

		} else if (a == 28) {
			resim.setBackgroundResource(R.drawable.kucuky);

		} else if (a == 29) {
			resim.setBackgroundResource(R.drawable.kucukz);
		}
	}

	
	// ----------------------------------------------------------------------------

	public static void sesleriAlSayi(Context ct, int ses) {
		switch (ses) {

		case 1:
			mp = MediaPlayer.create(ct, R.raw.sayi1);
			mp.setLooping(false);
			mp.start();
			break;
		case 2:
			mp = MediaPlayer.create(ct, R.raw.sayi2);
			mp.setLooping(false);
			mp.start();
			break;
		case 3:
			mp = MediaPlayer.create(ct, R.raw.sayi3);
			mp.setLooping(false);
			mp.start();
			break;
		case 4:
			mp = MediaPlayer.create(ct, R.raw.sayi4);
			mp.setLooping(false);
			mp.start();
			break;
		case 5:
			mp = MediaPlayer.create(ct, R.raw.sayi5);
			mp.setLooping(false);
			mp.start();
			break;
		case 6:
			mp = MediaPlayer.create(ct, R.raw.sayi6);
			mp.setLooping(false);
			mp.start();
			break;
		case 7:
			mp = MediaPlayer.create(ct, R.raw.sayi7);
			mp.setLooping(false);
			mp.start();
			break;
		case 8:
			mp = MediaPlayer.create(ct, R.raw.sayi8);
			mp.setLooping(false);
			mp.start();
			break;
		case 9:
			mp = MediaPlayer.create(ct, R.raw.sayi9);
			mp.setLooping(false);
			mp.start();
			break;
		case 10:
			mp = MediaPlayer.create(ct, R.raw.sayi10);
			mp.setLooping(false);
			mp.start();
			break;
		case 11:
			mp = MediaPlayer.create(ct, R.raw.sayi11);
			mp.setLooping(false);
			mp.start();
			break;
		case 12:
			mp = MediaPlayer.create(ct, R.raw.sayi12);
			mp.setLooping(false);
			mp.start();
			break;
		case 13:
			mp = MediaPlayer.create(ct, R.raw.sayi13);
			mp.setLooping(false);
			mp.start();
			break;
		case 14:
			mp = MediaPlayer.create(ct, R.raw.sayi14);
			mp.setLooping(false);
			mp.start();
			break;
		case 15:
			mp = MediaPlayer.create(ct, R.raw.sayi15);
			mp.setLooping(false);
			mp.start();
			break;
		case 16:
			mp = MediaPlayer.create(ct, R.raw.sayi16);
			mp.setLooping(false);
			mp.start();
			break;
		case 17:
			mp = MediaPlayer.create(ct, R.raw.sayi17);
			mp.setLooping(false);
			mp.start();
			break;
		case 18:
			mp = MediaPlayer.create(ct, R.raw.sayi18);
			mp.setLooping(false);
			mp.start();
			break;
		case 19:
			mp = MediaPlayer.create(ct, R.raw.sayi19);
			mp.setLooping(false);
			mp.start();
			break;
		case 20:
			mp = MediaPlayer.create(ct, R.raw.sayi20);
			mp.setLooping(false);
			mp.start();
			break;
		case 21:
			mp = MediaPlayer.create(ct, R.raw.yardimci);
			mp.setLooping(false);
			mp.start();
			break;
		case 22:
			mp = MediaPlayer.create(ct, R.raw.tuvalet);
			mp.setLooping(false);
			mp.start();
			break;
		case 23:
			mp = MediaPlayer.create(ct, R.raw.acikma);
			mp.setLooping(false);
			mp.start();
			break;
		case 24:
			mp = MediaPlayer.create(ct, R.raw.su);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 25:
			mp = MediaPlayer.create(ct, R.raw.yesil);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 26:
			mp = MediaPlayer.create(ct, R.raw.sari);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 27:
			mp = MediaPlayer.create(ct, R.raw.beyaz);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 28:
			mp = MediaPlayer.create(ct, R.raw.siyah);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 29:
			mp = MediaPlayer.create(ct, R.raw.turuncu);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 30:
			mp = MediaPlayer.create(ct, R.raw.gri);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 31:
			mp = MediaPlayer.create(ct, R.raw.mavi);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 32:
			mp = MediaPlayer.create(ct, R.raw.pembe);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 33:
			mp = MediaPlayer.create(ct, R.raw.kirmizi);
			mp.setLooping(false);
			mp.start();
			break;
			
			
		case 34:
			mp = MediaPlayer.create(ct, R.raw.lacivert);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 35:
			mp = MediaPlayer.create(ct, R.raw.sol);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 36:
			mp = MediaPlayer.create(ct, R.raw.sag);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 37:
			mp = MediaPlayer.create(ct, R.raw.dur);
			mp.setLooping(false);
			mp.start();
			break;
			
		case 38:
			mp = MediaPlayer.create(ct, R.raw.solsagsol);
			mp.setLooping(false);
			mp.start();
			break;

		default:
			break;
		}
	}

	// ----------------------------------------------------------------------------
	public static void meyveCizdir(ImageView resim,ImageView resim1, int a) {

		if (a == 1) {
			resim.setBackgroundResource(R.drawable.ayva);
			resim1.setBackgroundResource(R.drawable.yaziayva);

		} else if (a == 2) {
			resim.setBackgroundResource(R.drawable.bal);
			resim1.setBackgroundResource(R.drawable.yazibal);

		} else if (a == 3) {
			resim.setBackgroundResource(R.drawable.ceviz);
			resim1.setBackgroundResource(R.drawable.yaziceviz);

		} else if (a == 4) {
			resim.setBackgroundResource(R.drawable.cilek);
			resim1.setBackgroundResource(R.drawable.yazicilek);

		} else if (a == 5) {
			resim.setBackgroundResource(R.drawable.dut);
			resim1.setBackgroundResource(R.drawable.yazidut);

		} else if (a == 6) {
			resim.setBackgroundResource(R.drawable.elma);
			resim1.setBackgroundResource(R.drawable.yazielma);

		} else if (a == 7) {
			resim.setBackgroundResource(R.drawable.findik);
			resim1.setBackgroundResource(R.drawable.yazifindik);

		} else if (a == 8) {
			resim.setBackgroundResource(R.drawable.greyfurt);
			resim1.setBackgroundResource(R.drawable.yazigreyfurt);

		} else if (a == 9) {
			resim.setBackgroundResource(R.drawable.buyukgg);
			resim1.setBackgroundResource(0);

		} else if (a == 10) {
			resim.setBackgroundResource(R.drawable.havuc);
			resim1.setBackgroundResource(R.drawable.yazihavuc);

		} else if (a == 12) {
			resim.setBackgroundResource(R.drawable.ispanak);
			resim1.setBackgroundResource(R.drawable.yaziispanak);

		} else if (a == 11) {
			resim.setBackgroundResource(R.drawable.incir);
			resim1.setBackgroundResource(R.drawable.yaziincir);

		} else if (a == 13) {
			resim.setBackgroundResource(R.drawable.buyukj);
			resim1.setBackgroundResource(0);

		} else if (a == 14) {
			resim.setBackgroundResource(R.drawable.karpuz);
			resim1.setBackgroundResource(R.drawable.yazikarpuz);

		} else if (a == 15) {
			resim.setBackgroundResource(R.drawable.limon);
			resim1.setBackgroundResource(R.drawable.yazilimon);

		} else if (a == 16) {
			resim.setBackgroundResource(R.drawable.muz);
			resim1.setBackgroundResource(R.drawable.yazimuz);

		} else if (a == 17) {
			resim.setBackgroundResource(R.drawable.nar);
			resim1.setBackgroundResource(R.drawable.yazinar);

		} else if (a == 18) {
			resim.setBackgroundResource(R.drawable.orman);
			resim1.setBackgroundResource(R.drawable.yaziorman);

		} else if (a == 19) {
			resim.setBackgroundResource(R.drawable.ordek);
			resim1.setBackgroundResource(R.drawable.yaziordek);

		} else if (a == 20) {
			resim.setBackgroundResource(R.drawable.portakal);
			resim1.setBackgroundResource(R.drawable.yaziportakal);
		} else if (a == 21) {
			resim.setBackgroundResource(R.drawable.recel);
			resim1.setBackgroundResource(R.drawable.yazirecel);

		} else if (a == 22) {
			resim.setBackgroundResource(R.drawable.su);
			resim1.setBackgroundResource(R.drawable.yazisu);

		} else if (a == 23) {
			resim.setBackgroundResource(R.drawable.seftali);
			resim1.setBackgroundResource(R.drawable.yaziseftali);

		} else if (a == 24) {
			resim.setBackgroundResource(R.drawable.tarcin);
			resim1.setBackgroundResource(R.drawable.yazitarcin);

		} else if (a == 25) {
			resim.setBackgroundResource(R.drawable.ucurtma);
			resim1.setBackgroundResource(R.drawable.yaziucurtma);

		} else if (a == 26) {
			resim.setBackgroundResource(R.drawable.uzum);
			resim1.setBackgroundResource(R.drawable.yaziuzum);
		} else if (a == 27) {
			resim.setBackgroundResource(R.drawable.visne);
			resim1.setBackgroundResource(R.drawable.yazivisne);

		} else if (a == 28) {
			resim.setBackgroundResource(R.drawable.yogurt);
			resim1.setBackgroundResource(R.drawable.yaziyogurt);

		} else if (a == 29) {
			resim.setBackgroundResource(R.drawable.zeytin);
			resim1.setBackgroundResource(R.drawable.yazizeytin);
		}
	}
	
	
	
	
	public  void animasyon(final ImageView myAnimation,final int a,final int b,final int c,final int d){
		
		myAnimationDrawable= (AnimationDrawable)myAnimation.getDrawable();
		
		myAnimation.post(
		new Runnable(){
			
		  @Override
		  public void run() {
			  
			  myAnimation.setPadding(a,b,c,d);
			  myAnimationDrawable.start();
		   
		  }
		});
	}

}
