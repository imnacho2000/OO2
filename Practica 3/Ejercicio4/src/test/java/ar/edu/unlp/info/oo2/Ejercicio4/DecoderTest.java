/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio4;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DecoderTest {
	
	Decoder decoder;
	
	Movie Thor = new Movie ( "Thor" , Year.of(2007) , 7.9);
	Movie CapitanAmerica = new Movie ("Capitan America" , Year.of(2016) , 7.8); 
	Movie IronMan = new Movie ("Iron Man" , Year.of(2010) , 7.9);
	Movie Dunkirk = new Movie ("Dunkirk" , Year.of(2017) , 7.9);
	Movie Rambo = new Movie ("Rambo" , Year.of(1979) , 7.8);
	Movie Rocky = new Movie ("Rocky" , Year.of(1976) , 8.4);
	
	@BeforeEach
	void setUp() throws Exception {
		
		Thor.addSimilarMovie(CapitanAmerica);
		Thor.addSimilarMovie(IronMan);
		IronMan.addSimilarMovie(Thor);
		IronMan.addSimilarMovie(CapitanAmerica);
		CapitanAmerica.addSimilarMovie(IronMan);
		CapitanAmerica.addSimilarMovie(Thor);
		Rocky.addSimilarMovie(Rambo);
		Rambo.addSimilarMovie(Rocky);
		
		decoder = new Decoder();
		
		decoder.addMovie(Dunkirk);
		decoder.addMovie(Thor);
		decoder.addMovie(CapitanAmerica);
		decoder.addMovie(IronMan);
		decoder.addMovie(Rambo);
		decoder.addMovie(Rocky);
		
		decoder.addPlayed(Thor);
		decoder.addPlayed(Rocky);
		
	}
	
    @Test
    public void testNewieMovie() {
		decoder.setSuggestionStrategy(new NewesStrategy());
		assertEquals(decoder.sugerir().get(0).getTitle(),"Dunkirk");
		assertEquals(decoder.sugerir().get(1).getTitle(),"Capitan America");
		assertEquals(decoder.sugerir().get(2).getTitle(),"Iron Man");
    }
	
    @Test
    public void testSimilarMovie() {
		decoder.setSuggestionStrategy(new SimilarStrategy());
		assertEquals(decoder.sugerir().get(0).getTitle(),"Capitan America");
		assertEquals(decoder.sugerir().get(1).getTitle(),"Iron Man");
		assertEquals(decoder.sugerir().get(2).getTitle(),"Rambo");
    }
    
    
    @Test
    public void testScore() {
		decoder.setSuggestionStrategy(new ScoreStrategy());
		assertEquals(decoder.sugerir().get(0).getTitle(),"Dunkirk");
		assertEquals(decoder.sugerir().get(1).getTitle(),"Iron Man");
		assertEquals(decoder.sugerir().get(2).getTitle(),"Capitan America");
    }
    
    
}
