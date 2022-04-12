package ar.edu.unlp.info.oo2.Ejercicio3;

public class WifiConn implements Connection {
	private String pict;

	public WifiConn() {
		this.pict = "Wi Fi connection";
	}
	
	@Override
	public String sendData(String data, int crc) {
		return data;
	}

	@Override
	public String pict() { 
		return this.pict;
	}
	
	
	
}
