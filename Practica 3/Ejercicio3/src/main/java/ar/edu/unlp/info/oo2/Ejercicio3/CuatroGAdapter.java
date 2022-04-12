package ar.edu.unlp.info.oo2.Ejercicio3;

public class CuatroGAdapter implements Connection{
	
	private CuatroGConnection GConnection;
	
	public CuatroGAdapter() {
		GConnection = new CuatroGConnection();
	}
	
	@Override
	public String sendData(String data, int crc) {
		return this.GConnection.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.GConnection.getSymb();
	}

}
