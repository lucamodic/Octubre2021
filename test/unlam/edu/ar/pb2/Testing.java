package unlam.edu.ar.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

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
	
	@Test 
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
		Usuario usuarioFinal = new UsuarioFinal();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		usuarioFinal.agregarFigurita(figurita);
		assertEquals(1, usuarioFinal.getFiguritasAgregadas().size());
	}
	
	@Test 
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() {
		Usuario administrador = new Administrador();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		Figurita figurita2 = new Figurita("C", "Argentina", "Leopoldo", 100000, 11);
		Figurita figurita1 = new Figurita("C", "Argentina", "El dibu", 100000, 1);
		administrador.agregarFigurita(figurita);
		administrador.agregarFigurita(figurita2);
		administrador.agregarFigurita(figurita1);
		TreeSet <Figurita> figuritas = new TreeSet<Figurita>(new OrdernarFiguritas()); 
		figuritas.add(figurita1);
		figuritas.add(figurita);
		figuritas.add(figurita2);
		
		assertEquals(figuritas, administrador.getFiguritasAgregadas());
	}
	
}
