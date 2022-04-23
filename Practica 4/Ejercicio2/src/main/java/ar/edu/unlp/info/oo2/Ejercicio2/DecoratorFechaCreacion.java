package ar.edu.unlp.info.oo2.Ejercicio2;

public class DecoratorFechaCreacion extends DecoratorFile {

	public DecoratorFechaCreacion(File002 dato) {
		super(dato);
		// TODO Auto-generated constructor stub
	}

	@Override
	String print() {
		// TODO Auto-generated method stub
		return this.getFechaCreacion().toString();
	}

}
