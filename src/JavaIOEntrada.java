import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class JavaIOEntrada {

	public static void main(String[] args) throws IOException {

		//Lendo do arquivo...
		InputStream obj = new FileInputStream("C:/Users/USUARIO/Desktop/ArquivosEclipse/Arquivo.txt");
		InputStreamReader decodificador = new InputStreamReader(obj);
		BufferedReader conecChar = new BufferedReader(decodificador); 
		
		//int n = decodificador.read();// lê o 1º caracter.
		String s = conecChar.readLine();// lê 1º linha
		
		while(s != null) {
			System.out.println(s);
			s = conecChar.readLine();
		}
		conecChar.close();
		
		//lendo do teclado...
		InputStream obj2 = System.in;
		InputStreamReader decodificador2 = new InputStreamReader(obj2);
		BufferedReader conecChar2 = new BufferedReader(decodificador2); 
		
		String s2 = conecChar2.readLine();// lê 1º linha
		
		while(s2 != null) {
			System.out.println(s2);
			s2 = conecChar2.readLine();
		}
		conecChar2.close();
		
	}

}

