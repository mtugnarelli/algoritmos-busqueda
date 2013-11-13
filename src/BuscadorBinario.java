
/**
 * Buscador que utiliza el algoritmo de búsqueda binaria.
 */
public class BuscadorBinario {

	/**
	 * pre : 'valores' está ordenado ascendentemente.
	 * post: devuelve la posición correspondiente al array 'valores' en la que se localizó una
	 *       ocurrencia del elemento 'valorBuscado'. Si no lo encuentra devuelve -1.
	 */
	public int buscar(int[] valores, int valorBuscado) {

		int encontrado = -1;
		int primero = 0;
		int ultimo = valores.length - 1;
		
		while ((primero <= ultimo) && (encontrado < 0)) {
			
			int medio = (primero + ultimo) / 2;
			
			if (valores[medio] == valorBuscado) {
				
				encontrado = medio;
				
			} else if (valores[medio] < valorBuscado) {
				
				primero = medio + 1;

			} else {
				
				ultimo = medio - 1;
			}
		}
		return encontrado;
	}
}
