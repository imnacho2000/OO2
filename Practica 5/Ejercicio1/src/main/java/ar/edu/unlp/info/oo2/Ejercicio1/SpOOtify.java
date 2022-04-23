	package ar.edu.unlp.info.oo2.Ejercicio1;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;
	
	public class SpOOtify {
		private Usuario user;
		private ArrayList<Autor> autor; 
		
		public SpOOtify() {
			this.autor = new ArrayList<>();
		}
		
		public SpOOtify(ArrayList<Autor> autor) {
			this.autor = autor;
		}
		
		public void agregarAutor(Autor dato) {
			this.autor.add(dato);
		}
		
		public List<Tema> buscar(String dato){
			return this.autor.stream().flatMap(p -> p.buscar(dato.toLowerCase()).stream()).collect(Collectors.toList());
		}
	
		
	}
