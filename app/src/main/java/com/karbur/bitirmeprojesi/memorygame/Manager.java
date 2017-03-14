package com.karbur.bitirmeprojesi.memorygame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.karbur.bitirmeprojesi.R;

public class Manager extends Activity {
	private static int ROW_COUNT = -1;
	private static int COL_COUNT = -1;
	private Context context;
	protected static Drawable backImage;
	protected static int[][] cards;
	protected static List<Drawable> images;
	protected static Card firstCard;
	protected static Card seconedCard;
	private ButtonListener buttonListener;

	protected static Object lock = new Object();
	int x = 4, y = 3;
	private TableLayout mainTable;
	static UpdateCardsHandler handler;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		handler = new UpdateCardsHandler();
		loadImages();
		setContentView(R.layout.memory);

		backImage = getResources().getDrawable(R.drawable.memorybutton);

		buttonListener = new ButtonListener();

		mainTable = (TableLayout) findViewById(R.id.TableLayout03);

		context = mainTable.getContext();

		newGame(x, y);

	}

	private void newGame(int c, int r) {
		ROW_COUNT = r;
		COL_COUNT = c;

		cards = new int[COL_COUNT][ROW_COUNT];

		TableRow tr = ((TableRow) findViewById(R.id.TableRow03));
		tr.removeAllViews();

		mainTable = new TableLayout(context);
		tr.addView(mainTable);

		for (int y = 0; y < ROW_COUNT; y++) {
			mainTable.addView(createRow(y));
		}

		firstCard = null;
		loadCards();

	}

	private void loadImages() {
		images = new ArrayList<Drawable>();

		images.add(getResources().getDrawable(R.drawable.kucuka));
		images.add(getResources().getDrawable(R.drawable.kucukb));
		images.add(getResources().getDrawable(R.drawable.kucukc));
		images.add(getResources().getDrawable(R.drawable.kucukcc));
		images.add(getResources().getDrawable(R.drawable.kucukd));
		images.add(getResources().getDrawable(R.drawable.kucuke));
		images.add(getResources().getDrawable(R.drawable.kucukf));
		images.add(getResources().getDrawable(R.drawable.kucukg));
		images.add(getResources().getDrawable(R.drawable.kucukh));
		images.add(getResources().getDrawable(R.drawable.kucuki));
		images.add(getResources().getDrawable(R.drawable.kucukii));
		images.add(getResources().getDrawable(R.drawable.kucukj));
		images.add(getResources().getDrawable(R.drawable.kucukk));
		images.add(getResources().getDrawable(R.drawable.kucukl));
		images.add(getResources().getDrawable(R.drawable.kucukm));
		images.add(getResources().getDrawable(R.drawable.kucukn));
		images.add(getResources().getDrawable(R.drawable.kucuko));
		images.add(getResources().getDrawable(R.drawable.kucukoo));
		images.add(getResources().getDrawable(R.drawable.kucukp));
		images.add(getResources().getDrawable(R.drawable.kucukr));
		images.add(getResources().getDrawable(R.drawable.kucuks));
		images.add(getResources().getDrawable(R.drawable.kucukt));
		images.add(getResources().getDrawable(R.drawable.kucuku));
		images.add(getResources().getDrawable(R.drawable.kucukuu));
		images.add(getResources().getDrawable(R.drawable.kucukv));
		images.add(getResources().getDrawable(R.drawable.kucuky));
		images.add(getResources().getDrawable(R.drawable.kucukz));

	}

	public void loadCards() {
		try {
			int size = ROW_COUNT * COL_COUNT;

			Log.i("loadCards()", "size=" + size);

			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int i = 0; i < size; i++) {
				list.add(new Integer(i));
			}

			Random r = new Random();

			for (int i = size - 1; i >= 0; i--) {
				int t = 0;

				if (i > 0) {
					t = r.nextInt(i);
				}

				t = list.remove(t).intValue();
				cards[i % COL_COUNT][i / COL_COUNT] = t % (size / 2);

				Log.i("loadCards()", "card[" + (i % COL_COUNT) + "]["
						+ (i / COL_COUNT) + "]="
						+ cards[i % COL_COUNT][i / COL_COUNT]);
			}
		} catch (Exception e) {
			Log.e("loadCards()", e + "");
		}

	}

	private TableRow createRow(int y) {
		TableRow row = new TableRow(context);
		row.setHorizontalGravity(Gravity.CENTER);

		for (int x = 0; x < COL_COUNT; x++) {
			row.addView(createImageButton(x, y));
		}
		return row;
	}

	private View createImageButton(int x, int y) {
		Button button = new Button(context);
		button.setBackgroundDrawable(backImage);
		button.setId(100 * x + y);
		button.setOnClickListener(buttonListener);
		return button;
	}

}
