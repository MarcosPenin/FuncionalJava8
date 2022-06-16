package ej50_calculadoraFuncional;

import java.util.function.BiFunction;

public class Calculadora {

	
	public int operacion(int x, int y, Arithmetic z) {		
		return z.operacion(x, y);
			
	}
	
	public int operacion(int x, int y, BiFunction z) {			
		return (int) z.apply(x, y);
			
	}
	
	
	
	
}
