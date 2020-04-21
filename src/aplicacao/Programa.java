package aplicacao;

import java.util.Scanner;

import servicos.ServicoImpressao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ServicoImpressao si = new ServicoImpressao();
		
		System.out.print("Quantos valores: ");
		Integer valores = sc.nextInt();
		
		for (int i=0; i<valores; i++) {
			si.adicionaValor(sc.nextInt());
		}
		
		si.imprime();
		
		System.out.println("Primeiro: " + si.primeiro());
		
		sc.close();
	}

}
