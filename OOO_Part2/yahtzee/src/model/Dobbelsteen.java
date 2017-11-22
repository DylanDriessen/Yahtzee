package model;

import java.util.concurrent.ThreadLocalRandom;

public class Dobbelsteen {
	int dobbelsteen;
	
	public Dobbelsteen(int dobbelsteen) {
		this.setDobbelsteen(dobbelsteen);
	}

	public int getDobbelsteen() {
		return dobbelsteen;
	}

	public void setDobbelsteen(int dobbelsteen) {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
		this.dobbelsteen = randomNum;
	}

}
