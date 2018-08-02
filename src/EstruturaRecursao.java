/*
 * F(n) = F(n-1) + F(n-2);
 * valores iniciais:
 * F(1) = 1 ; F(2) = 1;
 */
class Fibonacci {
	
	int[] f;
	
	public Fibonacci() {
	
	}
	
	public Fibonacci(int tamanho[]) {
		this.f = tamanho;
	}

	public int calculaFibonacci(int n) {
		if (n < 2) {
			return 1;
		}
		return this.calculaFibonacci(n-1) + this.calculaFibonacci(n-2);
	}

	public int calculaFibonacci2(int n) {

		return n < 2 ? 1 : this.calculaFibonacci2(n-1) + this.calculaFibonacci2(n-2);
	}

	public int calculaFibonacci3(int n) {
		if (n < 2) {
			return this.f[n] = 1;
		}
		return this.f[n] == 0 ? this.f[n] = this.calculaFibonacci3(n-1) + this.calculaFibonacci3(n-2):
								this.f[n];
	}							
}

public class EstruturaRecursao {

	public static void main(String[] args) {

		long inicio, fim;

		// SEM RECURSAO
		int n1 = 0;
		int n2 = 1;
		int fibonacci;
		inicio = System.currentTimeMillis();
		System.out.print("Série de fibonacci: ");
		do {
			fibonacci = n2 + n1;
			if (fibonacci < 2) {
				System.out.print(fibonacci + " ");
			} else {
				System.out.print(fibonacci + " ");
			}
			n1 = n2;
			n2 = fibonacci;
		} while(fibonacci <= 14000000);
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: " + (fim - inicio)/1000.0 + "\n");

		//COM RECURSAO
		Fibonacci fibo = new Fibonacci();
		int resultado = 0;
		inicio = System.currentTimeMillis();
		System.out.print("Com recursão: ");
		for (int i = 0; i <= 35; i++) { 
			resultado = fibo.calculaFibonacci2(i); 
			System.out.print(resultado + " "); 
		}
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: " + (fim - inicio)/1000.0 + "\n");

		//RECURSAO COM ARRAY
		fibo = new Fibonacci(new int[100]);
		resultado = 0;
		inicio = System.currentTimeMillis();
		System.out.print("Recursão com array: ");
		for (int i = 0; i <= 35; i++) { 
			fibo.calculaFibonacci3(i); 
			System.out.print(fibo.f[i] + " "); 
		}
		
		for (int i = 0; i <= 35; i++) { 
			System.out.print(fibo.f[i] + " "); 
		}
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: " + (fim - inicio)/1000.0 + "\n");
	}

}
