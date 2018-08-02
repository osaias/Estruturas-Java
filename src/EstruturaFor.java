import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EstruturaFor {

	public static void main(String[] args) {
		//Testando o for
		for(int c=1;c<=10;c++){
			System.out.print(c +" ");			
		}
		System.out.println(".");
		System.out.println("Aqui a variavel c não existe mais");
		System.out.println("pois a variavel está fora de escopo do for");

		//Testando o for each
		//Iterator 
		List<String> lista = new ArrayList<String>();
		lista.add("obj 1");
		lista.add("obj 2");
		lista.add("obj 3");

		for (Iterator i = lista.iterator(); i.hasNext(); System.out.println(i.next()));
		//System.out.println(i.next());

		//For each a partir do java 5
		List<String> lista2 = new ArrayList<String>();
		lista2.add("obj 4");
		lista2.add("obj 5");
		lista2.add("obj 6");

		for (String i : lista2)
			System.out.println(i);

		//for each com matriz
		int matriz[][] = new int[3][2];

		for (int[] vetor1 : matriz) {
			for (int elemento : vetor1) {
				System.out.print(elemento + " ");
			}
			System.out.println(".");
		}

		//Testando as coleções
		List<List<String>> colGeral = new ArrayList<List<String>>();

		for (int i = 0; i< 3; i++) {
			List<String> colUn = new LinkedList<String>();
			colGeral.add(colUn);
		}
		System.out.println(colGeral);

		List<String> colUn = colGeral.get(0);
		colUn.add("ab");
		colUn.add("cd");
		colUn.add("ef");

		colUn = colGeral.get(2);
		colUn.add("gh");
		colUn.add("ij");
		colUn.add("lm");
		System.out.println(colGeral);

		List<String> cols = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			cols.addAll(colGeral.get(i));
		}
		System.out.println(cols);

	}

}
