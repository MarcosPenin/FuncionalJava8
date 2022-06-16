package ej57_intStream;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main57 {
	public static void main(String[] args) {

		Stream<Integer> numeros = Stream.of(1,2,3,4,5);
		int suma=numeros.reduce(0,(x,y)->x+y);
		System.out.println(suma);
		
		IntStream numeros2 = IntStream.of(1,2,3,4,5);
		int suma2=numeros2.sum();
		System.out.println(suma);
		
		
		
		IntStream numeros3=IntStream.range(1,50);
	
		numeros3.limit(50).average();
	
	}
}
