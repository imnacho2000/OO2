package ar.edu.unlp.info.oo2.Ejercicio1;

public class inProgress extends State {

	public inProgress() {
		super("inProgress");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void finish(ToDoItem item) {
		item.cambiarEstado(new Finished(item));
	}

	@Override
	public void pause(ToDoItem item) {
		item.cambiarEstado(new Paused());
	}

}
