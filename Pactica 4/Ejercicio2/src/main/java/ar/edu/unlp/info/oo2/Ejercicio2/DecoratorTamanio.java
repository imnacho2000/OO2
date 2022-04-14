package ar.edu.unlp.info.oo2.Ejercicio2;

public class DecoratorTamanio extends DecoratorFile {

	public DecoratorTamanio(File002 dato) {
		super(dato);
		// TODO Auto-generated constructor stub
	}

	@Override
	String print() {
		// TODO Auto-generated method stub
		return this.getTamanio().toString();
	}

}
