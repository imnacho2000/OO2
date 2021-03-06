package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Twitter {
	private Set<Usuario> users;
	
	public Twitter() {
		this.users = new HashSet<Usuario>();
	}
	
	
	public void agregarUsuario(Usuario user) {
		this.users.add(user);
	}
	
	public void eliminarUsuario(String screenName) {
		Usuario userToDelete = this.users.stream().filter(u -> u.getScreenName().equals(screenName)).findFirst().orElse(null);
		if(userToDelete != null) {
			userToDelete.eliminarTweets();
			this.users.remove(userToDelete);
		}
	}
	
	public int listaUsers() {
		return this.users.size();
	}
	
}
