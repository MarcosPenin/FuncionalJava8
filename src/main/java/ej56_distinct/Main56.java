package ej56_distinct;

import java.util.stream.Stream;

public class Main56 {

	public static void main(String[] args) {

		Stream<String> nombres = Stream.of("pedro", "pedro", "ana", "maria", "juan");

		nombres.distinct().forEach(x -> {
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
			System.out.println(x);
		});

		Stream<String> nombres2 = Stream.of("pedro", "pedro", "ana", "maria", "juan");

		String name = nombres2.distinct().reduce("", (acumulator, x) -> {
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
			acumulator += x;
			return acumulator;
		});

		System.out.println(name);

	}
}
