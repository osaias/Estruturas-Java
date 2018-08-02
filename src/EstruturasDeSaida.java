
public class EstruturasDeSaida {

	public static void main(String[] args) {
		int baseMaior = 20; 
		//controla as partes da arvore. Neste caso cada parte contem 4 galhos.
		for (int m = 7; m <= baseMaior; m += 4) { 
			//define a quantidade de espaços.
			// o 'i' representa a qtde de asteriscos.
			for (int i = m - 6; i <= m; i += 2) { 
				int espacos = (baseMaior - i) / 2; 
				String linha = ""; 
				//controla a quantidade de espaços.
				for (int j = 0; j < espacos; j++) { 
					linha += " "; 
				} 
				//controla a quantidade de asteriscos.
				for (int k = 0; k < i; k++) { 
					linha += "*"; 
				} 
				
				System.out.println(linha); 
			} 
		}
	}
}
