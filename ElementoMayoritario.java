package es.ubu.inf.edat.p02_2324;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColaMixta<E> extends AbstractQueue<E> {
	
	
	protected class NodoMixto extends AbstractQueue<E> {

		private List<E> contenido = new ArrayList<E>();
		private NodoMixto siguiente;
		private NodoMixto inicio;
		private NodoMixto fin;
		private int N;
		private int tamArray;
		
		// TODO A completar por el estudiante
		// TODO To be completed by the students
		
		@Override
		public boolean offer(E e) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public E poll() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public E peek() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Iterator<E> iterator() {
			// TODO Auto-generated method stub
			return new IteradorMixto();
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return N;
		}
	

	}

	// TODO Definicion de variables de clase ColaMixta
	// TODO Variable definition class ColaMixta

	/**
	 * Constructor de la clase
	 * 
	 * @param tamañoNodo Numero de elementos que se introducen como maximo en un
	 *                   nodo
	 */
	public ColaMixta(int tamañoNodo) {
		// TODO A completar por el estudiante
		// TODO To be completed by the students
		
		
	}

	public E peek(int index) {
		// TODO A completar por el estudiante
		// TODO To be completed by the students
	}



	/**
	 * Iterador que permite recorrer todos los elementos de la cola. Debe recorrer
	 * cada segmento de la misma (empleando el iterador del nodo) y pasar al nodo
	 * siguiente para repetir la operación. Se detiene al no haber más nodos.
	 *
	 * @param <E>
	 */
	private class IteradorMixto implements Iterator<E> {

		public IteradorMixto() {
			
			
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}

		// TODO A completar por el estudiante
		// TODO To be completed by the students
		
		
		

	}

}
