package controller;

public class ThreadSapo extends Thread {
		
		private int sapo;
		
	public ThreadSapo(int sapo) {
		this.sapo = sapo;
	}
	
	public void run() {
		int salto = 0, total = 0, colocacao = 1;
		while(total < 30) {
			salto = (int) (Math.random() * 5);
			total += salto;
			System.out.println("\nO sapo " + sapo + " nesta rodada pulou " + salto + "metros\nDistancia Percorrida: " + total + "metros" );
			if(total >= 30) {
				System.out.println("O sapo " + sapo + " Ficou em: " + colocacao);
				colocacao++;
			}
		}
	}

}
