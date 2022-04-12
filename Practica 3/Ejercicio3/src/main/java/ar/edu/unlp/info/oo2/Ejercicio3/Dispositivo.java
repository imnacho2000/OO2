package ar.edu.unlp.info.oo2.Ejercicio3;

public class Dispositivo {
	
	private Connection connection;
	private Ringer ringer;
	private Strategy crcCalculator;
	private Display display;
	private String datos;
	
	public Dispositivo(String datos) {
		this.datos = datos;
		this.display = new Display();
		this.ringer = new Ringer();
		
	}
	
	public String send(String data) {
		int crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void setConnection(Connection dato) {
		this.connection = dato;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	public void setCalculator(Strategy calculator) {
		this.crcCalculator = calculator;
	}
	
	public String getBytes() {
		return this.datos;
	}
	
	public String getEstado() {
		return this.connection.pict();
	}
	
	
}
