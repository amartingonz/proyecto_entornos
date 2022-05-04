
/**
 * @version 1.0
 * @author Alejandro
 *
 */
public class busquedabinaria {
	public static int contador;
	
	/// NO ES NECESARIO SOLO ES PARA SABER LUEGO COMO USARLO.
	public static void main(String[] args) throws Exception {
		/**
		 * @param args se le un numero.
		 * @throws Exception dispara Exception si no da el resultado esperado.
		 * @param int busca usa la funcion buscab para ver si encuentra el valor.
		 */
		int[] v = new int[40000000];
		for (int j = 0; j < v.length; j++) {
			v[j] = j;
		}
		int busca = 3447;
		System.out.print("Valor: " + buscab(v,busca) + " encontrado en el intento: " + contador);
	}
	
	public static int buscab(int[] vector,int valorabuscar) {
		/**
		 * @param vector este parametro sirve para luego ser usado dentro del do y el while.
		 * @param valorabuscar valorabuscar es el parametro de un numero que se le pasa para que la función lo encuentre.
		 */
		int mitad, inferior = 0;
		int superior = vector.length - 1;
		contador = 0;
		
		
		do {
			contador++;
			mitad = (inferior + superior) >>> 1;
			
			if (valorabuscar > vector[mitad]) {
				
				inferior = mitad + 1;
			
			}else {
				
				superior = mitad - 1;
			}
			
		}while (vector[mitad] != valorabuscar && inferior <= superior);
			
		if (vector[mitad] == valorabuscar) {
			return mitad;
			/**
			 * @return mitad 
			 * devuelve un entero.
			 */
		}else {
			return -1;
			/**
			 * @return -1
			 * sino se da devuelve -1
			 */
			
		}
	}
}
