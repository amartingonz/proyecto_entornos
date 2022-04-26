
public class busquedabinaria {
	public static int contador;
	
	/// NO ES NECESARIO SOLO ES PARA SABER LUEGO COMO USARLO.
	public static void main(String[] args) throws Exception {
		int[] v = new int[40000000];
		for (int j = 0; j < v.length; j++) {
			v[j] = j;
		}
		int busca = 3447;
		System.out.print("Valor: " + buscab(v,busca) + " encontrado en el intento: " + contador);
	}
	public static int buscab(int[] vector,int valorabuscar) {
		
		int mitad, inferior = 0;
		int superior = vector.length - 1;
		contador = 0;
		//1
		
		do {
			contador++;
			mitad = (inferior + superior) >>> 1;
			//2
			if (valorabuscar > vector[mitad]) {
				//3
				inferior = mitad + 1;
			//4	
			}else {
				//5
				superior = mitad - 1;
			}
			//6
		//7 - 8 - 9
		}while (vector[mitad] != valorabuscar && inferior <= superior);
			
		if (vector[mitad] == valorabuscar) {
			return mitad;
		}else {
			return -1;
		}
	}
}
