package ar.edu.unlp.info.oo2.Ejercicio2;

public class DecoratorPermisos extends DecoratorFile {

	public DecoratorPermisos(File002 dato) {
		super(dato);
		// TODO Auto-generated constructor stub
	}

	@Override
	String print() {
		// TODO Auto-generated method stub
		return this.getPermisos();
	}

}
