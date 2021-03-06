/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	
	MediaPlayer mediaPlayer;
	Audio audio;
	VideoFile videoFile;
	VideoStreamAdapter videoStreamAdapter;
	VideoStream videoStream;
	
	@BeforeEach
	void setUp() throws Exception {
		
		videoStream = new VideoStream();
		mediaPlayer = new MediaPlayer();
		audio = new Audio();
		videoFile = new VideoFile();
		videoStreamAdapter = new VideoStreamAdapter(videoStream);
		
		mediaPlayer.agregarReproductores(audio);
		mediaPlayer.agregarReproductores(videoFile);
		mediaPlayer.agregarReproductores(videoStreamAdapter);
		
	}
    @Test
    public void testTodo() {
    	assertEquals(3,mediaPlayer.listaLength());
    	for(Media n: mediaPlayer.getMedias()) {
    		n.play();
    	}
    }
    
}
