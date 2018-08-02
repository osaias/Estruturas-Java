import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class JavaIOSaida {

	public static void main(String[] args) throws IOException {
		//Escrevendo arquivo...
		OutputStream obj3 = new FileOutputStream("C:/Users/USUARIO/Desktop/ArquivosEclipse/Arquivo2.txt",false);
		OutputStreamWriter decod = new OutputStreamWriter(obj3);
		BufferedWriter rw = new BufferedWriter(decod);
		//try (BufferedWriter rw = new BufferedWriter(new FileWriter("C:/Users/USUARIO/Desktop/ArquivosEclipse/Arquivo2.txt"))) {

		String s = "Isso ai molecote. O dia está bonito hoje. Vamos arrasar. Com Deus na frente, já deu tudo certo.";
		String mostrar = " ";
		while(!s.isEmpty()) {
			mostrar = s.substring(0,s.indexOf(".")+1);// o 2º parametro é a qtd.
			rw.write(mostrar);
			rw.newLine();
			s = s.substring(s.indexOf(".")+1); //retorna index 1. 
		}
		rw.close();

		//Captando do teclado e escvevendo no arquivo...
		Scanner sc  = new Scanner(System.in);
		PrintStream ps = new PrintStream("C:/Users/USUARIO/Desktop/ArquivosEclipse/Arquivo3.txt");

		while (sc.hasNextLine()) {
			ps.println(sc.nextLine());
		}

		ps.close();

		//Lendo arquivo e escrevendo em outro arquivo...
		BufferedReader rd = new BufferedReader(
				new InputStreamReader (
						new FileInputStream("C:/Users/USUARIO/Desktop/ArquivosEclipse/Arquivo3.txt")));
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("C:/Users/USUARIO/Desktop/ArquivosEclipse/Arquivo4.txt")));
		
		String linha = rd.readLine();
		
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = rd.readLine();
		}
		
		rd.close();
		bw.close();
	}
}
