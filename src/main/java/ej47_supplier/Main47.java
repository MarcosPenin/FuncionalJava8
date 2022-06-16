package ej47_supplier;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main47 {

	public static void main(String[] args) {
		PersonaJava8 p = new PersonaJava8("Pedro", "Paramo");

		BiConsumer<PersonaJava8, String> cambiarNombre = (persona, nombre) -> persona.setNombre(nombre);
		cambiarNombre.accept(p, "Pablo");

		Consumer<String> imprimir = palabra -> System.out.println(palabra);

		ArrayList<String> palabras = new ArrayList<>();
		palabras.add("uno");
		palabras.add("dos");
		palabras.add("tres");
		palabras.add("cuatro");
		palabras.add("cinco");

		for (String x : palabras) {
			imprimir.accept(x);
		}

		Supplier<Double> aleatorio = () -> Math.floor(Math.random() * 100);
		System.out.println(aleatorio.get());
		
		
		Supplier<PersonaJava8> crearPersona = PersonaJava8::new;
		PersonaJava8 p2= crearPersona.get();
		cambiarNombre.accept(p2, "Ana");
		
		System.out.println(p2.getNombre());

	}
}
