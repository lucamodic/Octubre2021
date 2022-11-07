package unlam.edu.ar.pb2;

public class Figurita {

	String codigo;
	String grupo;
	String seleccion;
	String nombre;
	Integer valor;
	Integer numero;
	
	public Figurita(String grupo, String seleccion, String nombre, Integer valor, Integer numero) {
		this.grupo = grupo;
		this.seleccion = seleccion;
		this.nombre = nombre;
		this.numero = numero;
		this.valor = valor;
		this.codigo = seleccion+numero;	
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getGrupo() {
		return grupo;
	}

	public String getSeleccion() {
		return seleccion;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getValor() {
		return valor;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
