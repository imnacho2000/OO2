/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter twitter;
	Usuario user;
	Usuario user2;
	
	@BeforeEach
	void setUp() throws Exception {
		user = new Usuario("James");
		user2 = new Usuario("Juan");
		user.crearTweet("Hola");
		user.crearTweet("");
		user.crearTweet("Mundo");
		user2.crearTweet("Hola");
		user2.crearTweet("Juan");
		twitter = new Twitter();
		twitter.agregarUsuario(user);
		twitter.agregarUsuario(user2);
	}
	
	@Test
    public void testUserTwitter() {
        assertEquals(2,twitter.listaUsers());
        twitter.eliminarUsuario("juan");
        assertEquals(2,twitter.listaUsers());
        assertEquals(2,user2.listaTweets());
        twitter.eliminarUsuario("Juan");
        assertEquals(1,twitter.listaUsers());
        assertEquals(0,user2.listaTweets());
	}
	
	@Test
    public void testTweets() {
        assertEquals(2,user.listaTweets());
        Assertions.assertNotNull(user.hacerRetweet("hola", new Tweet("Hola")));
        Assertions.assertNull(user.hacerRetweet("", new Tweet("Hola")));
	}
}
