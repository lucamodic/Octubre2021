package unlam.edu.ar.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
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
	
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() {
		Usuario administrador = new Administrador();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		administrador.agregarFigurita(figurita);
		assertEquals(1, administrador.getFiguritasAgregadas().size());
	}
	
	
}
