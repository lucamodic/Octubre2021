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

	public void pegarFigurita(Figurita figurita) throws NoTieneLaFigurita, FiguritaRepetida {
		this.buscarFigu(figurita);
		this.buscarFiguEnPegadas(figurita);
		this.figuritasPegadas.add(figurita);
		this.figuritas.remove(figurita);
		
	}

	public TreeSet<Figurita> getFiguritasPegadas() {
		return figuritasPegadas;
	}

	public void setFiguritasPegadas(TreeSet<Figurita> figuritasPegadas) {
		this.figuritasPegadas = figuritasPegadas;
	}

	public Boolean buscarFigu(Figurita figurita) throws NoTieneLaFigurita {
		for(Figurita figurita1 : this.figuritas){
			if(figurita1.equals(figurita)){
				return true;
			}
		}
		throw new NoTieneLaFigurita("No tiene la figurita");
	}
	
	public Boolean buscarFiguEnPegadas(Figurita figurita)throws FiguritaRepetida {
		for(Figurita figurita1 : this.figuritasPegadas){
			if(figurita1.equals(figurita)){
				throw new FiguritaRepetida("Figurita Repetida");
			}
		}
		return true;
	}
	
	public Boolean buscarFiguParaIntercambio(Figurita figurita) throws FiguritaNoDisponible {
		for(Figurita figurita1 : this.figuritas){
			if(figurita1.equals(figurita)){
				return true;
			}
		}
		throw new FiguritaNoDisponible("Figurita no disponible");
	}

	public void intercambio(Figurita figurita, UsuarioFinal usuarioFinal2, Figurita figurita2) throws NoTieneLaFigurita {
		this.buscarFigu(figurita);
		usuarioFinal2.buscarFigu(figurita2);
		
		this.figuritas.remove(figurita);
		usuarioFinal2.figuritas.remove(figurita2);
		
		this.figuritas.add(figurita2);
		usuarioFinal2.figuritas.add(figurita);
	}
	
	
	

}
