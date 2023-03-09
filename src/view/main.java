package view;

import controller.ThreadSapo;

public class main {

	public static void main(String[] args) {
				
		for(int sapo = 1; sapo < 6; sapo++) {
		Thread ThreadSapo = new ThreadSapo(sapo);
		ThreadSapo.start();
		}
	}
}