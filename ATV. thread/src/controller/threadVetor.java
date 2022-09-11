package controller;


public class threadVetor extends Thread {

	private int numero;
	private int[] vet;

	public threadVetor(int numero, int[] vet) {

		this.numero = numero;
		this.vet = vet;
	}

	@Override
	public void run() {

		double TempoF = 0, TempoI = 0,TempoT;
		if ((numero % 2) == 0) {
			TempoI = System.nanoTime();
			for (int i = 0; i < vet.length; i++) {
			}
			TempoF = System.nanoTime();
			 TempoT = (TempoF - TempoI) / Math.pow(10, 9);
			System.out.println( "Tempo para percorrer vetor de 1000 com for" + TempoT + "seg");
		} else {
			TempoI=System.nanoTime();
			for(int ForV: vet) {				
			}
			TempoF=System.nanoTime();
			TempoT=(TempoF-TempoI) / Math.pow(10, 9);
			System.out.println( "Tempo para percorrer vetor de 1000 com forEach: " + TempoT + "s");
		}
	}
}