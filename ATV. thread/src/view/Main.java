package view;
import java.lang.Math;
import controller.threadVetor;
public class Main {

	public static void main(String[] args) {


		int[] vetor = new int[1000];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i=1; i<=2;i++) {
			
		threadVetor tredV= new threadVetor (i,vetor);
		tredV.start();
		}
	}
}
