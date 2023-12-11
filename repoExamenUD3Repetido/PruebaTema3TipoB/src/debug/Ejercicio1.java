package debug;

/**
 * Ejercicio Practico 1 - Tipo B
 * ¡OJO! Este código TIENE ERRORES que deben ser subsanados a través
 * de la depuración del código.
 * Este programa es mostrar los elementos repetidos (es decir, con
 * una frecuencia mayor que 1) de un array de números enteros
 */
public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		
		int[] array1 = new int[]{1,1,2,2,3,4,5,5,6,6,7,7,7,8,9,9,10};
		
		int[] array_repes = repetidos(array1);
		
		for(int i = 0; i < array_repes.length; i++) {
			System.out.printf("%d ", array_repes[i]);
		}
		
		
	}
	
	/**
	 * Recibe un array de números enteros, y devuelve
	 * otro array con aquellos elementos que aparecen
	 * más de una vez en el array original
	 * @param arr Array de números enteros
	 * @return array con los elementos que aparecen más de una vez
	 * 
	 */
	public static int[] repetidos(int[] arr) {
		int[] result = new int[arr.length];
		int pos = 0;
		for(int i = 0; i < arr.length; i++) {
			if (ocurrences(arr[i], arr) >= 1) {
				if (contains(arr[i], result)) {
					result[pos] = arr[i];
					pos++;
				}
			}
				
		}
		
		return pack(result, pos);
	}
	
	
	
	/**
	 * Este método comprueba sin un array contiene un número
	 * @param n El número a buscar
	 * @param arr El array donde buscar
	 * @return true si lo encuentra, false en otro caso
	 */
	public static boolean contains(int n, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return true;
		}
		return false;
	}
	
	/**
	 * Este método devuelve el número de ocurrencias de 
	 * un número en un array
	 * @param n El número a buscar
	 * @param arr El array donde buscar
	 * @return El número de veces que el número está presente en el array
	 */
	public static int ocurrences(int n, int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				result++;
		}
		return result+1;
	}
	
	
	/**
	 * Reduce un array al número de elementos proporcionados
	 * @param arr Array reducir. Debe ser de tamaño mayor o igual a n
	 * @param n Tamaño del array resultante
	 * @return Array reducido
	 */
	public static int[] pack(int[] arr, int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
			result[i] = arr[i];
		}
		return result;
	}
	
	
	
	
	

}
