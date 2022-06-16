package ej55_finalMatch;

import java.util.stream.Stream;

public class Main55 {

	public static void main(String[] args) {

		Stream<String> nombres = Stream.of("PEDRO", "ANA", "MARIA", "JUAN");
		boolean match = nombres.map(x -> x).peek(x -> {
			x = x.toLowerCase();
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
		}).anyMatch(x -> x.substring(0, 1).compareTo("P") == 0);
		System.out.println(match);

		
		Stream<String> nombres2 = Stream.of("PEDRO", "ANA", "MARIA", "JUAN");
		boolean noneMatch = nombres2.map(x -> x).peek(x -> {
			x = x.toLowerCase();
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
		}).noneMatch(x -> x.substring(0, 1).compareTo("P") == 0);
		System.out.println(noneMatch);
		
		
		Stream<String> nombres3 = Stream.of("PEDRO", "ANA", "MARIA", "JUAN");
		boolean allMatch = nombres3.map(x -> x).peek(x -> {
			x = x.toLowerCase();
			x = x.substring(0, 1).toUpperCase() + x.substring(1);
		}).allMatch(x -> x.substring(0, 1).compareTo("P") == 0);
		System.out.println(allMatch);
		
		
		
	}
}