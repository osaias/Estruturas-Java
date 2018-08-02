
public class OperadoresDeIncremento {

	public static void main(String[] args) {
		//pós-incremento
		int i = 1;
		int x = i++;
		int y = i++;
		System.out.println("No pós-incremento o x vale "+x);
		System.out.println("No pós-incremento o y vale "+y);

		//pre-incremento
		i = 1;
		x = ++i;
		y = ++i;
		System.out.println("No pre-incremento o x vale "+x);
		System.out.println("No pre-incremento o y vale "+y);

		//pós-desincremento
		i = 1;
		x = i--;
		y = i--;
		System.out.println("No pós-desincremento o x vale "+x);
		System.out.println("No pós-desincremento o y vale "+y);

		//pre-desincremento
		i = 1;
		x = --i;
		y = --i;
		System.out.println("No pre-desincremento o x vale "+x);
		System.out.println("No pre-desincremento o y vale "+y);

	}

}
