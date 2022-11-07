package unlam.edu.ar.pb2;

import java.util.TreeSet;

public class Administrador extends Usuario {

	TreeSet <Figurita> figuritasAgregadas = new TreeSet<Figurita>(new OrdernarFiguritas()); 
	
	@Override
	public void agregarFigurita(Figurita figurita) {
		figuritasAgregadas.add(figurita);
	}
	
	public TreeSet <Figurita> getFiguritasAgregadas(){
		return figuritasAgregadas;
	}

	public void setFiguritasAgregadas(TreeSet<Figurita> figuritasAgregadas) {
		this.figuritasAgregadas = figuritasAgregadas;
	}
	

}
