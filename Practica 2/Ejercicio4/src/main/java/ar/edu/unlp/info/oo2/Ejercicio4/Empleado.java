package ar.edu.unlp.info.oo2.Ejercicio4;

public abstract class Empleado {
	
	public abstract double getAdicional();
	public abstract double getBasico();
	
	public  double sueldo() {
		return this.getBasico() + this.getAdicional() - this.descuento();
	};
	
	public double descuento() {
		return (this.getBasico()  * 0.13) + (this.getAdicional() * 0.05);
	}
	
}
