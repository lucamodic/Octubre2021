package unlam.edu.ar.pb2;

import java.util.TreeSet;

public abstract class Usuario {
	
	TreeSet <Figurita> figuritasAgregadas; 
	
	public Usuario () {
		this.figuritasAgregadas = new TreeSet<Figurita>(new OrdernarFiguritas());
	}
	
	public TreeSet <Figurita> getFiguritasAgregadas() {
		return this.figuritasAgregadas;
	}
	
	public void setFiguritasAgregadas(TreeSet<Figurita> figuritasAgregadas) {
		this.figuritasAgregadas = figuritasAgregadas;
	}

	public abstract void agregarFigurita(Figurita figurita);
	
	public abstract void buscarCodigo(Figurita figurita) throws CodigoExistente;
	
}
