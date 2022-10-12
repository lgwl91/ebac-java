package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//Fiz assim pra adiantar a parte de leitura via console que já foi feita no exercício do módulo 12
		Stream<String> str = Stream.of("Lucas-M","Larisa-F","Antonio-M","Joana-F");
		
		List<String> lst = str.filter(p -> p.split("-")[1].equals("F")).collect(Collectors.toList());
		
		//Poderia imprimir assim direto, mas fiz da outra forma pra declarar a lista
		//System.out.println(Arrays.toString(str.filter(p -> p.split("-")[1].equals("F")).toArray()));
		
		lst.forEach(System.out::println);
	}

}
