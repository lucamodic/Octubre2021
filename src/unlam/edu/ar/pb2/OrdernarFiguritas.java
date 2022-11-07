package unlam.edu.ar.pb2;

import java.util.Comparator;

public class OrdernarFiguritas implements Comparator<Figurita> {

	@Override
	public int compare(Figurita o1, Figurita o2) {
		if (o1.getGrupo().compareTo(o2.getGrupo()) == 0) {
			if (o1.getSeleccion().compareTo(o2.getSeleccion()) == 0) {
				return o1.getNumero().compareTo(o2.getNumero());
			}
			return o2.getSeleccion().compareTo(o2.getSeleccion());
		}
		return o1.getGrupo().compareTo(o2.getGrupo());
	}

	
	
}
