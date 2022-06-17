package ej58_intStreamStrings;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main58 {

	public static void main(String[] args) {

		Stream<String> nombres = Stream.of("PEDRO", "ANA", "MARIA", "JUAN");

		// nombres.mapToInt(String::length).forEach(System.out::println);

		IntStream numeros = nombres.mapToInt(String::length);
		numeros.forEach(System.out::println);

		Stream<String> nombres2 = Stream.of("PEDRO", "ANA", "MARIA", "JUAN");
		IntStream numeros2 = nombres2.mapToInt(String::length);
		IntSummaryStatistics estadisticas = numeros2.summaryStatistics();
		System.out.println(estadisticas);

	}
}
