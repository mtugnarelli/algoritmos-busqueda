import org.junit.Assert;
import org.junit.Test;


public class PruebaBuscadorBinario {

	private BuscadorBinario buscador = new BuscadorBinario();
	
	@Test
	public void buscarValorExistente() {
		
		/* condición inicial */
		int[] valores = new int[] {5, 15, 27, 37, 39, 44, 78};
		
		/* operación */
		int posicion = this.buscador.buscar(valores, 44);
		
		/* comprobación */
		Assert.assertEquals("posición encontrada", 5, posicion);
	}
	
	@Test
	public void buscarValorExistenteEnLaUltimaPosicion() {
		
		
		/* condición inicial */
		int[] valores = new int[] {5, 15, 27, 37, 39, 44, 78};
		
		/* operación */
		int posicion = this.buscador.buscar(valores, 78);
		
		/* comprobación */
		Assert.assertEquals("posición encontrada", 6, posicion);
	}

	@Test
	public void buscarValorExistenteEnLaPrimerPosicion() {
		
		/* condición inicial */
		int[] valores = new int[] {5, 15, 27, 37, 39, 44, 78};
		
		/* operación */
		int posicion = this.buscador.buscar(valores, 5);
		
		/* comprobación */
		Assert.assertEquals("posición encontrada", 0, posicion);
	}
	
	@Test
	public void buscarValorInexistente() {
		
		/* condición inicial */
		int[] valores = new int[] {5, 15, 27, 37, 39, 44, 78};
		
		/* operación */
		int posicion = this.buscador.buscar(valores, 20);
		
		/* comprobación */
		Assert.assertEquals("posición encontrada", -1, posicion);
	}
	
	@Test
	public void buscarValorEnArregloVacio() {
		
		/* condición inicial */
		int[] valores = new int[] {};
		
		/* operación */
		int posicion = this.buscador.buscar(valores, 5);
		
		/* comprobación */
		Assert.assertEquals("posición encontrada", -1, posicion);
	}

	@Test
	public void buscarValorExistenteEnArregloDeLongitud1() {
		
		/* condición inicial */
		int[] valores = new int[] {36};
		
		/* operación */
		int posicion = this.buscador.buscar(valores, 36);
		
		/* comprobación */
		Assert.assertEquals("posición encontrada", 0, posicion);
	}

	@Test
	public void buscarValorInexistenteEnArregloDeLongitud1() {
		
		/* condición inicial */
		int[] valores = new int[] {36};
		
		/* operación */
		int posicion = this.buscador.buscar(valores, 23);
		
		/* comprobación */
		Assert.assertEquals("posición encontrada", -1, posicion);
	}
}
