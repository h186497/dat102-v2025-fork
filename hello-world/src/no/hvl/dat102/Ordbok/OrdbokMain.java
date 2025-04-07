package no.hvl.dat102.Ordbok;

import java.util.Iterator;

public class OrdbokMain {

	public static void main(String[] args) {
	
		String[] ord = {"er", "det", "finn", "er", "finn", "er"};
		
		Ordbok<String, Integer> frekvenser = new Ordbok<>();
		
		
		for(String e : ord) {
			
			Integer verdi = frekvenser.getVerdi(e);
			if(verdi == null) {
				frekvenser.leggTil(e, 1);
			}else {
				frekvenser.leggTil(e, verdi + 1);
			}
			
			
			
		}
		
		Iterator<String> nI = frekvenser.getNokkelIterator();
		Iterator<Integer> Vi = frekvenser.getVerdiIterator();
		
		
		while(nI.hasNext()) {
			System.out.println(nI.next() + ": " + Vi.next());
		}
		

	}

}
