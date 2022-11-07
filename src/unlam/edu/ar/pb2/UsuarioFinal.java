package unlam.edu.ar.pb2;

import java.util.Collections;
import java.util.LinkedList;

public class UsuarioFinal extends Usuario {

	private LinkedList <Figurita> figuritas; 
	
	public UsuarioFinal() {
		figuritas = new LinkedList<Figurita>();
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

	
	

}
