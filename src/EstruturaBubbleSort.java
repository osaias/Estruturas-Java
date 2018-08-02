
public class EstruturaBubbleSort {

	public static void main(String[] args) {

		int[] array = {2,1,8,9,41,3};
		int aux = 0;
		
		for (int i = array.length; i >= 1; i--) { 
			for (int j = 1; j < i; j++) { 
				if (array[j - 1] > array[j]) { 
					int auxiliar = array[j]; 
					array[j] = array[j - 1]; 
					array[j - 1] = auxiliar; 
				} 
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//////////////////////////////////////////////////////////////////
		for (int i = array.length-1; i > 0 ; i--) {
			for (int y = 0; y <= i - 1; y++) {
				if (array[y] > array[i]) {
					aux = array[i];
					array[i] = array[y];
					array[y] = aux;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
