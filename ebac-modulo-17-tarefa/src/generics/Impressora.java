package generics;

import java.util.ArrayList;
import java.util.List;

public class Impressora <T extends Veiculo> {

	private List<T> l = new ArrayList<>();
	
	public void imprimir() {
		for (T obj : l) {
			System.out.println(obj);
		}
	}
	
	public void adicionar(T obj) {
		l.add(obj);
	}
}
