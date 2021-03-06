package ar.edu.unlp.info.oo2.Ejercicio2;

public class Pedido {
	private Cliente cliente;
	private double montoPedido;
	
	public Pedido(double montoPedido,Cliente cliente) {
		this.montoPedido = montoPedido;
		this.cliente = cliente;
	}
	
	public double monto() {
		return this.montoPedido;
	}
	
	public boolean pagarConMedio(GatewayAdapter medio){
		return medio.pagar(cliente, montoPedido);	
	}
}
