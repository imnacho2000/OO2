package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.LocalDateTime;

public class Pending extends State {

	
	public Pending() {
		super("Pending");
		// TODO Auto-generated constructor stub
	}
	
	public void start (ToDoItem item) {
		item.setInicio(LocalDateTime.now());
		item.cambiarEstado(new inProgress());
	}

}
