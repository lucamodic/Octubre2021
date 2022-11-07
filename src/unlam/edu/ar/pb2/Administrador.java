package unlam.edu.ar.pb2;

import java.util.TreeSet;

public class Administrador extends Usuario {

	private TreeSet <Figurita> figuritasAgregadas; 
	
	public Administrador () {
		this.figuritasAgregadas = new TreeSet<Figurita>(new OrdernarFiguritas());
	}
	
	@Override
	public void agregarFigurita(Figurita figurita) throws CodigoExistente {
		this.buscarCodigo(figurita);
		this.figuritasAgregadas.add(figurita);
	}
	
	public void buscarCodigo(Figurita figurita) throws CodigoExistente {
		for(Figurita figurita1 : this.getFiguritasAgregadas()){
			if(figurita1.getCodigo().compareTo(figurita.getCodigo()) == 0){
				throw new CodigoExistente("El codigo ya existe");
			}
		}
	}
	
	public TreeSet <Figurita> getFiguritasAgregadas() {
		return this.figuritasAgregadas;
	}
	
	public void setFiguritasAgregadas(TreeSet<Figurita> figuritasAgregadas) {
		this.figuritasAgregadas = figuritasAgregadas;
	}

}
