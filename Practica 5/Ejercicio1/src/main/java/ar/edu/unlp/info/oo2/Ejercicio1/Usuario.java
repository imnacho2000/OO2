package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	 private List<Tema> MyMusic;
	 private String nombre;
	 
	 public Usuario(String nombre) {
		 this.nombre = nombre;
		 this.MyMusic = new ArrayList<Tema>();
	 }
	 
	 public String getNombre() {
		 return nombre;
	 }
	 
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	 public void agregarCancion(Tema dato) {
		 this.MyMusic.add(dato);
	 }
	 
	 
	 
	 public List<Tema> getMyMusic() {
		return MyMusic;
	}

	public void setMyMusic(List<Tema> myMusic) {
		MyMusic = myMusic;
	}

	public void eliminarCancion(String tema) {
		 this.MyMusic.removeIf(t -> t.getNombre().equals(tema.toLowerCase()));
	 }

	 
}
