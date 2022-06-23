package ar.edu.unlp.info.oo2.Ejercicio2;

public class DineroMailGatewayAdapter implements GatewayAdapter {
	private DineroMailGateway dinero;
	
	public DineroMailGatewayAdapter(DineroMailGateway dinero) {
		this.dinero = dinero;
	}

	@Override
	public boolean pagar(Cliente cliente, double unMonto) {
		return this.dinero.realizarPagoParaEMail(cliente.getEmail(), unMonto);
	}
	
	
}
