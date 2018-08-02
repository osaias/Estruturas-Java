
public class EstruturaArrays {

	public static void main(String[] args) {
		//Arrays
		int[] n = new int[5];
		for (int c = 0; c < n.length; c++) {
			System.out.print(n[c] + " ");
		}
		System.out.println();
		int[] n3 = new int[] {10,20,30,40,50};
		for (int c = 0; c < n3.length; c++) {
			System.out.print(n3[c] + " ");
		}
		System.out.println();
		int[] n4 = {100,200,300,400,500};
		for (int c = 0; c < n4.length; c++) {
			System.out.print(n4[c] + " ");
		}
		System.out.println();

		//Arrays de array
		int[][] matriz = new int[5][4];
		int ind = 0;
		/*for(int l = 0; l < matriz.length; l++) { 
					 matriz[l] = new int[4]; 
				}*/

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = ind++;
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}

	}

}
