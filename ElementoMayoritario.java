
holaaaaa
/**
 * Clase que alberga el código completo para la Práctica 01
 * 
 * @author Ivan Nebreda
 *
 */
public class ElementoMayoritario {

	/**
	 * Para poder devolver dos valores diferentes por parte de un mismo método, se
	 * necesita una clase sencilla con dos atributos. En este caso, la clase
	 * RespuestaMayoritaria permite encapsular en el mismo objeto: - elemento
	 * mayoritario encontrado - el numero de veces que se repite (o frecuencia) como
	 * un entero
	 * 
	 * Al devolver la respuesta de cada metodo, se deberán incluir los dos datos
	 * encontrados dentro de un objeto de este tipo y devolverlo como respuesta.
	 * 
	 * @author bbaruque
	 *
	 * @param <E>
	 */
	public static class RespuestaMayoritaria<E> {

		private E elemento;
		private int frecuencia;

		public RespuestaMayoritaria(E elemento, int frecuencia) {
			this.elemento = elemento;
			this.frecuencia = frecuencia;
		}

		public E getElemento() {
			return elemento;
		}

		public int getFrecuencia() {
			return frecuencia;
		}
	}

	/**
	 * 
	 * @param <E>
	 * @param array
	 * @return
	 */
	public static <E> RespuestaMayoritaria<E> mayoritarioIterativo(E[] array) {

		int frecuenciaRef = 0;

		int indice = 0;

		for (int i = 0; i < array.length; i++) {

			if (calcularFrecuencia(array[i], array) > frecuenciaRef) {

				frecuenciaRef = calcularFrecuencia(array[i], array);
				indice = i;
			}

		}

		if (frecuenciaRef > (array.length / 2)) {

			RespuestaMayoritaria<E> mayoritario = new RespuestaMayoritaria<E>(array[indice], frecuenciaRef);

			return mayoritario;

		} else {

			RespuestaMayoritaria<E> mayoritario = new RespuestaMayoritaria<E>(null, 0);
			return mayoritario;
		}

	}

	/**
	 * 
	 * @param <E>
	 * @param array
	 * @return
	 */
	public static <E> RespuestaMayoritaria<E> mayoritarioRecursivo(E[] array) {

		int frecuenciaRefA = 0;

		int frecuenciaRefB = 0;

		int indiceA = 0;

		int indiceB = 0;

		for (int i = 0; i < array.length / 2; i++) {

			if (calcularFrecuenciaMitadA(array[i], array) > frecuenciaRefA) {

				frecuenciaRefA = calcularFrecuenciaMitadA(array[i], array);
				indiceA = i;
			}

		}

		for (int i = array.length / 2; i < array.length; i++) {

			if (calcularFrecuenciaMitadB(array[i], array) > frecuenciaRefB) {

				frecuenciaRefB = calcularFrecuenciaMitadB(array[i], array);
				indiceB = i;
			}

		}

		if (calcularFrecuencia(array[indiceA], array) > (array.length / 2)) {

			RespuestaMayoritaria<E> mayoritario = new RespuestaMayoritaria<E>(array[indiceA],
					calcularFrecuencia(array[indiceA], array));

			return mayoritario;

		} else if (calcularFrecuencia(array[indiceB], array) > (array.length / 2)) {

			RespuestaMayoritaria<E> mayoritario = new RespuestaMayoritaria<E>(array[indiceB],
					calcularFrecuencia(array[indiceB], array));

			return mayoritario;
		} else {

			RespuestaMayoritaria<E> mayoritario = new RespuestaMayoritaria<E>(null, 0);
			return mayoritario;

		}

	}

	public static <E> int calcularFrecuencia(E objeto, E[] array) {

		int contador = 0;

		for (int i = 0; i < array.length; i++) {

			if (objeto == array[i]) {

				contador++;
			}

		}

		return contador;
	}

	public static <E> int calcularFrecuenciaMitadA(E objeto, E[] array) {

		int contador = 0;

		for (int i = 0; i < array.length / 2; i++) {

			if (objeto == array[i]) {

				contador++;
			}

		}

		return contador;
	}

	public static <E> int calcularFrecuenciaMitadB(E objeto, E[] array) {

		int contador = 0;

		for (int i = array.length / 2; i < array.length; i++) {

			if (objeto == array[i]) {

				contador++;
			}

		}

		return contador;
	}

	// Es posible emplear métodos auxiliares para la ayuda a la implementación de
	// los métodos obligatorios.
	
}

