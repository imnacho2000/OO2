package ar.edu.unlp.info.oo2.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> medias;
	
	public MediaPlayer() {
		this.medias = new ArrayList<Media>();
	}
	
	public void agregarReproductores(Media media) {
		this.medias.add(media);
	}
	
	public int listaLength() {
		return this.medias.size();
	}

	public List<Media> getMedias() {
		return medias;
	}
	
	
	
}
