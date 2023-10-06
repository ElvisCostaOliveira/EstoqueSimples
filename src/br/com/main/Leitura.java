package br.com.main;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		
		Scanner entradaInt = new Scanner(System.in);
		Scanner entradaStr = new Scanner(System.in);
		
		System.out.println("Digite seu filme favorito ");
		String filme = entradaStr.nextLine();
		
		System.out.println("Digite o ano de lançamento: ");
		int anoDeLancameto = entradaInt.nextInt();
		
		System.out.println("Digite a avaliação: ");
		Double avaliacao = entradaInt.nextDouble();
		
		
		
		System.out.println("O nome do filme é: " + filme + " ano de lançamento " + anoDeLancameto + " e a avaliação é " + avaliacao);
	}

}
