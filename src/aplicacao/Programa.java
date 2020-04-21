package aplicacao;

import java.util.Scanner;

import servicos.ServicoImpressao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		ServicoImpressao<Integer> si = new ServicoImpressao<>();
		ServicoImpressao<String> si = new ServicoImpressao<>();
		
		System.out.print("Quantos valores: ");
		Integer valores = sc.nextInt();
		
		for (int i=0; i<valores; i++) {
			si.adicionaValor(sc.next());
		}
		
		si.imprime();
		
		System.out.println("Primeiro: " + si.primeiro());
		
		sc.close();
	}

}
