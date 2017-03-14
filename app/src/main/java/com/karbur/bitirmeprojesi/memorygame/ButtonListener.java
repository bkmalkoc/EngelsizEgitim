package com.karbur.bitirmeprojesi.memorygame;

import java.util.Timer;
import java.util.TimerTask;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonListener implements OnClickListener {
	@Override
	public void onClick(View v) {

		synchronized (Manager.lock) {
			if (Manager.firstCard != null && Manager.seconedCard != null) {
				return;
			}
			int id = v.getId();
			int x = id / 100;
			int y = id % 100;
			turnCard((Button) v, x, y);
		}

	}

	private void turnCard(Button button, int x, int y) {
		button.setBackgroundDrawable(Manager.images.get(Manager.cards[x][y]));

		if (Manager.firstCard == null) {
			Manager.firstCard = new Card(button, x, y);
		} else {

			if (Manager.firstCard.x == x && Manager.firstCard.y == y) {
				return; // ayni karta tiklandi
			}

			Manager.seconedCard = new Card(button, x, y);

			TimerTask tt = new TimerTask() {

				@Override
				public void run() {
					try {
						synchronized (Manager.lock) {
							Manager.handler.sendEmptyMessage(0);
						}
					} catch (Exception e) {
						Log.e("E1", e.getMessage());
					}
				}
			};

			Timer t = new Timer(false);
			t.schedule(tt, 1300);
		}

	}

}