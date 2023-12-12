package ar.edu.unlam.interfaz;
import java.util.*;

public class OrdenarFiguritas implements Comparator<Figurita>, Collection {
	
	@Override
	public int compare(Figurita o1, Figurita o2) {
	    Integer comparacionGrupo = o2.getGrupo().compareTo(o1.getGrupo());
	    if (comparacionGrupo == 0) {
	    		Integer comparacionNombre = o2.getNombreJugador().compareTo(o1.getNombreJugador());
	        if(comparacionNombre == 0) {
	        		Integer comparacionCodigo = o2.getCodigo().compareTo(o1.getCodigo());
	        		return comparacionCodigo;
	        }
	    		return comparacionNombre;
	    }
	    return comparacionGrupo;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
}
