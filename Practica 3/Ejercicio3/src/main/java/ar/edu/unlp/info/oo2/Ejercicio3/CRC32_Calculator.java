package ar.edu.unlp.info.oo2.Ejercicio3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Strategy {

	public CRC32_Calculator() {
		
	}
	
	@Override
	public int crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		int result = (int) crc.getValue();
		return result;
	}

}
