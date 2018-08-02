/*
* Exercicio 3.13,14
* 
*/
public class OperacoesMatematica {
	
	public static void main(String[] args) {
		
		int soma = 0;
		long fatorial = 1;
		
		for (int i = 151; i <= 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		for (int i = 1; i <= 1000; i++) {
			soma = soma + i;
		}
		System.out.println("A soma de 1 até 1000: " + soma + "\n");
		
		for (int i = 1; i <= 100; i++) {
			if (i == 1) {
				System.out.print("Múltiplos de 3: " + 3 * i + " ");
			} else {
				System.out.print(3 * i + " ");
			}
		}
		System.out.println("\n");
		
		for (int i = 1; i <= 40; i++)  {
			fatorial = fatorial * i;
			if (i == 1) {
				System.out.print("Fatorial: " + fatorial + " ");
			} else {
				System.out.print(fatorial + " ");
			}
		}
		System.out.println("\n");
		
		int n1 = 0;
		int n2 = 1;
		int fibonacci = n2 + n1;
		do {
			fibonacci = n2 + n1;
			if (fibonacci <= 1) {
				System.out.print("Série de fibonacci: 0 " + fibonacci + " ");
			} else {
				System.out.print(fibonacci + " ");
			}
			n1 = n2;
			n2 = fibonacci;
		} while(fibonacci <= 100);
		System.out.println("\n");
		
		int x = 13;
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.print(x + " -> ");
		}
		System.out.println("\n");
		
		System.out.println("Tabela de nºs: ");
		for (int i = 1; i <= 6; i++) {
			System.out.print(i + " ");
			
			if (i == 2) {
				for (int j = i * 2; j <= (i * 2); j += 2) {
					System.out.print(j + " ");
				}
			}
			
			if (i == 3) {
				for (int j = i * 2; j <= (i * 3); j += 3) {
					System.out.print(j + " ");
				}
			}
			
			if (i == 4) {
				for (int j = i * 2; j <= (i * 4); j += 4) {
					System.out.print(j + " ");
				}
			}
			
			if (i == 5) {
				for (int j = i * 2; j <= (i * 5); j += 5) {
					System.out.print(j + " ");
				}
			}
			
			if (i == 6) {
				for (int j = i * 2; j <= (i * 6); j += 6) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
