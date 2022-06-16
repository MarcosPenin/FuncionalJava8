package ej49_predicate;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class Main49 {

	public static void main(String[] args) {

			
		IntPredicate divisiblePor = x -> x % 2 == 0;
	
		System.out.println(divisiblePor.test(4));
		System.out.println(divisiblePor.test(5));
		
		

		BiPredicate<String, String> cadenasIguales = (x, y) -> x.compareToIgnoreCase(y)==0;
			
		System.out.println(cadenasIguales.test("hola", "HOLA"));
		System.out.println(cadenasIguales.test("hrola", "HOLA"));
		

	}
}