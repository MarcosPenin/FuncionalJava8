package ej46_consumer;

import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main46 {

	public static void main(String[] args) {

		Consumer<LocalDate> printFecha = date -> System.out.println("Hoy es " + date);
		LocalDate today = LocalDate.now();
		printFecha.accept(today);

		// .............................................................

		BiConsumer<Integer, Integer> resta = (x, y) -> System.out.println(x + " - " + y + " = " + (x - y));	
		resta.accept(7, 3);

	}

}
