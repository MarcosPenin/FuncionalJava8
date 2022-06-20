package ej59_flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main59 {
	public static void main(String[] args) {

		List<String> nombres = Arrays.asList("PEDRO", "ANA", "MARIA", "JUAN");

		nombres.stream().flatMap(x -> {
			if (x.startsWith("P")) {
				return Stream.of(x.toUpperCase());
			} else if (x.startsWith("M")) {
				return Stream.of(x.toLowerCase());
			}
			return null;

		}).forEach(System.out::println);

	}
}