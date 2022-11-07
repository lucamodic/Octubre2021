package unlam.edu.ar.pb2;

public class CodigoExistente extends Exception {

	private String mensaje;

	public CodigoExistente(String mensaje) {
		this.mensaje = mensaje;
		
	}

}
