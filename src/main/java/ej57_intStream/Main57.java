package ej57_intStream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main57 {
	public static void main(String[] args) {

		Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
		int suma = numeros.reduce(0, (x, y) -> x + y);
		System.out.println(suma);

		IntStream numeros2 = IntStream.of(1, 2, 3, 4, 5);
		System.out.println(numeros2.sum());

		IntStream numeros3 = IntStream.rangeClosed(1, 50);
/*
		IntStream.generate(() -> {
			return (int) (Math.random() * 50);
		}).limit(50).average().ifPresent(System.out::println);
*/
		
		List<Integer> random = numeros3.map(x -> ThreadLocalRandom.current().nextInt(51 - x)).boxed()
				.collect(Collectors.toList());

		int sum = random.stream().mapToInt(Integer::intValue).sum();
		OptionalInt max = (OptionalInt) random.stream().mapToInt(Integer::intValue).max();
		OptionalInt min = random.stream().mapToInt(Integer::intValue).min();
		OptionalDouble average = random.stream().mapToInt(Integer::intValue).average();
		long count = random.stream().mapToInt(Integer::intValue).count();

		System.out.println("Suma: " + sum + "     Maximo: " + max + "       Minimo: " + min + "      Average: "
				+ average + "       Count: " + count);

	}
}
