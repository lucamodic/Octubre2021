package unlam.edu.ar.pb2;

import java.util.TreeSet;

public class UsuarioFinal extends Usuario {

	@Override
	public void agregarFigurita(Figurita figurita) {
		this.getFiguritasAgregadas().add(figurita);
	}

	@Override
	public void buscarCodigo(Figurita figurita) throws CodigoExistente {
		
	}


}
