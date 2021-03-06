package ar.edu.unlp.info.oo2.Ejercicio1;

public class RopaMuySucia implements programacionDeLavados   {

	@Override
	public int programaLavado(Lavarropas lavarropa) {
		lavarropa.inicializarMinutos();
		lavarropa.agregarAgua(100);
		lavarropa.agregarJabon();
		lavarropa.lavar(100);
		lavarropa.vaciarAgua();
		lavarropa.agregarJabon();
		lavarropa.lavar(30);
		lavarropa.vaciarAgua();
		lavarropa.agregarEnjuage();
		lavarropa.enjuaga(15);
		lavarropa.centrifugar(10);
		return lavarropa.getEnjuage() + lavarropa.getCentrifugar() + lavarropa.getLavar();
	}

}
