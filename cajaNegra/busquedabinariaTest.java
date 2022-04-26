import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class busquedabinariaTest {

	@Test
	public void ENCUENTRAtest() {
		int[] v = {-1,2,5,40,71,100};
		int esperado = 5; ///Se puede probar con error por ejemplo poniendo un 7 en vez de 5.
		int resultado = busquedabinaria.buscab(v, 100);
		assertEquals(esperado,resultado);
	}

	@Test
	public void NO_ENCUENTRAtest() {
		int[] v = {-1,2,5,40,71,100};
		int esperado = -1;
		int resultado = busquedabinaria.buscab(v, 111);
		assertEquals(esperado,resultado);
		
	}
}


