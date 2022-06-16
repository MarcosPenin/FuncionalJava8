package ej52_modifyStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main52 {

	public static void main(String[] args) {

		Stream<String> nombres = Stream.of("PEDRO", "ANA", "MARIA", "JUAN");

		List<String> lista = nombres.map(x -> {
			x = x.toLowerCase();
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
			System.out.println(x);
			return x;
		}).collect(Collectors.toList());
		
		lista.forEach(System.out::println);

	}
}