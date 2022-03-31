package ar.edu.unlp.info.oo2.ejercicio1;


public class Tweet {
	
	private String text;
	private Tweet origen;
	
	public Tweet(String text) {
		this.text = text;
	}
	
	public Tweet(String text,Tweet t) {
		this.text = text;
		this.origen = t;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Tweet getOrigen() {
		return origen;
	}

	public void setOrigen(Tweet origen) {
		this.origen = origen;
	}
	
	
}
