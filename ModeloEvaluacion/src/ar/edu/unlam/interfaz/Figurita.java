package ar.edu.unlam.interfaz;

public class Figurita {
	private Integer codigo;
	private String grupo;
	private String seleccion;
	private String nombreJugador;
	private String valorJugador;
	
	public Figurita(Integer codigo, String grupo, String seleccion, String nombreJugador, String valorJugador) {
		super();
		this.codigo = codigo;
		this.grupo = grupo;
		this.seleccion = seleccion;
		this.nombreJugador = nombreJugador;
		this.valorJugador = valorJugador;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getValorJugador() {
		return valorJugador;
	}

	public void setValorJugador(String valorJugador) {
		this.valorJugador = valorJugador;
	}
}
