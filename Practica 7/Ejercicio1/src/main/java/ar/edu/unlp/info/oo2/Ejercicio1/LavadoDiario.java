package ar.edu.unlp.info.oo2.Ejercicio1;

public class LavadoDiario implements programacionDeLavados{

	@Override
	public int programaLavado(Lavarropas lavarropa) {
		lavarropa.inicializarMinutos();
		lavarropa.agregarAgua(50);
		lavarropa.agregarJabon();
		lavarropa.lavar(20);
		lavarropa.vaciarAgua();
		lavarropa.agregarEnjuage();
		lavarropa.enjuaga(7);
		lavarropa.centrifugar(3);
		return lavarropa.getEnjuage() + lavarropa.getCentrifugar() + lavarropa.getLavar();
	}
	
}
