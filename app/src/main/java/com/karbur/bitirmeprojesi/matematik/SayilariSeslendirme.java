package com.karbur.bitirmeprojesi.matematik;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.karbur.bitirmeprojesi.R;

public class SayilariSeslendirme extends Activity {

	public static final int REQUEST_CODE = 1234;
	ListView resultList;
	Button speakButton;
	ViewFlipper vf;
	MediaPlayer mp, mpwrong;
	int count=1;
	boolean deger=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sayilariseslendirme);
		
		speakButton = (Button) findViewById(R.id.btnSayilariSoyle);
		resultList = (ListView) findViewById(R.id.sestenGelenListe);
		vf = (ViewFlipper) findViewById(R.id.viewFlipper1);
		resultList.setVisibility(View.GONE);

		PackageManager pm = getPackageManager();

		List<ResolveInfo> activities = pm.queryIntentActivities(new Intent(
				RecognizerIntent.ACTION_RECOGNIZE_SPEECH), 0);
		if (activities.size() == 0) {
			speakButton.setEnabled(false);
			Toast.makeText(getApplicationContext(), "Baglanti Saglanamadi!",
					Toast.LENGTH_SHORT).show();
		}

		speakButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				
				startVoiceRecognitionActivity();
				if(deger==true){
					count++;
				}
				
			}

		});
	}
		private void startVoiceRecognitionActivity() {

			Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

			intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,

			RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

			intent.putExtra(RecognizerIntent.EXTRA_PROMPT,

			"Ses Tan�ma...");

			startActivityForResult(intent, REQUEST_CODE);
		}
		
		@Override
		protected void onActivityResult(int requestCode, int resultCode, Intent data) {

			mp = MediaPlayer.create(this, R.raw.alkis);
			mpwrong = MediaPlayer.create(this, R.raw.hata);

			if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {

				ArrayList<String> matches = data
						.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

				resultList.setAdapter(new ArrayAdapter<String>(this,

				android.R.layout.simple_list_item_1, matches));

				for (int i = 0; i < resultList.getCount(); i++) {

					if (String.valueOf(count).contains(
							(CharSequence) resultList.getItemAtPosition(i))) {

						mp.setLooping(false);
						mp.start();
						vf.showNext();
						deger=true;
						break;

					} else {

						mpwrong.setLooping(false);
						mpwrong.start();
						deger=false;
					}

				}

				super.onActivityResult(requestCode, resultCode, data);

			}

		}

	}
