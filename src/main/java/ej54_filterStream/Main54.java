package ej54_filterStream;

import java.util.stream.Stream;

public class Main54 {

	public static void main(String[] args) {

		Stream<String> nombres = Stream.of("PEDRO", "ANA", "MARIA", "JUAN");
		nombres.forEach(x -> {
			x = x.toLowerCase();
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
			if (x.charAt(0) == 'J') {
				System.out.println(x);
			}
		});

	}
}