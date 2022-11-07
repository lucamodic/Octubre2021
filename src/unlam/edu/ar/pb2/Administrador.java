package unlam.edu.ar.pb2;

import java.lang.reflect.Array;
import java.util.TreeSet;

public class Administrador extends Usuario {

	@Override
	public void agregarFigurita(Figurita figurita) {
		try {
			this.buscarCodigo(figurita);
		} catch (CodigoExistente e) {
			e.getMessage();
		}
		this.getFiguritasAgregadas().add(figurita);
	}
	
	@Override
	public void buscarCodigo(Figurita figurita) throws CodigoExistente {
		for(Figurita figurita1 : this.getFiguritasAgregadas()){
			if(figurita1.getCodigo().equals(figurita.getCodigo())){
				throw new CodigoExistente("El codigo ya existe");
			}
		}
	}

	

}
