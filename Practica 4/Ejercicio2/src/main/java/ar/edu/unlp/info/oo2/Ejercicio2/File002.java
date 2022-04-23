package ar.edu.unlp.info.oo2.Ejercicio2;

import java.time.LocalDate;

public interface File002 {
	
		public String prettyString();
		
		public String getNombre();
		public String getExtension();
		public String getPermisos();
		
		public Double getTamanio();
		
		public LocalDate getFechaCreacion();
		public LocalDate getFechaModificacion();
}
