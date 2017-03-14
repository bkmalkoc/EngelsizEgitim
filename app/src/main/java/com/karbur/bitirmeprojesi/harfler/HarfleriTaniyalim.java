package com.karbur.bitirmeprojesi.harfler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

import com.karbur.bitirmeprojesi.Depo;
import com.karbur.bitirmeprojesi.R;

public class HarfleriTaniyalim extends Activity {

    GridView gv;
    RelativeLayout ly;
    ViewFlipper vf;
    ImageView i1, i2, i3;
    Button vfIleri, vfGeri, btnSayfaGeri;
    int resimDgeri, resimm;
    public Animation animFadeIn;


    // ----------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harfleritaniyalim);

        vf = (ViewFlipper) findViewById(R.id.viewHarfler);
        gv = (GridView) findViewById(R.id.gridHarfler);
        ly = (RelativeLayout) findViewById(R.id.yenilayout);
        i1 = (ImageView) findViewById(R.id.im1);
        i2 = (ImageView) findViewById(R.id.im3);
        i3 = (ImageView) findViewById(R.id.im2);
        vfIleri = (Button) findViewById(R.id.btnIleri);
        vfGeri = (Button) findViewById(R.id.btnSaatTestGeri);
        btnSayfaGeri = (Button) findViewById(R.id.btnHarfTanitimGeri);
        animFadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
        // ----------------------------------------------------------------------------

        ly.setVisibility(View.INVISIBLE);

        gv.setAdapter(new ImageAdapter(this));

        gv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                view(arg2);
                resimDgeri = arg2 + 1;
                vf.setDisplayedChild(arg2);

            }
        });

        vfIleri.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                vf.showNext();
                view(resimDgeri++);
                resimm = resimDgeri;
            }
        });

        // ----------------------------------------------------------------------------

        vfGeri.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                resimm = resimm - 2;
                vf.showPrevious();
                view(resimm);


            }
        });


        btnSayfaGeri.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                ly.setVisibility(View.INVISIBLE);
                gv.setVisibility(View.VISIBLE);
                gv.setEnabled(true);

            }
        });
    }

    // ----------------------------------------------------------------------------

    public void view(int a) {

        switch (a) {
            case 0:

                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.ayva);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyuka);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucuka);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 1);
                break;

            case 1:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.bal);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukb);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukb);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 2);

                break;
            case 2:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.ceviz);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukc);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukc);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 3);

                break;
            case 3:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.cilek);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukcc);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukcc);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 4);

                break;
            case 4:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.dut);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukd);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukd);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 5);

                break;
            case 5:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.elma);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyuke);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucuke);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 6);

                break;
            case 6:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.findik);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukf);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukf);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 7);

                break;
            case 7:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.greyfurt);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukg);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukg);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 8);

                break;
            case 8:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.havuc);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukh);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukh);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 10);

                break;
            case 9:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.ispanak);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyuki);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukii);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 12);

                break;
            case 10:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.incir);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukii);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucuki);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 11);

                break;

            case 11:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.karpuz);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukk);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukk);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 14);
                break;

            case 12:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.limon);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukl);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukl);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 15);
                break;
            case 13:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.muz);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukm);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukm);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 16);
                break;
            case 14:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.nar);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukn);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukn);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 17);
                break;
            case 15:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.orman);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyuko);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucuko);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 18);
                break;
            case 16:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.ordek);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukoo);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukoo);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 19);
                break;
            case 17:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.portakal);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukp);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukp);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 20);
                break;
            case 18:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.recel);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukr);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukr);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 21);

                break;
            case 19:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.su);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyuks);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucuks);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 22);

                break;
            case 20:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.seftali);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukss);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukss);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 23);

                break;
            case 21:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.tarcin);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukt);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukt);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 24);

                break;
            case 22:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.ucurtma);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyuku);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucuku);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 25);

                break;
            case 23:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.uzum);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukuu);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukuu);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 26);

                break;
            case 24:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.visne);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukv);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukv);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 27);

                break;
            case 25:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.yogurt);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyuky);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucuky);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 28);

                break;
            case 26:
                lyGosterImKaybet();
                i1.setBackgroundResource(R.drawable.zeytin);
                imGosterGvInEnabled();
                i2.setImageResource(R.drawable.buyukz);
                i2.startAnimation(animFadeIn);
                i3.setImageResource(R.drawable.kucukz);
                i3.startAnimation(animFadeIn);
                Depo.sesleriAl(HarfleriTaniyalim.this, 29);

                break;
            default:

                ly.setVisibility(View.INVISIBLE);
                gv.setVisibility(View.VISIBLE);
                gv.setEnabled(true);

                break;
        }
    }

    // ----------------------------------------------------------------------------

    public void lyGosterImKaybet() {
        ly.setVisibility(View.VISIBLE);
        i1.setVisibility(View.INVISIBLE);
    }

    // ----------------------------------------------------------------------------

    public void imGosterGvInEnabled() {
        i1.setVisibility(View.VISIBLE);
        gv.setEnabled(false);
    }
    // ----------------------------------------------------------------------------
}
