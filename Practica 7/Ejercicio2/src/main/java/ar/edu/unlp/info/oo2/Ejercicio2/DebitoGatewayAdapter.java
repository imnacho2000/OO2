package ar.edu.unlp.info.oo2.Ejercicio2;

public class DebitoGatewayAdapter implements GatewayAdapter {
	private DebitoGateway debito;
	
	public DebitoGatewayAdapter(DebitoGateway debito) {
		this.debito = debito;
	}
	
	@Override
	public boolean pagar(Cliente cliente, double unMonto) {
		return this.debito.pagarMontoConCBU(unMonto,cliente.getCBU());
	}

}
