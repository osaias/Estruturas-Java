import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FuncoesJava {

	public static void main(String[] args) {
		//Gerar um numero aleatorio
		java.util.Random gerador= new java.util.Random();
		double n1 = gerador.nextDouble() * 25;
		int n2 = gerador.nextInt(25);
		System.out.println("n1 = " + n1 + " n2 = " + n2);
		
		//Tratar entradas do teclado
		//InputStream dispositivo = System.in;
		//Scanner teclado = new Scanner(new InputStreamReader(System.in));
		Scanner teclado = new Scanner(System.in);
		String teste = teclado.nextLine();
		System.out.println(teste);
		
		//M�todo isEmpty
		String t = "";
		if (t.isEmpty()) {
			System.out.println("Vari�vel est� vazio.");
		} else {
			System.out.println("Variavel n�o est� vazio.");
		}
		
		//Posi��o numa String
		String txt = "ABCDEF";
		System.out.println(txt.indexOf("D"));
		System.out.println(txt.charAt(3));
		System.out.println(Character.forDigit(3,10));
	}
}
