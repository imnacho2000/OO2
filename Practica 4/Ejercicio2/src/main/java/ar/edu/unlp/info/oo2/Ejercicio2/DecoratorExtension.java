package ar.edu.unlp.info.oo2.Ejercicio2;

public class DecoratorExtension extends DecoratorFile {

	public DecoratorExtension(File002 dato) {
		super(dato);
	}
	@Override
	String print() {
		// TODO Auto-generated method stub
		return this.getExtension();
	}

}
