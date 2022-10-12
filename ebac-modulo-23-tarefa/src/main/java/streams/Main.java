package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<String> str = Stream.of("Lucas-M","Larisa-F","Antonio-M","Joana-F");
		
		List<String> lst = str.filter(p -> p.split("-")[1].equals("F")).collect(Collectors.toList());
		
		lst.forEach(System.out::println);
	}

}