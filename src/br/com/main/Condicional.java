package br.com.main;

public class Condicional {

	public static void main(String[] args) {
		
		int anoDeLancamento = 2023;
		boolean incluidoNoPlano = false;
		double notaDoFilme = 8.1;
		String tipoPlano = "Simples";
		
		if (anoDeLancamento >= 2022) {
			System.out.println("Lançamento que os clientes estão curtindo");
		} else {
			System.out.println("Filme retrô que vale a pena assistir");
		}
		
		if(incluidoNoPlano == true || tipoPlano.equals("plus")) {
			System.out.println("Filme liberado");
		} else {
			System.out.println("Deve pagar a locação");
		}
		
	}

}