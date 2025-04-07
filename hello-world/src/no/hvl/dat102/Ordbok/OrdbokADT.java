package no.hvl.dat102.Ordbok;

import java.util.Iterator;

public interface OrdbokADT<K, V> {
	
	
	public V leggTil(K nokkel, V verdi);
	
	public V fjern(K nokkel);
	
	public V getVerdi(K nokkel);
	
	public boolean inneholder(K nokkel);
	
	public Iterator<K> getNokkelIterator();
	
	public Iterator<V> getVerdiIterator();
	
	public boolean erTom();
	
	public int getAntall();

	public void nullstill();
	

}
