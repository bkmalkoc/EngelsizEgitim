package com.karbur.bitirmeprojesi.memorygame;

import android.os.Handler;
import android.os.Message;
import android.view.View;

public class UpdateCardsHandler extends Handler {
	@Override
	public void handleMessage(Message msg) {
		synchronized (Manager.lock) {
			checkCards();
		}
	}

	public void checkCards() {

		if (Manager.cards[Manager.seconedCard.x][Manager.seconedCard.y] == Manager.cards[Manager.firstCard.x][Manager.firstCard.y]) {
			Manager.firstCard.button.setVisibility(View.INVISIBLE);
			Manager.seconedCard.button.setVisibility(View.INVISIBLE);
		} else {
			Manager.seconedCard.button.setBackgroundDrawable(Manager.backImage);
			Manager.firstCard.button.setBackgroundDrawable(Manager.backImage);
		}

		Manager.firstCard = null;
		Manager.seconedCard = null;

	}

}
