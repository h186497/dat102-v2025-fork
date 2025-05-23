package no.hvl.dat102.lenketkoe;

import no.hvl.dat102.koeadt.EmptyQueueException;
import no.hvl.dat102.koeadt.KoeADT;

/**
 * A class that implements a queue of objects by using a chain of linked nodes
 * that has both head and tail references.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 5.0
 * 
 * Fikset littegrann av Lars-Petter Helland, februar 2024
 */

public final class LenketKoe<T> implements KoeADT<T> {
	
/* -------------------------------------------------------------- */
	
	private class Node {
		private T data;
		private Node neste;

		private Node(T data) {
			this.data = data;
			this.neste = null;
		}
	}
/* -------------------------------------------------------------- */
	
	private Node fremsteNode; 	// References node at front of queue
	private Node bakersteNode;  // References node at back of queue

	public LenketKoe() {
		this.fremsteNode = null;
		this.bakersteNode = null;
	}
	
	LenketKoe<T> lenketKoe = new LenketKoe<>();

	@Override
	public void enqueue(T newEntry) {
		
		Node nyNode = new Node(newEntry);
		
		if(isEmpty()) {
			fremsteNode = nyNode;
		}else {
			bakersteNode.neste = nyNode;
			
		}
		
		bakersteNode = nyNode;

	}

	@Override
	public T getFront() {
		
		if(isEmpty()) {
			throw new EmptyQueueException();
		}

		return fremsteNode.data;
		
	}

	@Override
	public T dequeue() {
		
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		
		
	
		T dataDelenAvFremsteNoden = fremsteNode.data;
		fremsteNode = fremsteNode.neste;
		
		if(fremsteNode == null) {
			bakersteNode = null;
		}
		
		return dataDelenAvFremsteNoden;
		
		
	}

	@Override
	public boolean isEmpty() {
		
		return fremsteNode.data == null;
		
	}

	@Override
	public void clear() {
		
	//TODO
		
		
	}
}
