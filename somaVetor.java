package arranjoSomaVect;

import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter em cada Vetor ? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores do Vetor A : " + i + " ");
			vetorA[i] = sc.nextInt();
		}
		System.out.println("================================");
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite os valores do Vetor B : " + i + " ");
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("RESULTADOS : ");
		int[] soma = new int[vetorA.length];
		for (int i = 0; i < soma.length; i++) {
			soma[i] = vetorA[i] + vetorB[i];
			System.out.println();
			System.out.println(soma[i]);
		}
	}
}
