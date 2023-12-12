package ar.edu.unlam.interfaz;
import java.util.*;

public class UsuarioFinal extends Usuario implements InterfazDeUsuario{
	ArrayList<Figurita> stock;
	Set<Figurita> figuritasPegadas;
	
	public UsuarioFinal(String nombre) {
		super(nombre);
		this.stock = new ArrayList<>(new OrdenarFiguritas());
		this.figuritasPegadas = new HashSet<>();
	}

	@Override
	public void agregarFigurita(Figurita figurita) {
		this.stock.add(figurita);
	}

	public void pegarFigurita(Figurita figurita) throws FiguritaRepetidaException {
		if(!figuritasPegadas.contains(figurita)) {
			this.figuritasPegadas.add(figurita);
		} else {
			throw new FiguritaRepetidaException();
		}
	}
}
