package ar.edu.unlam.interfaz;
import java.util.*;

public class Administrador extends Usuario implements InterfazDeUsuario{
	protected Map <Figurita, String> figuritas;
	
	public Administrador(String nombre) {
		super(nombre);
		this.figuritas = new TreeMap<>(new OrdenarFiguritas());
	}

	@Override
	public void agregarFigurita(Figurita figurita) throws CodigoExistenteException {
		if(!figuritas.containsKey(figurita)) {
			this.figuritas.put(figurita, figurita.getSeleccion()+figurita.getCodigo());
		} else {
			throw new CodigoExistenteException();
		}
	}
}
