package ej51_stream;

import java.util.stream.Stream;

public class Main51 {

	
	public static void main(String[] args) {
		
		Stream<String> nombres=Stream.of("Pedro","Ana","María","Juan");
		
		nombres.forEach(System.out::println);
		
		
		
		
	}
	
}
