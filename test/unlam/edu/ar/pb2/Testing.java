package unlam.edu.ar.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		Figurita figurita = new Figurita("AR10", "C", "Argentina", "Lionel Andres Messi", 100000);
		assertNotNull(figurita);
	}

	@Test
	public void queSePuedaCrearUnAdministrador() {
		Usuario administrador = new Administrador();
		assertNotNull(administrador);
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		Usuario usuarioFinal = new UsuarioFinal();
		assertNotNull(usuarioFinal);

	}
	
	
}
