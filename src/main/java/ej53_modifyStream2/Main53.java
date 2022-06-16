package ej53_modifyStream2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main53 {

	public static void main(String[] args) {

		Stream<String> nombres = Stream.of("pedro", "ana", "maria", "juan");

		List<String> lista = nombres.map(x -> {
			x = x.toUpperCase();
			x = x.substring(0, 1).toLowerCase() + x.substring(1);
			System.out.println(x);
			return x;
		}).map(x -> {
			x = x.toLowerCase();
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
			System.out.println(x);
			return x;
		}).collect(Collectors.toList());

		lista.forEach(System.out::println);

	}
}