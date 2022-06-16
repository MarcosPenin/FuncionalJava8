package ej47_supplier;

public class PersonaJava8 {

	private String nombre;
	private String apellido;

	public PersonaJava8() {}
	
	public PersonaJava8(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
