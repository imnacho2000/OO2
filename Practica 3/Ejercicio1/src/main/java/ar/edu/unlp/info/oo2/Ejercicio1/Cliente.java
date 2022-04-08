package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<ToDoItem> item;
	
	public Cliente() {
		this.item = new ArrayList<ToDoItem>();
	}
	
	public void agregarAcciones(ToDoItem dato) {
		this.item.add(dato);
	}

	public List<ToDoItem> getItem() {
		return item;
	}

	public void setItem(List<ToDoItem> item) {
		this.item = item;
	}
	
	
}


