package unlam.edu.ar.pb2;

import static org.junit.Assert.*;

import java.util.LinkedList;
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
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws CodigoExistente {
		Administrador administrador = new Administrador();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		administrador.agregarFigurita(figurita);
		assertEquals(1, administrador.getFiguritasAgregadas().size());
	}
	
	@Test 
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		usuarioFinal.agregarFigurita(figurita);
		assertEquals(1, usuarioFinal.getFiguritas().size());
	}
	
	@Test 
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() throws CodigoExistente {
		Administrador administrador = new Administrador();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		Figurita figurita2 = new Figurita("C", "Argentina", "Leopoldo", 100000, 11);
		Figurita figurita1 = new Figurita("C", "Argentina", "El dibu", 100000, 1);
		administrador.agregarFigurita(figurita);
		administrador.agregarFigurita(figurita2);
		administrador.agregarFigurita(figurita1);
		TreeSet <Figurita> figuritas = new TreeSet<Figurita>(new OrdernarFiguritas()); 
		figuritas.add(figurita2);
		figuritas.add(figurita);
		figuritas.add(figurita1);
		assertEquals(figuritas, administrador.getFiguritasAgregadas());
		
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		usuarioFinal.agregarFigurita(figurita);
		usuarioFinal.agregarFigurita(figurita2);
		usuarioFinal.agregarFigurita(figurita1);
		LinkedList <Figurita> figuritass = new LinkedList<Figurita>();
		figuritass.add(figurita2);
		figuritass.add(figurita);
		figuritass.add(figurita1);	
		assertEquals(figuritass, usuarioFinal.getFiguritas());

	}
	
	@Test (expected = CodigoExistente.class)
	public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() throws CodigoExistente {
		Administrador administrador = new Administrador();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		Figurita figurita1 = new Figurita("A", "Argentina", "Lio", 100000, 10);
		administrador.agregarFigurita(figurita);
		administrador.agregarFigurita(figurita1);
		assertEquals(1, administrador.getFiguritasAgregadas().size());
	}
	
	@Test 
	public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() {
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		usuarioFinal.agregarFigurita(figurita);
		usuarioFinal.agregarFigurita(figurita);
		assertEquals(2, usuarioFinal.getFiguritas().size());
	}
	
	@Test
	public void queUnUsuarioFinalPuedaPegarUnaFigurita() throws NoTieneLaFigurita, FiguritaRepetida {
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		usuarioFinal.agregarFigurita(figurita);
		usuarioFinal.pegarFigurita(figurita);
		assertEquals(1, usuarioFinal.getFiguritasPegadas().size());
		assertEquals(0, usuarioFinal.getFiguritas().size());
	}

	@Test (expected = FiguritaRepetida.class)
	public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() throws NoTieneLaFigurita, FiguritaRepetida {
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		usuarioFinal.agregarFigurita(figurita);
		usuarioFinal.agregarFigurita(figurita);
		usuarioFinal.pegarFigurita(figurita);
		usuarioFinal.pegarFigurita(figurita);
		assertEquals(1, usuarioFinal.getFiguritasPegadas().size());
	}
	
	@Test
	public void queSePuedaRealizarElIntercambioDeFiguritasEntreDosUsuariosFinales() throws NoTieneLaFigurita {
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		usuarioFinal.agregarFigurita(figurita);
		
		UsuarioFinal usuarioFinal2 = new UsuarioFinal();
		Figurita figurita2 = new Figurita("C", "Argentina", "El dibu", 100000, 1);
		usuarioFinal2.agregarFigurita(figurita2);
		
		usuarioFinal.intercambio(figurita, usuarioFinal2, figurita2);
		
		assertEquals(figurita, usuarioFinal2.getFiguritas().get(0));
		
	}
	
	@Test (expected = NoTieneLaFigurita.class)
	public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueNoLaTenga() throws NoTieneLaFigurita {
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		Figurita figurita = new Figurita("C", "Argentina", "Lionel Andres Messi", 100000, 10);
		usuarioFinal.agregarFigurita(figurita);
		
		UsuarioFinal usuarioFinal2 = new UsuarioFinal();
		Figurita figurita2 = new Figurita("C", "Argentina", "El dibu", 100000, 1);
		usuarioFinal2.agregarFigurita(figurita2);
		
		usuarioFinal.intercambio(figurita2, usuarioFinal2, figurita2);
		
		assertEquals(figurita, usuarioFinal2.getFiguritas().get(0));

	}
	
}


