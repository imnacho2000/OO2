package ar.edu.unlp.info.oo2.Ejercicio2;

public class Cliente {
	private String nombre,apellido,CBU,email;
	private double fondos;

	public Cliente(String nombre, String apellido, String CBU, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CBU = CBU;
		this.email = email;
	}
	
	public String getCBU() {
		return this.CBU;
	}

	public String getEmail() {
		return this.email;
	}

}
