package ar.edu.unlp.info.oo2.Ejercicio3;

public class CuatroGConnection {
	
	private String symb;
	
	public CuatroGConnection() {
		this.symb = "4G Connection";
	}
	
	public String transmit(String data, int crc) {
		return data;
	}
	
	public String getSymb() {
		return this.symb;
	}

	
}
