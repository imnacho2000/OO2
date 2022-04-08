package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.LocalDateTime;

public class Finished extends State {

	public Finished(ToDoItem item) {
		super("Finished");
		item.setFin(LocalDateTime.now());
	}


}
