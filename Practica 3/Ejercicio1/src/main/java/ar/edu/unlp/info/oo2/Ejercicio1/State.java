package ar.edu.unlp.info.oo2.Ejercicio1;

public abstract class State {

	protected String name;
	
	public State(String name) {
		this.name = name;
	}
	
	public void finish(ToDoItem item) {
		
	}
	
	public void pause(ToDoItem item) {
		throw new RuntimeException("No se puede poner pause estado en " + this.name);
	}

	
	public void start (ToDoItem items) {
		
	}

	public String getName() {
		return name;
	}
	
	
}
