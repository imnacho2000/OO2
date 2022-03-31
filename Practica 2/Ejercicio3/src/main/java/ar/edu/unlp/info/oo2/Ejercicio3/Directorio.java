package ar.edu.unlp.info.oo2.Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Directorio extends FileSystem {
	
	private int contenido;
	private List<FileSystem>archivos = new ArrayList<FileSystem>();
	
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.contenido = 32;
	}
	
	public void agregar(FileSystem dato) {
		this.archivos.add(dato);
	}
	
	
	public int tamanoTotalOcupado() {
		return this.archivos.stream().mapToInt(p -> p.getTamanio()).sum() + this.contenido;
	}
	
	public List<Directorio> getDirectorios(){
		return  this.archivos.stream().filter(d -> d instanceof Directorio).map(d -> (Directorio) d).toList();
	}
	
	public List<Archivo> getArchivos(){
		return  this.archivos.stream().filter(d -> d instanceof Archivo).map(d -> (Archivo) d).toList();
	}
	
	public boolean tieneDirectorios() {
		return this.getDirectorios().size() != 0;
	}
	
	public boolean tieneArchivos() {
		return this.getArchivos().size() != 0;
	}
	
	
	
	public Archivo archivoMasGrande() {
		Archivo archivoMasGrande = null;
	    int tamanoArchivoMasGrande = 0;
	    if ((!tieneArchivos()) && (!tieneDirectorios())) { // no tiene archivos ni directorios
	    	return archivoMasGrande;
	     }
	    else {
	           if ((!tieneArchivos()) && (tieneDirectorios())) { // no tiene archivos pero si directorios	
	        	   for (Directorio d : this.getDirectorios()) {
	                    return d.archivoMasGrande(); 
	                }
	            } else {
	                if (tieneArchivos() && (!tieneDirectorios())) { // si tiene archivos pero no directorios
	                    for (Archivo a : this.getArchivos()) {
	                        if (a.getTamanio() > tamanoArchivoMasGrande) {
	                            tamanoArchivoMasGrande = a.getTamanio();
	                            archivoMasGrande = a;
	                        }
	                    }
	                } else {
	                    if (tieneArchivos() && (tieneDirectorios())) { // si tiene archivos y directorios
	                        for (Archivo a : this.getArchivos()) {
	                            if (a.getTamanio() > tamanoArchivoMasGrande) {
	                                tamanoArchivoMasGrande = a.getTamanio();
	                                archivoMasGrande = a;
	                            }
	                        }
	                        for (Directorio d : this.getDirectorios()) {
	                            return d.archivoMasGrande(); // llamo a la recursion
	                        }
	                    }
	                }
	            }
	        }
	        return archivoMasGrande;
	}
		
	public Archivo archivoMasNuevo() {
		Archivo archivoMasNuevo = null;
        LocalDate fechaArchivoMasNuevo = null;

        if ((!tieneArchivos()) && (!tieneDirectorios())) { // no tiene archivos ni directorios
            return archivoMasNuevo; // seria un caso base
        } else {
            if ((!tieneArchivos()) && (tieneDirectorios())) { // no tiene archivos pero si directorios
                for (Directorio d : this.getDirectorios()) {
                    return d.archivoMasNuevo(); // llamo a la recursion
                }
            } else {
                if (tieneArchivos() && (!tieneDirectorios())) { // si tiene archivos pero no directorios
                    for (Archivo a : this.getArchivos()) {
                        // me fijo si es la primera vez que entro
                        if (fechaArchivoMasNuevo == null) { //me quedo con la fecha del primer archivo
                            fechaArchivoMasNuevo = a.getFecha();
                            archivoMasNuevo = a;
                        } else {
                            if (a.getFecha().isAfter(fechaArchivoMasNuevo)) {
                                fechaArchivoMasNuevo = a.getFecha();
                                archivoMasNuevo = a;
                            }
                        }
                    }
                } else {
                    if (tieneArchivos() && (tieneDirectorios())) { // si tiene archivos y directorios
                        for (Archivo a : this.getArchivos()) {
                            // me fijo si es la primera vez que entro
                            if (fechaArchivoMasNuevo == null) {
                                fechaArchivoMasNuevo = a.getFecha(); 
                                archivoMasNuevo = a;
                            } else {
                                if (a.getFecha().isAfter(fechaArchivoMasNuevo)) {
                                    fechaArchivoMasNuevo = a.getFecha();
                                    archivoMasNuevo = a;
                                }
                            }
                        }
                        for (Directorio d : this.getDirectorios()) {
                            return d.archivoMasNuevo(); // llamo a la recursion
                        }
                    }
                }
            }
        }
        return archivoMasNuevo;
	}

	@Override
	public int getTamanio() {
		return this.tamanoTotalOcupado();
	}
	
}
