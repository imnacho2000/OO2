/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpOOtifyTest {
	
	SpOOtify spoti = new SpOOtify();
	Usuario user1 = new Usuario("Ignacio");
	
	@BeforeEach
	void setUp() throws Exception{
		
		// EMINEM
		
		Tema s1 = new Tema("The Real Slim Shady");
		Tema s2 = new Tema("Stan");
		Album a1 = new Album("The Marshall Mathers LP");
		a1.agregarTema(s1);
		a1.agregarTema(s2);
		

		Tema s3 = new Tema("Just Lose It");
		Tema s4 = new Tema("Lose Yourself");
		Album a2 = new Album("Just Lose It");
		a2.agregarTema(s3);
		a2.agregarTema(s4);

		Autor eminem = new Autor("Eminem");
		eminem.agregarAlbum(a1);
		eminem.agregarAlbum(a2);

		// THE CURE
		
		Tema st1 = new Tema("High");
		Tema st2 = new Tema("Friday im in love");
		Album tc1 = new Album("Wish"); 
		Autor thecure = new Autor("The cure");
		tc1.agregarTema(st1);
		tc1.agregarTema(st2);
		thecure.agregarAlbum(tc1);

		// DUA LIPA BB <3

		Tema sd1 = new Tema("Physical");
		Tema sd2 = new Tema("Levitating");
		Album d1 = new Album("Future nostalgia");
		Autor dualipa = new Autor("Dua Lipa"); 
		d1.agregarTema(sd1);
		d1.agregarTema(sd2);
		dualipa.agregarAlbum(d1);
		
		spoti.agregarAutor(eminem);
		spoti.agregarAutor(thecure);
		spoti.agregarAutor(dualipa);
		
		
	}
	
	@Test
	public void searchArtist(){
		assertEquals(2,spoti.buscar("Dua Lipa").size());
	}
	
	@Test
	public void searchSubString(){
		assertEquals(4,spoti.buscar("the").size());
	}

	@Test
	public void searchSingleSong(){
		assertEquals(1, spoti.buscar("Stan").size());
	}

	@Test
	public void searchNotFound(){
		assertEquals(0, spoti.buscar("Metallica").size());
	}

	@Test
	public void testUsuario() {
		user1.agregarCancion(new Tema("The Real Slim Shady"));
		user1.agregarCancion(new Tema("Levitating"));
		assertEquals(2,user1.getMyMusic().size());
		user1.eliminarCancion("Levitating");
		assertEquals(1,user1.getMyMusic().size());
	}
	
}
