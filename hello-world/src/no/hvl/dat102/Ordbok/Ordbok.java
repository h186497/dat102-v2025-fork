package no.hvl.dat102.Ordbok;

import java.util.Iterator;
import java.util.HashMap;

public class Ordbok<K, V> implements OrdbokADT<K, V> {

	HashMap<K, V> ordbok;

	public Ordbok() {
		this.ordbok = new HashMap<K, V>();
	}

	@Override
	public V leggTil(K nokkel, V verdi) {

		V gammel = ordbok.get(nokkel);
		ordbok.put(nokkel, verdi);

		return gammel;
	}

	@Override
	public V fjern(K nokkel) {

		return ordbok.remove(nokkel);

	}

	@Override
	public V getVerdi(K nokkel) {
		
		return ordbok.get(nokkel);
		
		
	}

	@Override
	public boolean inneholder(K nokkel) {
		return ordbok.containsKey(nokkel);
	}

	@Override
	public Iterator<K> getNokkelIterator() {
		
		return ordbok.keySet().iterator();
		
	}

	@Override
	public Iterator<V> getVerdiIterator() {
		
		return ordbok.values().iterator();
		
	}

	@Override
	public boolean erTom() {
		return ordbok.isEmpty();
	}

	@Override
	public int getAntall() {
		return ordbok.size();
	}

	@Override
	public void nullstill() {
		ordbok.clear();

	}

}
