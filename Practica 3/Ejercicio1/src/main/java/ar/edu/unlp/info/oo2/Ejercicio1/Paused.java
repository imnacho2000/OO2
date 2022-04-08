package ar.edu.unlp.info.oo2.Ejercicio1;

public class Paused extends State{
	

	public Paused() {
		super("Paused");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void finish(ToDoItem item) {
		item.cambiarEstado(new Finished(item));
	}

	@Override
	public void pause(ToDoItem item) {
		item.cambiarEstado(new inProgress());
	}


}
