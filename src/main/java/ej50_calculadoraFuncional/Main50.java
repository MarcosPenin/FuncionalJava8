package ej50_calculadoraFuncional;

import java.util.function.BiFunction;

public class Main50 {
	public static void main(String[] args) {

		Arithmetic suma = (x, y) -> x + y;
		Arithmetic resta = (x, y) -> x - y;

		Calculadora c = new Calculadora();

		System.out.println(c.operacion(4, 5, suma));
		System.out.println(c.operacion(4, 5, resta));

//--------------------------------------------------------------------------

		BiFunction<Integer, Integer, Integer> sumaBiFunc = (x, y) -> x + y;
		System.out.println(c.operacion(4, 5, sumaBiFunc));

	}
}