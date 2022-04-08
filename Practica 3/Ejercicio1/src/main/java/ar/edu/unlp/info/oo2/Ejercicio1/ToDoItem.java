package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private State estado;
	private List<String>comments;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	
	
	public ToDoItem(String name) {
		this.comments = new ArrayList<String>();
		this.estado = new Pending();
	}
	
	public void cambiarEstado(State estado) {
		this.estado = estado;
	}
	
	
	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	
	public void start() {
		this.estado.start(this);
	}
	
	public void togglePause() {
		this.estado.pause(this);
	}
	
	public void finish() {
		this.estado.finish(this);
	}
	
	
	public void addComment(String comment) {
		if(estado.getName() != "Finished") {			
			this.comments.add(comment);
		}
	}
	
	
	public Duration workedTime() {
		if(this.getInicio() == null) {
			throw new RuntimeException("No hay inicio porque el estado es " + this.estado.getName());
		}
		else if(fin != null) {			
			return Duration.between(inicio, fin);
		}
		return Duration.between(inicio, LocalDateTime.now());
	}
	
	public String getName() {
		return this.estado.getName();
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		
		this.comments = comments;
	}
	
	
	
}
