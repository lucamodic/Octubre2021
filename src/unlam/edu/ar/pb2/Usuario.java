package unlam.edu.ar.pb2;

import java.util.TreeSet;

public abstract class Usuario {

	public abstract void agregarFigurita(Figurita figurita);

	protected abstract TreeSet <Figurita> getFiguritasAgregadas();
	
}
