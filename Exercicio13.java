package aula19_Arrays;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * determine a soma dos elementos armazenados neste vetor que são múltiplos de 5
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];

		int soma = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor para a posicao: " + i);
			vetorA[i] = ler.nextInt();
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma dos multiplos de 5 = " + soma);
	}
}
