package servicos;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao<T> {
	
	private List<T> lista = new ArrayList<>();
	
	public void adicionaValor(T valor) {
		lista.add(valor);
	}
	
	public Object primeiro () {
		if (lista.isEmpty()) {
			throw new IllegalStateException("Lista esta vazia");
		}
		return lista.get(0);
	}
	
	public void imprime() {
		System.out.print("[");
		if (!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for (int i=1; i < lista.size(); i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.println("]");
	}
}
