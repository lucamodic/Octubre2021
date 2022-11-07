package unlam.edu.ar.pb2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class UsuarioFinal extends Usuario {

	private LinkedList <Figurita> figuritas; 
	private TreeSet <Figurita> figuritasPegadas; 

	
	public UsuarioFinal() {
		this.figuritas = new LinkedList<Figurita>();
		this.figuritasPegadas = new TreeSet<Figurita>(new OrdernarFiguritas());
	}
	
	@Override
	public void agregarFigurita(Figurita figurita) {
		this.figuritas.add(figurita);
		Collections.sort(figuritas);
	}

	public LinkedList<Figurita> getFiguritas() {
		return figuritas;
	}

	public void setFiguritas(LinkedList<Figurita> figuritas) {
		this.figuritas = figuritas;
	}

	public void pegarFigurita(Figurita figurita) {
		this.figuritasPegadas.add(figurita);
	}

	public TreeSet<Figurita> getFiguritasPegadas() {
		return figuritasPegadas;
	}

	public void setFiguritasPegadas(TreeSet<Figurita> figuritasPegadas) {
		this.figuritasPegadas = figuritasPegadas;
	}

	
	

}
