package no.hvl.dat102.Iterator;

import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		
		Set<String> spraakMengde = Set.of("engelsk", "tysk", "fransk", "spansk");
		
		Iterator<String> spraakiterator = spraakMengde.iterator();
		
		while (spraakiterator.hasNext()) {
			System.out.println(spraakiterator.next());
		}
		
		
		
	}
	
	
}
