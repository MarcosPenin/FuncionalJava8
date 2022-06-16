package ej48_function; 

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main48 {

	public static void main(String[] args) {
		
		double d1=20;
		double d2=10;
		
		Function<Double, Double> aleatorio = x -> Math.floor(Math.random() * x);
		System.out.println(aleatorio.apply(d1));

		Function<String, String> mayusculas = x -> x.toUpperCase();
		System.out.println(mayusculas.apply("hola"));

		BiFunction<Double, Double, Double> mayorMenor = (x, y) -> {
			if (x > y) {
				System.out.println(x+ " es mayor");
				return Math.floor(Math.random() * x) + y;

			} else {
				System.out.println(y+ "es mayor");
				return Math.floor(Math.random() * y) + x;
			}

		};

		
		System.out.println(mayorMenor.apply(d1,d2));
	}
}
