
public class EstruturaSelectionSort {

	public static void main(String[] args) {

		int[] array = {5,4,1,9,7,6,5,3,2,8,8,7};
		int auxiliar = 0; 
		int indiceDoMenor = 0; 
		for (int i = 0; i < array.length; i++) { 
			indiceDoMenor = i; 
			for (int j = i + 1; j < array.length; j++) { 
				if (array[j] < array[indiceDoMenor]) { 
					indiceDoMenor = j; 
				} 
			} 
			if (indiceDoMenor != i) { 
				auxiliar = array[indiceDoMenor];
				array[indiceDoMenor] = array[i]; 
				array[i] = auxiliar; 
			}  
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//////////////////////////////////////////////////
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			
			for (int prox = i+1; prox < array.length; prox++) {
				if (array[prox] < array[i]) {
					aux = array[i];
					array[i] = array[prox];
					array[prox] = aux;
				}
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
