package ar.edu.unlp.info.oo2.Ejercicio1;

public class RopaDelicada implements programacionDeLavados {

	@Override
	public int programaLavado(Lavarropas lavarropa) {
		lavarropa.inicializarMinutos();
		lavarropa.agregarAgua(100);
		lavarropa.agregarJabon();
		lavarropa.lavar(40);
		lavarropa.vaciarAgua();
		lavarropa.agregarEnjuage();
		lavarropa.enjuaga(15);
		lavarropa.centrifugar(0);
		return lavarropa.getEnjuage() + lavarropa.getCentrifugar() + lavarropa.getLavar();
	}

}
